package AdvanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class ToOpendifferentBrowser {
	@Test
	public void openBrowsers() {
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
	}
}
