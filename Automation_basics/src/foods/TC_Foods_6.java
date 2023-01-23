package foods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Foods_6 {
	@Test
	public void meghanaFoods() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.kfc.co.in/");
		driver.quit();
	}
}