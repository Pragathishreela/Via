package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckTheAlignmentOfTheTextBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		/*System.out.println("size of username TextField"+userName.getSize());
		System.out.println("Location of username TextField"+userName.getLocation());
		System.out.println(password.getSize());
		System.out.println(password.getLocation());*/
		Dimension userNameTextFieldSize = userName.getSize();
		Point userNameTextFieldLocation = userName.getLocation();
		Dimension passwordTextFieldSize = password.getSize();
		Point passwordTextFieldLocation = password.getLocation();
		int xLocationOfUserNameTextField = userNameTextFieldLocation.getX();
		int xLocationOfPasswordTextField = passwordTextFieldLocation.getX();
		int xLocationOfUserNameTextFieldPluswidthOfUserNameTextField = userNameTextFieldSize.width+userNameTextFieldLocation.getX();
		int xLocationOfPasswordTextFieldPluswidthOfPasswordTextField = passwordTextFieldSize.width+passwordTextFieldLocation.getX();
		System.out.println(xLocationOfPasswordTextField);
		System.out.println(xLocationOfPasswordTextFieldPluswidthOfPasswordTextField);
		System.out.println(xLocationOfUserNameTextField);
		System.out.println(xLocationOfUserNameTextFieldPluswidthOfUserNameTextField);
		if(xLocationOfPasswordTextField==xLocationOfUserNameTextField)
			System.out.println("x Location of both are properly aligned");
		else
			System.out.println("x Location of both are properly");
		if(xLocationOfPasswordTextFieldPluswidthOfPasswordTextField==xLocationOfUserNameTextFieldPluswidthOfUserNameTextField)
			System.out.println("correct");
		else
			System.out.println("Not correct");
	}
}
