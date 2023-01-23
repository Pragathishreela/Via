package Assignment_01;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToResizeTheWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Dimension toResize = new Dimension(100,200);
		driver.manage().window().setSize(toResize);
		driver.quit();
	}
}
