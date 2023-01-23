package pop_ups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleCalenderPopUps {
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime systemTimeDate = LocalDateTime.now().plusMonths(2);//we can test for all the days years month by using plus minus
		String monthName = systemTimeDate.getMonth().name();
		System.out.println(monthName);
		String name = monthName.substring(1,monthName.length());
		System.out.println(name);
		String lname = name.toLowerCase();
		System.out.println(lname);
		String monthName1 = ""+monthName.charAt(0)+lname;
		System.out.println(monthName1);
		int year = systemTimeDate.getYear();
		System.out.println(year);
		int day = systemTimeDate.getDayOfMonth();
		System.out.println(day);
		String format = ""+monthName.charAt(0)+monthName.substring(1,monthName.length()).toLowerCase()+" "+year;
		System.out.println(format);
		
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Actions action = new Actions(driver);
		WebDriverWait explicit = new WebDriverWait(driver, 15);
		action.click().perform();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		for(;;) {
			try {
		driver.findElement(By.xpath("//div[text()='"+monthName1+" "+year+"']/../..//p[text()='"+day+"']")).click();
		break;
		}
		catch(Exception e){
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		}*/
		
	}
}
