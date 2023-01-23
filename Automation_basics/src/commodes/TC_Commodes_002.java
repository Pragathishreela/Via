package commodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Commodes_002 {
	@Test
	public void meghanaFoods() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.britannica.com/topic/commode-furniture");
		driver.quit();
	}

}
