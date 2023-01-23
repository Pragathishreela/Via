package AdvanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
@SuppressWarnings("unused")
@Test
public class TestCaseId extends JustPractice1{
	@Test(priority = 1)
	void add1() {
		Reporter.log("add1 report",false);
		System.out.println(2);
	}
	//@Test(priority = 2,invocationCount = 5,threadPoolSize = 5)
	
		@Test(priority = 2,invocationCount = 5,threadPoolSize = 2)
		public void meghanaFoods() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://magicpin.in/");
			driver.quit();
		}
	@Test(priority = 3)
	void sub() {
		System.out.println(2);
	}
	@Test(priority = 4)
	//@Override
	void mul() {
		System.out.println(2);
	}
	@Test(priority = 5)
	void div() {
		System.out.println(2);
		mod();
	}
	//@Test(priority = 1)
	void mod() {
		System.out.println(2);
	}
	@Test(priority = 6)
	void fact() {
		System.out.println(2);
	}
}
