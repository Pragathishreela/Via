package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import genericLibrary.ReadData;

public class ToReadDataFromExcel {
	public static void main(String[] args) throws IOException {
		
		//creating input stream type object
		File path1 = new File("./testData/Test.xlsx");
		FileInputStream fis = new FileInputStream(path1);
		
		//create workbook object
		//Workbook workbook = new XSSFWorkbook(fis);
		Workbook workbook = WorkbookFactory.create(fis);
		String name = workbook.getSheet("Test").getRow(1).getCell(1).getStringCellValue();//sheet name
		System.out.println(name);
		double number = workbook.getSheet("Test").getRow(1).getCell(2).getNumericCellValue();
		//String number = workbook.getSheet("Test").getRow(1).getCell(2).getStringCellValue();
		System.out.println(number);
		boolean boolean1 = workbook.getSheet("Test").getRow(1).getCell(3).getBooleanCellValue();
		System.out.println(boolean1);
		String fromClass = ReadData.fromExcelFileString("Test", 1, 1);
		System.out.println(fromClass);
		double fromClassNumber = ReadData.fromExcelFileNumber("Test", 1, 2);
		System.out.println(fromClassNumber);
		boolean fromClassboolean = ReadData.fromExcelFileBoolean("Test", 1, 3);
		System.out.println(fromClassboolean);
		System.out.println(ReadData.fromExcelFileLocalDateTime("Test", 2, 2).getDayOfMonth());
		
	}
}
