package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntertainerBooking {
	
	public WebDriver driver;
	
	public EntertainerBooking(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(xpath="//a[text()='Bookings']")
		WebElement bookingNavigate;
		
		@FindBy(xpath="//button[normalize-space()='Upcoming Bookings']")
		WebElement upComing;
		
		public void bookingNavigation() {
			
			bookingNavigate.click();
		}
		
		public void upComingBooking() {
			
			upComing.click();
		   
		}

}
