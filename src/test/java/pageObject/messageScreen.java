package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class messageScreen {

	public WebDriver driver;
	
	public messageScreen(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='/assets/header/User.svg']")
	WebElement profileIcon;
	
	@FindBy(xpath="//button[normalize-space(text())='Messages']")
	WebElement btnMessage;
	
	@FindBy(xpath ="(//*[name()='svg' and @class='select-none cursor-pointer'])[1]")
	WebElement searchBox;
	
	@FindBy(xpath ="//input[@placeholder='Search Messenger']")
	WebElement txtSearchbox;
	
	@FindBy(xpath=" //input[@placeholder='What would you like to say?']")
	WebElement txtSend;
	
	@FindBy(xpath = "(//*[local-name()='svg' and @width='24' and @height='24'])[3]")
	WebElement filterIcon;
	
	@FindBy(xpath = "//button[.//span[text()='Filter By']]")
	WebElement filterByButton;

	@FindBy(xpath="//div[@role='option' and text()='Today']")
	WebElement todayFilter;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement btnSubmit;
	
	
	public void profileIconClick() {
		
		profileIcon.click();
		
	}
	public void messageClick() {
		
		btnMessage.click();
	}
	
	public void searchBoxClick() {
		
		searchBox.click();
	}
	
	public void txtArea(String name) {
		
		txtSearchbox.sendKeys(name);
	}
	
	public void enterSend() {
		
		txtSend.sendKeys("Hello Good Afternoon",Keys.ENTER);
	}
	
	public void filterIconClick() {
		
		filterIcon.click();
	}
	
	public void clickFilterButton() {
	    filterByButton.click();
	}
	
	
	public void todayFilter() {
		
		todayFilter.click();
	}
	
	public void submitBtn() {
		
		btnSubmit.click();
	}

//	public WebElement getSearchResult(String name) {
	//    return driver.findElement(By.xpath("//div[contains(normalize-space(), '" + name + "')]"));
	//}
	
}
