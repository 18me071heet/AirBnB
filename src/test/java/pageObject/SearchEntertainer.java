package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchEntertainer {

	public WebDriver driver;
	
	public SearchEntertainer(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[@class='select-none']//*[name()='svg']")
	WebElement filterIcon;
	
	@FindBy(xpath = "//span[normalize-space()='Entertainment type']")
	WebElement entertainmentType;
	
	@FindBy(xpath="//li[normalize-space()='Theater and Performing Arts']")
	WebElement specificEnttype;
	
	@FindBy(xpath="//span[normalize-space()='Event Types']")
	WebElement eventType;
	
	@FindBy(xpath=" //li[normalize-space()='Private Party']")
	WebElement specificEventType;
	
	@FindBy(xpath="//span[normalize-space()='Event location']")
	WebElement eventLocation;
	
	@FindBy(xpath="//li[normalize-space()='London']")
	WebElement specificLocation;
	
	public void clickFilterIcon() {
		
		filterIcon.click();
	}
	
	public void clickEntertainmentType() {
		
		entertainmentType.click();
	}
	
	public void specificEventSelect() {
		
		specificEnttype.click();
	}
	
	public void eventTypeClick() {
		
		eventType.click();
	}
	
	public void specificEventTypeSelect() {
		
		specificEventType.click();
	}
	
	public void eventLocationSelect() {
		
		eventLocation.click();
	}
	
	public void specificLocationSelect() {
		
		specificLocation.click();
	}
	
	
	
	
}
