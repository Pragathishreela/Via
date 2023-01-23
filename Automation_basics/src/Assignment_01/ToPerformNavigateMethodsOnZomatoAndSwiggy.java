package Assignment_01;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToPerformNavigateMethodsOnZomatoAndSwiggy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		driver.get("https://www.swiggy.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		/*Navigation navigation = driver.navigate();//by creating reference
		navigation.forward();
		navigation.back();
		navigation.refresh();*/
		Thread.sleep(3000);
		driver.quit();
	}
}
