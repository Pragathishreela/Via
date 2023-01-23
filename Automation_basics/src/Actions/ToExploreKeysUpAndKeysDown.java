package Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToExploreKeysUpAndKeysDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver, 15);
		driver.get("https://www.woodenstreet.com/");
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("loginclose1")));
		driver.findElement(By.id("loginclose1")).click();
		String parentUrl = driver.getCurrentUrl();
		System.out.println(parentUrl);
		List<WebElement> navBar = driver.findElements(By.xpath("//li[contains(@class,'menu-show')]"));
		Actions action = new Actions(driver);
		for(WebElement i : navBar) {
			action.keyDown(Keys.CONTROL).click(i).perform();
		}
		action.keyUp(Keys.CONTROL).perform();
		
		
		
	}
}
