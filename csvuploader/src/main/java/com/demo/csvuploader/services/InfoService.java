package com.demo.csvuploader.services;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.demo.csvuploader.data.entities.TransferEntity;
import com.demo.csvuploader.data.repositories.InfoTransferRepository;
import com.demo.csvuploader.mappers.ColumnMapper;
import com.demo.csvuploader.mappers.ModelAndEntityMapper;
import com.demo.csvuploader.responses.ResponseToClient;
import com.opencsv.CSVReader;

@Service
public class InfoService {

	@Autowired
	InfoTransferRepository infoTransferRepository;

	@Autowired
	ModelAndEntityMapper infoMapper;

	@Autowired
	ColumnMapper columnMapper;

	public List<TransferEntity> getInfo() {
		List<TransferEntity> list = new ArrayList<>();
		infoTransferRepository.findAll().forEach(i -> list.add(i));
		return list;
	}

	@SuppressWarnings("resource")
	public ResponseToClient addInfo(MultipartFile file)
			throws IllegalStateException, IOException, NumberFormatException, Exception {

		File convertedFile = this.convert(file);
		CSVReader reader = new CSVReader(new FileReader(convertedFile));
		List<String> dbNamesMappedFromCsvColNames = new ArrayList<>();
		String[] firstLine = reader.readNext();

		if (firstLine.length + 2 != infoTransferRepository.findNumberOfColumns()) { // The reason behind " +2 " is
																					// addition of auto-created "id" and
																					// "dateCreated" fields in the DB through TransferEntity.
			throw new Exception(
					"Number of columns in the excel sheet does not match with the number of columns in the database. Hence, uploaded file cannot be read and entered into the database.");
		}

		for (int i = 0; i < firstLine.length; i++) {
			dbNamesMappedFromCsvColNames.add(columnMapper.getMappedDbColName(firstLine[i].trim()));
		}

		String[] values = null;
		int i = 0;
		while ((values = reader.readNext()) != null) {
			int counter = 0;
			TransferEntity transferEntity = new TransferEntity();
			Class<?> classToBeUsed = transferEntity.getClass();
			Method methodToBeInvoked = null;
			while (counter < dbNamesMappedFromCsvColNames.size()) {
				try {
					methodToBeInvoked = classToBeUsed.getMethod(dbNamesMappedFromCsvColNames.get(counter),
							String.class);
				} catch (NoSuchMethodException exception) {
					exception.printStackTrace();
				}
				try {
					methodToBeInvoked.invoke(transferEntity, values[counter]);
				} catch (IllegalAccessException iae) {
					iae.printStackTrace();
				} catch (InvocationTargetException ite) {
					ite.printStackTrace();
				}
				counter++;
			}

			infoTransferRepository.save(transferEntity);
			System.out.println("Row " + (i++) + " saving to the database.");
		}
		reader.close();
		

		// Deleting the uploaded file.
		if (convertedFile.exists()) {
			System.out.println("File is deleted: " + convertedFile.delete());
		} else {
			System.out.println("No file found to delete.");
		}
		
		ResponseToClient responseToClient = new ResponseToClient();
		responseToClient.setFileName(file.getOriginalFilename());
		responseToClient.setMessage("Contents of " + responseToClient.getFileName() + " was successfully saved in Maria DataBase.");
		return responseToClient;
	}

	private File convert(MultipartFile file) throws IllegalStateException, IOException {
		File newFile = new File(file.getOriginalFilename());
		newFile.createNewFile();
		FileOutputStream fos = new FileOutputStream(newFile);
		fos.write(file.getBytes());
		fos.close();
		// can use this as well: "file.transferTo(newFile);"
		System.out.println("file converted from MultipartFile to File type");
		return newFile;
	}

}
