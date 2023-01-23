package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseScrollBy {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.kfc.co.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(;;) {
			try {
				driver.findElement(By.xpath("//span[text()='Legal']")).click();
				break;
			}
			catch(Exception e) {
				js.executeScript("window.scrollBy(0,150);");
			}
		}
		//WebElement elementToView = driver.findElement(By.xpath("//span[text()='Legal']"));
	}
}