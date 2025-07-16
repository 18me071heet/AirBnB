package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking {

	public WebDriver driver;
	
	public CancelBooking(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//button[normalize-space()='Cancel']")
	WebElement btnCancel;
	
	@FindBy(xpath="//textarea[@placeholder='Write a reason to cancel the event...']")
	WebElement txtReason;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement btnSubmit;
	
	public void cancelBtn() {
		
		btnCancel.click();
	}
	
	public void txtCancelReason() {
		
		txtReason.sendKeys("We are not able to organize our event we will start your refund");
	}
	
	public void submitClick() {
		
		btnSubmit.click();
	}
	
}
