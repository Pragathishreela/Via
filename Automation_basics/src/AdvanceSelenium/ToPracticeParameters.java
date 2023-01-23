package AdvanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToPracticeParameters {
	@Parameters("URL")
	@Test
	public void foods(@Optional("https://meghanafoods.co.in/") String a) {
		WebDriver driver = new ChromeDriver();
		driver.get(a);
		driver.quit();
	}
}