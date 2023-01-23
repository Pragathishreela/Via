package pomDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class basePage {
	//rule one
	public basePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Bus")
	private WebElement busNavBarIcon;
	
	@FindBy(partialLinkText = "Holidays")
	private WebElement holidaysNavBarIcon;

	public WebElement getHolidaysNavBarIcon() {
		return holidaysNavBarIcon;
	}

	public WebElement getBusNavBarIcon() {
		return busNavBarIcon;
	}
	
}
