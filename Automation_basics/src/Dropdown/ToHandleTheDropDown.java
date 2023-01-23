package Dropdown;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.Select;

public class ToHandleTheDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement dayDropDown = driver.findElement(By.id("day"));
		WebElement dateDropDown = driver.findElement(By.id("month"));
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select daySelect = new Select(dayDropDown);
		System.out.println(daySelect.isMultiple());
		daySelect.selectByVisibleText("4");
		daySelect.selectByIndex(21);
		daySelect.selectByValue("4");
		List<WebElement> days = daySelect.getOptions();
		for(WebElement i : days) {
			System.out.print(i.getText()+",");//it will print address so u gave to get the text which is inside
		}
		//System.out.println(days); because it returns address of webelements
		driver.quit();
	}
	
	
}
