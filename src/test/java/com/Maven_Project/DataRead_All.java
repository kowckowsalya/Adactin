package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead_All {
	    private static void all_Data() throws IOException {
File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Maven_Project\\Excel\\Kowc.xlsx");
FileInputStream fis = new FileInputStream(f);
Workbook p = new XSSFWorkbook(fis);
Sheet SA = p.getSheetAt(0);
int PNR = SA.getPhysicalNumberOfRows();
for (int i = 0; i < PNR; i++) {
	Row row = SA.getRow(i);
	int PNC = row.getPhysicalNumberOfCells();
	for (int j = 0; j < PNC; j++) {
		Cell cell = row.getCell(j);
		CellType CT = cell.getCellType();
		if (CT.equals(CellType.STRING)) {
			String SCV1 = cell.getStringCellValue();
			System.out.println(SCV1);
		}
		else if (CT.equals(CellType.NUMERIC)) {
			double NCV = cell.getNumericCellValue();
			int va = (int) NCV;
			System.out.println(va);
		}
	}
	
}
		}
	    public static void main(String[] args) throws IOException {
			all_Data();
		}
	}


