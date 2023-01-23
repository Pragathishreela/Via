package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dragAndDrop_clickAndRelease {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebDriverWait explicitwait = new WebDriverWait(driver, 1);
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frameElement);

		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

		WebElement Trash = driver.findElement(By.id("trash"));
		Actions action = new Actions(driver);

		action.dragAndDrop(image1, Trash).perform();
		explicitwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h5[text()='High Tatras']")));
		action.dragAndDrop(image2, Trash).perform();
		explicitwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h5[text()='High Tatras 2']")));
		action.dragAndDrop(image3, Trash).perform();
		explicitwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h5[text()='High Tatras 3']")));
		action.dragAndDrop(image4, Trash).perform();
		explicitwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h5[text()='High Tatras 4']")));
		WebElement trash1 = driver.findElement(By.id("gallery"));

		action.dragAndDrop(image1, trash1).perform();
		action.dragAndDrop(image2, trash1).perform();
		action.dragAndDrop(image3, trash1).perform();
		action.dragAndDrop(image4, trash1).perform();

		driver.switchTo().defaultContent();
		driver.findElement(By.id("Accepted Elements")).click();

		WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));//takecare and change the path
		driver.switchTo().frame(frame2);
		WebElement textImage = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement drop = driver.findElement(By.id("droppable"));
		action.dragAndDrop(textImage, drop).perform();
		System.out.println(drop.getText());





	}
}
