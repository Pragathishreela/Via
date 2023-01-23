package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class WoodenStreetPage {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		int index = sc.nextInt();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(15000);
		driver.findElement(By.id("loginclose1")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@title='Study Table']")).click();
		String costOfTheProduct = driver.findElement(By.xpath("(//strong[contains(text(),'Rs')])["+index+"]")).getText();
		System.out.println("costOfTheProduct : "+costOfTheProduct);
		costOfTheProduct= costOfTheProduct.replace("Rs","");
		costOfTheProduct= costOfTheProduct.replace(",","");
		costOfTheProduct = costOfTheProduct.trim();
		int cost = Integer.parseInt(costOfTheProduct);    
		if(cost>10000) {
			System.out.println("Price is too high");
		}
		else {
			driver.findElement(By.xpath("(//p[text()=' Add to Cart'])["+index+"]")).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Cart']")).click();
	}
}