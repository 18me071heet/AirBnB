package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInAB {

public WebDriver driver;
	
	public LogInAB(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btnLogin;
	
	
	public void emailField(String email) {
		
		txtEmail.sendKeys(email);
	}
	
	public void passField(String password) {
		
	   txtPassword.sendKeys(password);
	   
	}
	
	public void loginClick() {
		
		btnLogin.click();
	}
	

	

}
