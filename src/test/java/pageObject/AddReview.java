package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddReview {

	
	public WebDriver driver;
	
	public AddReview(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="//button[normalize-space()='Switch to user']")
	 WebElement switchTouser;;
	
	 @FindBy(xpath="//img[@src='/assets/header/User.svg']")
	 WebElement profileIcon;
	
	 @FindBy(xpath="//a[@href='/user/booking' and text()='My Bookings']")
	 WebElement btnBookings;
	
	 @FindBy(xpath="//button[text()='My Bookings']")
	 WebElement btnUserBookings;
	 
     @FindBy(xpath="(//*[local-name()='svg' and @width='24' and @height='24'])[2]")
     WebElement filterIcon;
    
     @FindBy(xpath="//span[normalize-space()='In Progress']")
     WebElement inProgress;
     
     @FindBy(xpath="//button[normalize-space()='Save']")
     WebElement btnSubmit;
     
     @FindBy(xpath=" //textarea[@id='comment']")
     WebElement addReview;
     
     @FindBy(xpath=" //button[normalize-space()='Submit']")
     WebElement sendReview;
     
     
     public void clickprofileIcon() {
    	 
    	 profileIcon.click();
     }
     
     public void btnMyBookings() {
    	 
    	 btnUserBookings.click();
     }
     
     public void filter() {
    	 
    	 filterIcon.click();
     }
     
     public void saveFilter() {
    	 
    	 btnSubmit.click();
     }
     
     public void addReviews(String review) {
    	 
    	 addReview.sendKeys(review);
     }
     
     public void send() {
    	 
    	 sendReview.click();
     }
}

