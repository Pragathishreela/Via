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

public class trelloApplication {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		driver.get("https://trello.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("user")).sendKeys("pragathi22032000@gmail.com",Keys.ENTER);
		explicitwait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		driver.switchTo().activeElement().sendKeys("Pragathi@9108",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='ElF42']")).click();
		WebElement manual = driver.findElement(By.xpath("//span[text()='Manual']"));
		Actions action = new Actions(driver);
		action.contextClick(manual).perform();
		/*for(int i=0;i<8;i++) {
			WebElement output = driver.findElements(By.xpath("//a[contains(@class,'quick-card')]")).get(i);
			System.out.println(output.getText());
		}*/
		List<WebElement> element = driver.findElements(By.xpath("//a[contains(@class,'quick-card')]"));
		for(WebElement i: element) {
			System.out.println(i.getText());
		}
	}
}
