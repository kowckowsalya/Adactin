package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {
	 
	private void driven() throws IOException {
		
		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Maven_Project\\Excel\\Kowc.xlsx");
		FileInputStream finp = new FileInputStream (f);
	
		
		Workbook wb = new XSSFWorkbook (finp);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(0);
        CellType cellType = cell.getCellType();//Enum/enumerator
        if (cellType.equals(CellType.STRING)) {
		String SCV = cell.getStringCellValue();	
		System.out.println(SCV);
		}
        else if (cellType.equals(CellType.NUMERIC)) {
		double NCV = cell.getNumericCellValue();	
		System.out.println(NCV);
		}
	}
	 public static void main(String[] args) throws IOException {
		 Data_Driven dd = new Data_Driven();
		 dd.driven();
		
	}
	
}
