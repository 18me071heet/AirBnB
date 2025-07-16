package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Validation_SignUP {

	 public WebDriver driver;
	    
		public  Validation_SignUP(WebDriver driver) {
			
		    this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
				
		@FindBy(xpath=" //button[@type='button'][normalize-space()='Sign Up']")
		WebElement btnSignUp;
		
		
		@FindBy(xpath=" //p[normalize-space()='Please Enter Valid Email.']")
		WebElement emailValidation;
		
		@FindBy(xpath=" //p[normalize-space()='Please Enter Valid Mobile Number.']")
		WebElement mobileValidation;
		
		@FindBy(xpath="  //p[contains(text(),'Password Must include at least one lowercase letter')]")
		WebElement passwordValidation;
		
		@FindBy(xpath="  //p[contains(text(),'Password Must include at least one lowercase letter')]")
		WebElement confirmPassValidation;
		
		@FindBy(xpath="//input[@placeholder='Your first name']")
		WebElement txtFirstname;
		
		@FindBy(xpath ="//input[@placeholder='Password']")
		WebElement txtPass;
		
		@FindBy(xpath ="//input[@placeholder='Confirm Password']")
		WebElement txtCpass;
		
		@FindBy(xpath=" //p[normalize-space()='Please Agree Terms and conditions']")
		WebElement TermsValidation;
		
		@FindBy(xpath=" //p[normalize-space()='Please Enter Captcha']")
		WebElement captchaValidation ;
		
		@FindBy(xpath=" //p[normalize-space()='Please match password and confirm password.']")
		WebElement confirmValidation;
		
		@FindBy(xpath=" //p[normalize-space()='Please Enter Valid First Name.']")
		WebElement numericValidation;
		
		@FindBy(xpath=" //p[normalize-space()='Please Enter Valid First Name.']")
		WebElement frstandLastnameValidation;
		
		
	
		public void signUpBtn() {
			
			btnSignUp.click();
		}
		
		 public String getNameValidation() {
		        return frstandLastnameValidation.getText();
		    }
		 
		 public String getEmailValidation() {
		        return emailValidation.getText();
		    }
		 
		 public String getMobileValidation() {
		        return mobileValidation.getText();
		    }
		 
		 public String getPasswordValidation() {
		        return passwordValidation.getText();
		    }
		 
		 public String getConfirmPassValidation() {
		        return confirmPassValidation.getText();
		    }
		 
			public void frstNameField(String fname) {
				
				txtFirstname.sendKeys(fname);
				
			}
		    
			public void passField(String pass) {
				txtPass.sendKeys(pass);
				
			}
			
			public void cpassField(String cpass) {
				txtCpass.sendKeys(cpass);
				
			}
		 
		 public String getTermsValidation() {
		        return TermsValidation.getText();
		    }
		 
		 public String getCaptchaValidation() {
		        return captchaValidation.getText();
		    }
		 
		 public String getCpassValidation() {
		        return confirmValidation.getText();
		    }
		 
		 public String fnameValidation() {
			 
			 return numericValidation.getText();
		 }
		 
}
