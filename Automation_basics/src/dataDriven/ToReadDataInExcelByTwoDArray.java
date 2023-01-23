package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadDataInExcelByTwoDArray {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(new File("./testData/Test.xlsx"));
		//Workbook workbook = WorkbookFactory.create(fis);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet infoSheet = workbook.getSheet("StudentInfo");
		int rowCount = infoSheet.getPhysicalNumberOfRows();
		int colCount = infoSheet.getRow(0).getPhysicalNumberOfCells();
		
		//two D array
		String[][] sarr = new String[rowCount][colCount];
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				sarr[i][j] = infoSheet.getRow(i).getCell(j).toString();
			}
		}
		for(String arr[] :sarr) {
			for(String data : arr) {
				System.out.print(data+", ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
