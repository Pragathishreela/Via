package Assignment_01;
import java.util.Arrays;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToGetTheTitlesAndCloseTheWindowsInAlphabeticalOrder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praga/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		Set<String> windowIds = driver.getWindowHandles();
		for(String windowId : windowIds) {
			driver.switchTo().window(windowId);
			String titleOfThePage = driver.getTitle();
			char charArray[] = titleOfThePage.toCharArray();
			Arrays.sort(charArray);
			System.out.println(new String(titleOfThePage));
			driver.close();
		}
		driver.quit();
	}
}
