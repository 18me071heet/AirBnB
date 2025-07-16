package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcceptndRejectBooking {
	
	public WebDriver driver;
	
	public AcceptndRejectBooking(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[normalize-space()='Switch to host']")
	WebElement btnSwitchtoHost;
	
	@FindBy(xpath="//img[@src='/assets/header/User.svg']")
	WebElement btnProfileicon;
	
	@FindBy(xpath="//a[text()='Bookings']")
	WebElement btnBookings;
	
	@FindBy(xpath="//button[normalize-space()='Upcoming Bookings']")
	WebElement bntUpcoming;
		
	public void switchTohostClick() {
		
		btnSwitchtoHost.click();
	}
	
	public void profileIconClick() {
		
		btnProfileicon.click();
	}
	
	public void bookingNavigation() {
		
		btnBookings.click();
	}
	
	public void upcomingBookings() {
		
		bntUpcoming.click();
	}
}
