package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheSourceCodeOfThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String SourceCodeOfThePage = driver.getPageSource();
		System.out.println(SourceCodeOfThePage);
		driver.close();
	}

}
