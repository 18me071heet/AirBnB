package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserBooking {
	
	public WebDriver driver;
	
	public UserBooking(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[normalize-space()='Switch to user']")
	WebElement switchTouser;;
	
	@FindBy(xpath="//img[@src='/assets/header/User.svg']")
	WebElement profileIcon;
	
	
	 @FindBy(xpath="//a[@href='/user/booking' and text()='My Bookings']")
	 WebElement btnBookings;
	
     @FindBy(xpath="(//*[local-name()='svg' and @width='24' and @height='24'])[3]")
     WebElement filterIcon;
    
     @FindBy(xpath="//span[normalize-space()='In Progress']")
     WebElement inProgress;
     
     @FindBy(xpath="//button[normalize-space()='Save']")
     WebElement btnSubmit;
     
     @FindBy(xpath ="//button[contains(text(), 'Cancel') and contains(@class, 'text-[#FF3E95]')]")
     WebElement btnCancelBooking;
     
     @FindBy(xpath=" //button[normalize-space()='Confirm']")
     WebElement btnConfirm;
     
     
     public void switchUser() {
    	 
    	 switchTouser.click();
     }
     
     public void profileClick() {
    	 
    	 profileIcon.click();
     }
     public void userBooking() {
    	 
    	 btnBookings.click();
     }
     
     public void filterBooking() {
    	 
    	 filterIcon.click();
     }
     
     public void inProgressFilter() {
    	 
    	 inProgress.click();
     }
     
     public void submitFilter() {
    	 
    	 btnSubmit.click();
     }
     
     public void cancelBtn() {
    	 btnCancelBooking.click();
     }
     
     public void confirmCancel() {
    	 
    	 btnConfirm.click();
     }
     

}
