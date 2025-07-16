package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpAB {
	
	
	 public WebDriver driver;
	    
		public  SignUpAB(WebDriver driver) {
			
		    this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//input[@placeholder='Your first name']")
		WebElement txtFirstname;
		
		@FindBy(xpath="//input[@placeholder='Your last name']")
		WebElement txtLastname;
		
		@FindBy(xpath="//input[@placeholder='Email']")
		WebElement txtEmail;
		
		@FindBy(xpath="//input[@placeholder='Mobile Number']")
		WebElement txtPhone;
		
		@FindBy(xpath ="//input[@placeholder='Password']")
		WebElement txtPass;
		
		@FindBy(xpath ="//input[@placeholder='Confirm Password']")
		WebElement txtCpass;
		
		@FindBy(xpath="//input[@id='consentCheckbox']")
		WebElement chkPrivacy ;
		
		@FindBy(xpath=" //button[@type='button'][normalize-space()='Sign Up']")
		WebElement btnSignUp;
		
		
		public void frstNameField(String fname) {
			
			txtFirstname.sendKeys(fname);
			
		}
		
	    public void lastNamefield(String lname) {
			
		txtLastname.sendKeys(lname);
			
		}

	   public void emailField(String email) {
		
		txtEmail.sendKeys(email);
	   }
		
		public void phoneField(String phone) {
			txtPhone.sendKeys(phone);
			
		}
	   
		public void passField(String pass) {
			txtPass.sendKeys(pass);
			
		}
		
		public void cpassField(String cpass) {
			txtCpass.sendKeys(cpass);
			
		}
		
		public void privacyClick() {
			
			chkPrivacy.click();
		}
		
		public void signUp() {
			
			btnSignUp.click();
		}

}
