package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {

	public WebDriver driver;
	
	public ContactUs(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//img[@src='/assets/header/User.svg']")
	WebElement profileIcon;
	
	@FindBy(xpath = "//button[text()='Contact Us']")
	WebElement contactUs;
	
	@FindBy(xpath="//button[normalize-space()='Send message']")
	WebElement btnSubmit;
	
	@FindBy(xpath=" //input[@placeholder='Your first name']")
	WebElement txtFname;
	
	@FindBy(xpath="//input[@placeholder='Your last name']")
	WebElement txtLname;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath="")
	WebElement txtFeedback;
	
	
	@FindBy(xpath="//button[normalize-space()='Send message']")
	WebElement btnSubmits;
	
	@FindBy(xpath="//p[normalize-space()='Please enter valid first and last name']")
	WebElement txtValidation;
	
	public void profileIconClick() {
		
		profileIcon.click();
		
	}
	
	public void contactUsNavigation() {
		
		contactUs.click();
	}
	
	public void ClickSubmit() {
		
		btnSubmit.click();
	}
	
	public boolean isValidationDisplaying() {
		
		try {
			return (txtValidation.isDisplayed());	
		}
		catch(Exception e) {
			return false;
			
		}
		
	}
	
	public void addFname(String fname) {
		
		txtFname.sendKeys(fname);	
		
	}
	
	public void addLname(String lname ) {
		
		txtLname.sendKeys(lname);
	}
	
	public void addEmail(String email) {
		
		txtEmail.sendKeys(email);
		
	}
	
	public void addFeedback(String feedback) {
		
		txtFeedback.sendKeys(feedback);
		
	}
	
	public void clickSubmits() {
		btnSubmits.click();
	}
	

		
}
