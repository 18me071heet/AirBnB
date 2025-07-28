package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfile {

	
    public WebDriver driver;
	
	public EditProfile(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='/assets/header/User.svg']")
	WebElement profileIcon;
	
	@FindBy(xpath="//a[@href='/user/profile' and text()='My Profile']")
	WebElement profile;
	
	@FindBy(xpath="//button[contains(text(),'Edit')])[2]")
	WebElement editBtn;
	
	@FindBy(xpath="//input[@placeholder='Your Name']")
	WebElement fname;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;
	
	public void clickProfileIcon() {
		
		profileIcon.click();
	}
	
	public void clickProfile() {
		
		profile.click();
	}
	
	public void clickEdit() {
		
		editBtn.click();
	}
	
	public void enterFname(String name) {
		
	 fname.sendKeys(name);
	
	}
	
	public void saveFname() {
		
		save.click();
	}
}
