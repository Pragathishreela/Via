package Assignment_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class trelloDragAndDrop {
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
		driver.findElement(By.xpath("//div[text()='Mocks']")).click();
		WebElement manual = driver.findElement(By.xpath("//span[text()='mock completed']"));
		WebElement java = driver.findElement(By.xpath("//span[text()='mock scheduled']"));
		WebElement selenium = driver.findElement(By.xpath("(//span[text()='mock pending'])[1]"));
		WebElement api = driver.findElement(By.xpath("(//span[text()='mock pending'])[2]"));
		WebElement toReleaseAtjava = driver.findElement(By.xpath("(//span[text()='Add a card'])[2]"));
		WebElement toReleaseAtSelenium = driver.findElement(By.xpath("(//span[text()='Add a card'])[3]"));
		WebElement toReleaseAtApi = driver.findElement(By.xpath("(//span[text()='Add a card'])[4]"));
		Actions action = new Actions(driver);
		action.dragAndDrop(api, toReleaseAtjava).perform();
		action.dragAndDrop(selenium, toReleaseAtSelenium).perform();
		//action.dragAndDrop(api, toReleaseAtApi).perform();
		
	}
}
