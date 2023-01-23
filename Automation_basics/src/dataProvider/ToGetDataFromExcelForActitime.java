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

public class ToGetDataFromExcelForActitime {
	@DataProvider
	public String[][] userData() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(new File("./testData/Test.xlsx"));
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet actiTimeSheet = workbook.getSheet("TestDataForACtitime");
		int rowCount = actiTimeSheet.getPhysicalNumberOfRows();
		int cellCount = actiTimeSheet.getRow(0).getPhysicalNumberOfCells();
		String data[][]=new String[rowCount][cellCount];
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				data[i][j]=actiTimeSheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
	@Test(dataProvider = "userData")
	public void actiTimeLogin(String[] details) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(details[0],Keys.TAB);
		driver.switchTo().activeElement().sendKeys(details[1],Keys.ENTER);
		//driver.quit();
	}
}
