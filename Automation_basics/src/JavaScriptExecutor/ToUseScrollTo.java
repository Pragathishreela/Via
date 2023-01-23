package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseScrollTo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://online.kfc.co.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//driver.findElement(By.xpath("//img[@alt='Google Play']")).click();
		js.executeScript("window.scrollTo(1171,2365);");
	}
}
