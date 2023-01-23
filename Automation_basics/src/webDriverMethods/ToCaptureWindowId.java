package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureWindowId {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
		String windowHandleOfThePage = driver.getWindowHandle();
		System.out.println(windowHandleOfThePage);
		//System.out.println(driver.getWindowHandle());
		driver.close();
		
		
	}
}
