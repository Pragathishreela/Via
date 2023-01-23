package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	public static String fromPropertyFile(String key) {

		File path = new File("./testData/configuration.properties");
		FileInputStream fis=null;
		Properties property = null ;
		try {
			fis = new FileInputStream(path);
			property = new Properties();
			property.load(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return property.getProperty(key);
	}
	public static String fromExcelFileString(String sheetName,int rowNumber,int colNumber) {
		FileInputStream fis = null;
		File path1 = new File("./testData/Test.xlsx");
		Workbook workbook = null;
		try {
			fis = new FileInputStream(path1);
			workbook= WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNumber).getCell(colNumber).getStringCellValue();
	}
	public static boolean fromExcelFileBoolean(String sheetName,int rowNumber,int colNumber) {
		FileInputStream fis = null;
		File path1 = new File("./testData/Test.xlsx");
		Workbook workbook = null;
		try {
			fis = new FileInputStream(path1);
			workbook= WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNumber).getCell(colNumber).getBooleanCellValue();
	}
	public static double fromExcelFileNumber(String sheetName,int rowNumber,int colNumber) {
		FileInputStream fis = null;
		File path1 = new File("./testData/Test.xlsx");
		Workbook workbook = null;
		try {
			fis = new FileInputStream(path1);
			workbook= WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNumber).getCell(colNumber).getNumericCellValue();
	}
	public static LocalDateTime fromExcelFileLocalDateTime(String sheetName,int rowNumber,int colNumber) {
		FileInputStream fis = null;
		File path1 = new File("./testData/Test.xlsx");
		Workbook workbook = null;
		try {
			fis = new FileInputStream(path1);
			workbook= WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNumber).getCell(colNumber).getLocalDateTimeCellValue();
	}
}
