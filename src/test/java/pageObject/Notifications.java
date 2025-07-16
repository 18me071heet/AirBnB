package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Notifications {

	public WebDriver driver;
	
	public Notifications(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//img[@src='/assets/header/User.svg']")
	WebElement profileIcon;
	
	@FindBy(xpath="//button[contains(text(),'Notifications')]")
	WebElement btnNotifications;
	
	@FindBy(xpath=" //button[normalize-space()='Next']")
	WebElement btnNext;
	
	@FindBy(xpath=" //button[normalize-space()='Previous']")
	WebElement btnPrevious;
	
	@FindBy(xpath="//p[text()='Clear all']")
	WebElement clearAllNotification;
	
	public void clickProfileIcon() {
		
		profileIcon.click();
	}
	
	public void clickNotification() {
		
		btnNotifications.click();
	}
	
	public void nextNotification() {
		
		btnNext.click();
	}
	
	public void previousNotification() {
		
		btnPrevious.click();
	}
	
	public void clearNotification() {
		
		clearAllNotification.click();
		
	}
}
