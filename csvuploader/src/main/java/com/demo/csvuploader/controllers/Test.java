package com.demo.csvuploader.controllers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.demo.csvuploader.models.Transfer;

public class Test {

/*	public static void main(String[] args) {
		Transfer transfer = new Transfer();
		Class<?> aClass = transfer.getClass();
		Class<?>[] paramTypes = new Class[1];
		paramTypes[0] = String.class;
		
		String methodName = "set" + "Identifier";
		
		Method m = null;
		
		try {
			m = aClass.getMethod(methodName, String.class);
		} catch (NoSuchMethodException e){
			e.printStackTrace();
		}
		
		try {
			m.invoke(transfer, "200");
			System.out.println(transfer.getIdentifier());
		} catch (IllegalAccessException iae) {
		    iae.printStackTrace();
		} catch (InvocationTargetException ite) {
		    ite.printStackTrace();
		}
		
	}*/
	
/*	public static void main(String[] args) {
		String filename = "ankit2.csv";
		String[] ext = filename.split("\\.");
		System.out.println("Last digit: " + ext[ext.length - 1]);
		String extension = ext[ext.length-1].trim();
		String csv = "csv";
		
		extension = csv;
		
		if(extension != csv) System.out.println("checking operator");
		
		if( !("csv".equals(csv)) ) {
			System.out.println("object compare using operator.");
		}
		
		if(!(extension.equals("csv"))) {
			System.out.println("Not equal to!");
		}else {
			System.out.println("Equal to!");
		}
	}
	*/
}
