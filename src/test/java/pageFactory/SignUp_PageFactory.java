package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_PageFactory {

	WebDriver driver;
	
	SignUp_PageFactory(WebDriver driver){
		
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Your first name']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@placeholder='Your last name']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement txtEmail;

	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@placeholder='Confirm Password']")
	WebElement txtCpassword;
	
	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	WebElement txtPhone;
	
	@FindBy(xpath="//input[@id='consentCheckbox']")
	WebElement chkPrivacy;
	
	@FindBy(xpath="//button[normalize-space()='Sign Up']")
	WebElement btnSignUp;
	
	@FindBy(xpath=" //a[normalize-space()='Login']")
	WebElement loginLink;
	
	
	void addFname(String fname) {
		txtFirstName.sendKeys(fname);
	}
	
	void addLname(String lname) {
		txtLastName.sendKeys(lname);
	}
	
	void addEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	void addPhone(String phone) {
		txtPhone.sendKeys(phone);
		
	}
	void addPass(String pass) {
		txtPassword.sendKeys(pass);
	}

	void addCpass(String cpass) {
		txtCpassword.sendKeys(cpass);
	}
	
	void chkPrivacy() {
		chkPrivacy.click();
	}
	
	void btnSignupp() {
		btnSignUp.click();
	}
	
	void linkLogin() {
		
		loginLink.click();
	}
}
