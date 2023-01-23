package foods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_Foods_001 {
	@Parameters({"browserName","URL"})
	@Test(groups = "smoke")
	public void meghanaFoods(@Optional() String bname, String URL) {//optional ("hi") if you run this from class file it will take as hi. from xml file it will take chrome
		WebDriver driver = null;
		if(bname.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else {
			//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(URL);
		driver.quit();
		////a[text()='Gaming']/../../../../../..//div[text()='Electronics']
	}
}