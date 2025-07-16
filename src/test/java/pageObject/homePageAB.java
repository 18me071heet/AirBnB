package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageAB {
	
	public WebDriver driver;
	
	public homePageAB(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='/assets/header/User.svg']")
	WebElement profileIcon;
	
	@FindBy(xpath="//a[@href='/auth/login' and text()='Log in']")
	WebElement btnLogin;
	
	
	@FindBy(xpath="//a[@href='/contact-us' and text()='Contact Us']")
	WebElement contactUs ;
	
	@FindBy(xpath="//a[@href='/auth/signout' and text()='Logout']")
	WebElement logOut;
	
	public void profileIconClick() {
		
		profileIcon.click();
	}
	
	public void logInClick() {
		
		btnLogin.click();
	}
	
	public boolean isContactUsDisplaying() {
		
		try {
			return (contactUs.isDisplayed());	
		}
		catch(Exception e) {
			return false;
			
		}
		
	}
	
	public void LogoutClick() {
		
		logOut.click();
	}
	

}
