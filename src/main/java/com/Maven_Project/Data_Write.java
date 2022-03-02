package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Write {
	private static void write_Data() throws IOException {
		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Maven_Project\\Excel\\Kowc.xlsx");
				FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("kowc2").createRow(0).createCell(0).setCellValue("JAVA");
		wb.getSheet("kowc2").getRow(0).createCell(1).setCellValue("SELENIUM");
		wb.getSheet("kowc2").createRow(1).createCell(0).setCellValue("TestNG");
		wb.getSheet("kowc2").getRow(1).createCell(1).setCellValue("CUCUMBER FRAMEWORK");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
              System.out.println("Write Data SuccesFull");

	}
	public static void main(String[] args) throws IOException {
		write_Data();
	}
	
}
