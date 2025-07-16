package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Validation_LogIn {

	
	public WebDriver driver;
	
	public Validation_LogIn(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtPass;
	
	@FindBy(xpath="//p[normalize-space()='Please Enter Valid Email.']")
	WebElement txtEmailValidation;
	
	
	@FindBy(xpath="//p[normalize-space()='Please Enter Password.']")
	WebElement txtPasswordValidation;
	
	
	@FindBy(xpath="//p[normalize-space()='Please Enter Valid Email.']")
	WebElement txtInvalidValidation;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btnLogin;
	
	public void addEmail(String email) {
		
		txtEmail.sendKeys(email);
	}
	
	public void addPass(String password) {
		
		txtPass.sendKeys(password);
	}
	
	public void clearPassword() {
		
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value='';", txtPass);
	}

	
	public void clickLogin() {
		
	btnLogin.click();
	
	}
	
	
	public void clearEmail() {
		
		txtEmail.clear();
	}
	
	 public String getEmailValidation() {
	        return txtEmailValidation.getText();
	    }
	 
	 public String getInvalidEmailValidation() {
		 
		 return txtInvalidValidation.getText();
	 }
	 
	 public String passwordValidation() {
		 
		 return txtPasswordValidation.getText();
	 }
}
