package asserts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToExploreSoftAssertInFirelawn {
	@Test
	public void loginPage() throws InterruptedException {
		String expectedUrl = "https://firelawn.com/";
		String expectedTitle = "Firelawn";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://firelawn.com/");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(expectedUrl, driver.getCurrentUrl(),"incorrect URL");
		sa.assertEquals(expectedTitle, driver.getTitle(), "incorrect title");
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		explicitWait.until(ExpectedConditions.visibilityOf(loginButton));
		//loginButton.click();
		String expectedLoginButtonBackgroundColor = loginButton.getCssValue("background-color");
		System.out.println(loginButton.getCssValue("background-color"));
		sa.assertEquals(expectedLoginButtonBackgroundColor, loginButton.getCssValue("background-color"), "incorrect color");
		
	}
}
