package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToExploreMoveToElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://firelawn.com/");
		WebElement kidsElement = driver.findElement(By.linkText("KIDS"));
		Actions action = new Actions(driver);
		/*action.moveToElement(kidsElement).perform();
		action.moveToElement(kidsElement,-121,135).click().perform();*/
		//action.moveByOffset(0,-134).click().perform();
		action.moveByOffset(732,127).perform();
		action.moveByOffset(-121,135).click().perform();
	}
}
