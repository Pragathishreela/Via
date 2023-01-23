package Locators;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheCostOfSecondProductInSwiggy {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		String nameOfTheRestaurant = sc.nextLine();
		String enterTheindex = sc.nextLine();
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("mobile")).sendKeys("9108314459",Keys.ENTER);
		Thread.sleep(25000);
		driver.findElement(By.id("otp")).sendKeys(Keys.ENTER);
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[@title='View Account']")).click();
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']")).sendKeys(nameOfTheRestaurant,Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img)["+enterTheindex+"]")).click();
		Thread.sleep(4000);
		String costOfTheBiryani = driver.findElement(By.xpath("(//span[@class=\"rupee\"])["+enterTheindex+"]")).getText();
		System.out.println(costOfTheBiryani);
		Thread.sleep(1000);
		int cost = Integer.parseInt(costOfTheBiryani);
		if(cost>200) {
			System.out.println("Cost is bit high");
		}
		else {
			driver.findElement(By.xpath("(//div[contains(text(),'ADD')])["+enterTheindex+"]")).click();
		}
		Thread.sleep(5000);	 
	}
}
