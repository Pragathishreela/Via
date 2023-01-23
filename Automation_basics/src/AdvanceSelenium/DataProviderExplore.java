package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExplore {
	@DataProvider(parallel = true)
	/*public String[] data() {
		String s[] = {"https://magicpin.in/","https://online.kfc.co.in/","https://meghanafoods.co.in/","https://www.dominos.co.in/","https://firelawn.com/"};
		return s;
	}*/
	@Test
	public String[][] excelTestData(){
		String [][]s= {{"admin","manager"},{"trainee","trainee"}};
		return s;
	}
	@Test(dataProvider = "excelTestData")
	public void actiTimeLogin(String[] details) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(details[0],Keys.TAB);
		driver.switchTo().activeElement().sendKeys(details[1],Keys.ENTER);
		driver.quit();
	}
}