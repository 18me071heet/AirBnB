package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_PageFactory {

	
	WebDriver driver;
	
	LogIn_PageFactory(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement txtUserEmail;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtUserPass;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btnLogin;
	
	public void addEmail(String email) {
		
		txtUserEmail.sendKeys(email);
	}
	
	public void addPass(String pass) {
		
		txtUserPass.sendKeys(pass);
	}
	
	public void login() {
		
		btnLogin.click();
	}
	
}
