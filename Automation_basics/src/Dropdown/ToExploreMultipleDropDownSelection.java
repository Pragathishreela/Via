package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToExploreMultipleDropDownSelection {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/win10/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/dropDown.html");
		WebElement multipleDropDowns = driver.findElement(By.id("m1"));
		Select multidd = new Select(multipleDropDowns);
		System.out.println(multidd.isMultiple());
		List<WebElement> allOptions = multidd.getOptions();
		for(WebElement i : allOptions) {
			System.out.print(i.getText()+",");
		}
		System.out.println();
		System.out.println("____________________________________________________");
		multidd.selectByIndex(0);
		multidd.selectByValue("2");
		multidd.selectByVisibleText("Grapes");
		List<WebElement> allSelectedOptions = multidd.getAllSelectedOptions();
		for(WebElement i:allSelectedOptions) {
			System.out.println(i.getText());
		}
		multidd.deselectByIndex(0);
		System.out.println("____________________________________________________");
		List<WebElement> allSelectedOption = multidd.getAllSelectedOptions();
		for(WebElement i:allSelectedOption) {
			System.out.println(i.getText());
		}
		System.out.println("____________________________________________________");
		multidd.selectByIndex(4);
		multidd.deselectByValue("2");
		multidd.deselectByVisibleText("Grapes");
		multidd.deselectAll();
		List<WebElement> allSelectedOptio = multidd.getAllSelectedOptions();
		for(WebElement i:allSelectedOptio) {
			System.out.println(i.getText());
		}
		driver.quit();
	}
}
