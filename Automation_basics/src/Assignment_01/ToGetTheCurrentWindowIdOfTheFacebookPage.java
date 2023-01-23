package Assignment_01;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToGetTheCurrentWindowIdOfTheFacebookPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);		
	}
}
