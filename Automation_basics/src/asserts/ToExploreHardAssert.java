package asserts;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ToExploreHardAssert {
	@Test
	public void loginAsAdmin() {
		String expectedLoginPageTitle = "actiTIME - Login";
		String userNameData = "admin";
		String passwordData = "manager";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		assertEquals(expectedLoginPageTitle, driver.getTitle(), "login page is not properly displayed");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(userNameData,Keys.TAB);
		assertEquals(userNameData, username.getAttribute("value"), "wrongly entered");
		WebElement password = driver.switchTo().activeElement();
		password.sendKeys(passwordData);
		assertEquals(passwordData,password.getAttribute("value"), "wrongly enterd");
		password.sendKeys(Keys.ENTER);
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		explicitwait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logo_aT"))));
		String nextPage = driver.getTitle();
		assertEquals(nextPage, "actiTIME - Enter Time-Track", "next page not correctly landed");
	}
}
