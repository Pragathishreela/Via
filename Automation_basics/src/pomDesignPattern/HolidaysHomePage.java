package pomDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HolidaysHomePage {
	public HolidaysHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "destination")
	private	WebElement destinationTextField;
	
	@FindBy(id = "departure")
	private WebElement checkInDate;
	
	@FindBy(id = "flexible_dates")
	private WebElement flexibleCheckBox;
	
	@FindBy(id = "search-holiday-btn")
	private WebElement serachButton;
	
	@FindBy(className = "roomsDisplayString")
	private WebElement roomDropDown;
	
	@FindBy(id = "search-holiday-btn")
	private WebElement searchButton;

	public WebElement getDestinationTextField() {
		return destinationTextField;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getFlexibleCheckBox() {
		return flexibleCheckBox;
	}

	public WebElement getSerachButton() {
		return serachButton;
	}

	public WebElement getRoomDropDown() {
		return roomDropDown;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	
	
}
