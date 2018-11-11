package com.demo.csvuploader.responses;

import org.springframework.stereotype.Component;

@Component
public class ResponseToClient {

	String fileName;
	String message;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}	
}
