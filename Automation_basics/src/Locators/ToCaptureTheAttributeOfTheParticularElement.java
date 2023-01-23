package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheAttributeOfTheParticularElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//To capture the value from textfield
			/*driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
			WebElement usernameTf = driver.findElement(By.xpath("//input[@name='username']"));
			usernameTf.clear();
			usernameTf.sendKeys("Pragathi");
			String attriValue = usernameTf.getAttribute("value");
			System.out.println(attriValue);*/
		//To get tooltip text
		/*driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		String toolTip = driver.findElement(By.xpath("//a[@title='Sign in with Twitter']")).getAttribute("title");
		System.out.println(toolTip);*/
			
	}
}
