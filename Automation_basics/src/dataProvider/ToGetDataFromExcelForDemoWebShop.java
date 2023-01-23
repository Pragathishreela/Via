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

public class ToGetDataFromExcelForDemoWebShop {
	@DataProvider
	public String[][] detailsOfDemoWebShop() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(new File("./testData/Test.xlsx"));
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet demoDataSheet = workbook.getSheet("TestDataForDemoWebShop");
		int row = demoDataSheet.getPhysicalNumberOfRows()-1;
		int cell = demoDataSheet.getRow(0).getPhysicalNumberOfCells();
		String [][]s = new String[row][cell];
		for(int i=0;i<row;i++) {
			for(int j=0;j<cell;j++) {
				s[i][j]=demoDataSheet.getRow(i+1).getCell(j).toString();
			}
		}
		return s;
	}
	@Test(dataProvider = "detailsOfDemoWebShop")
	public void demoWebShop(String[]s) {
		System.out.println(s[0]);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-"+s[0])).click();
		driver.findElement(By.id("FirstName")).sendKeys(s[1],Keys.TAB);
		driver.switchTo().activeElement().sendKeys(s[2]+Keys.TAB);
		driver.switchTo().activeElement().sendKeys(s[3]+Keys.TAB);
		driver.switchTo().activeElement().sendKeys(s[4]+Keys.TAB);
		driver.switchTo().activeElement().sendKeys(s[5]+Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
	}
}