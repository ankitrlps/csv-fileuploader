package com.demo.csvuploader.controllers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.demo.csvuploader.data.entities.TransferEntity;
import com.demo.csvuploader.responses.ResponseToClient;
import com.demo.csvuploader.services.InfoService;
import com.opencsv.CSVReader;

@RestController
@RequestMapping("/csvupload")
public class InfoController {

	@Autowired
	InfoService infoService;

	CSVReader csvReader = null;
	
	ResponseToClient responseToClient; 
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getHomePage() {
		return new ModelAndView("upload");
	}
	
/*	We can also write like this(performs same as above method): 
 * 
 * @RequestMapping(value="/login", method=RequestMethod.GET)
 * public String viewAnyPage(ModelMap model){
 * 		return "anyViewPage";
 * }
 * 
 * */
	
	@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*", maxAge=3600)
	@RequestMapping(value="/getInfo", method=RequestMethod.GET)
	public List<TransferEntity> getInfo() {
		return infoService.getInfo();
	}
	
	@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
	@RequestMapping(value="/uploadfile", method=RequestMethod.POST, consumes="multipart/form-data")
	public ResponseToClient add(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException, Exception {
		String[] fileNameSplit = file.getOriginalFilename().split("\\.");
		String extension = fileNameSplit[fileNameSplit.length - 1].trim(); 
		
		//for deleting the invalid files
		File deleteFile = new File(file.getOriginalFilename());
		file.transferTo(deleteFile);
		
		if( (!extension.equals("csv")) && (!extension.equals("xlsx")) ) {
			deleteFile.delete();
			throw new IOException("Uploaded file type is not valid.");
		}
		
		if(file.isEmpty()) {
			System.out.println("Empty File");
			responseToClient.setFileName(file.getOriginalFilename());
			responseToClient.setMessage("Contents of " + responseToClient.getFileName() + " was empty.");
			deleteFile.delete();
			return responseToClient;
		}else {
			System.out.println("reading the file");			
			responseToClient = infoService.addInfo(file);
			deleteFile.delete();
			return responseToClient;
		}
		
		
	}
}
