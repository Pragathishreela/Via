package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLaunchUrlsFromExcel {
	@DataProvider(parallel = true)
	public String[] userData() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(new File("./testData/Test.xlsx"));
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet actiTimeSheet = workbook.getSheet("urls");
		int rowCount = actiTimeSheet.getPhysicalNumberOfRows();
		String[] data=new String[rowCount];
		for(int i=0;i<rowCount;i++) {
			data[i]=actiTimeSheet.getRow(i).getCell(0).toString();
		}
		return data;
	}
	@Test(dataProvider = "userData")
	public void actiTimeLogin(String url) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get(url);
		driver.quit();
	}
}
