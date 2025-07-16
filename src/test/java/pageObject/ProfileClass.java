package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileClass {

	public WebDriver driver;
	
    public ProfileClass(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//button[normalize-space()='Switch to host']")
	WebElement switchToHost;
	
	@FindBy(xpath="//img[@src='/assets/header/User.svg']")
	WebElement profileIcon;
	
	public void swithToHostClick() {
		
		switchToHost.click();
	}
	
	public void profileIconClick() {
		
		profileIcon.click();
	   
	}
	
	
}
