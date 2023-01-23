package Assignment_01;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class woodenStreet4thProduct {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		int index = sc.nextInt();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		driver.get("https://www.woodenstreet.com/");
		explicitwait.until(ExpectedConditions.elementToBeClickable(By.id("loginclose1")));
		driver.findElement(By.id("loginclose1")).click();
		Actions action = new Actions(driver);
		action.moveByOffset(405, 155).perform();
		Thread.sleep(6000);
		action.moveByOffset(0, 174).click().perform();
		String cost = driver.findElement(By.xpath("(//strong[contains(text(),'Rs')])[4]")).getText();
		cost = cost.replace(",", "");
		cost = cost.replace("Rs", "");
		cost = cost.trim();
		int costOfTheProduct = Integer.parseInt(cost);
		System.out.println(costOfTheProduct);
		if(costOfTheProduct>60000) {
			System.out.println("its too pricey");
		}
		else {
			WebElement addToCart = driver.findElement(By.xpath("(//p[contains(text(),'Add to Cart')])[4]"));
			action.moveToElement(addToCart).perform();
			action.click(addToCart);
		}
				
				
	}
}
