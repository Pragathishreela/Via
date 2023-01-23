package Assignment_01;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheUrlPageSourceTitleOfTheFlipkartWebsite {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
		String currentUrlOfThePage = driver.getCurrentUrl();
		System.out.println(currentUrlOfThePage);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
}

