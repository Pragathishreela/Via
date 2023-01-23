package Assignment_01;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToCloseOnlyTheParentWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praga/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
