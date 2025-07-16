package withoutPageFactory;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Tc_UserCancelBooking {

	
    public WebDriver driver;
	
	public Logger logger;
	public Properties p;
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@Test(priority=1,groups={"Smoke","Functional"})
	void logIn() throws InterruptedException, IOException {
		
		logger = LogManager.getLogger(this.getClass());
		
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		ChromeOptions co = new ChromeOptions();
		co.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://airbnb-user.inheritxdev.in/auth/login/email");
		
	
		
		logger.info("Tc-01 Verify user is able Log In with valid Login Fields");
		
		WebElement txtEmailLogin= driver.findElement(By.xpath("//input[@placeholder='Email']"));
		txtEmailLogin.sendKeys("user7@yopmail.com");
		
	
		
		Thread.sleep(2000);
		
		WebElement txtPassword= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		txtPassword.sendKeys("Test@123");
	
		
		Thread.sleep(10000);
		
		WebElement btnLogin= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		btnLogin.click();
		
		
	}
	

	@Test(priority=2,groups= {"Smoke","Functional"})
	void bookingsNavigation() throws InterruptedException {
		
	
		Thread.sleep(5000);
		
		logger.info("Tc-02 Verify user is navigate to the booking page by clickings My Bookings from side menu bar");
		
		WebElement profileIcon = driver.findElement(By.xpath("//img[@src='/assets/header/User.svg']"));
		profileIcon.click();
		
		Thread.sleep(4000);
		
		
//		WebElement myBooking = driver.findElement(By.xpath("//a[@href='/user/booking' and text()='My Bookings']"));
		WebElement myBooking = driver.findElement(By.xpath("//button[text()='My Bookings']"));
		myBooking.click();
		
	}
	
	@Test(priority=3,groups= {"Smoke","Functioanl"})
	void cancelBooking() throws InterruptedException {
		
		
		Thread.sleep(6000);
		
		logger.info("Tc-03 Verify booking record is displaying according to select filter");
		
		WebElement LatestToOldest = driver.findElement(By.xpath("(//*[local-name()='svg' and @width='24' and @height='24'])[3]"));
		LatestToOldest.click();
		
		Thread.sleep(2000);
		
		WebElement inProgress = driver.findElement(By.xpath("//span[normalize-space()='Confirmation Pending']"));
		inProgress.click();
		
		Thread.sleep(2000);
		
		WebElement submitBtn = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		submitBtn.click();
		
	
	    logger.info("Tc-04 --> Verify Cancel button is displaying and popup is open or not by clicking Cancel button");
	
		
		List<WebElement> pendingStatus = driver.findElements(By.xpath("//div[contains(@class, 'text-gray-500') and contains(text(), 'Confirmation Pending')]"));
		
		WebElement confirmButton = driver.findElement(By.xpath(" //button[normalize-space()='Confirm']"));
		
		for(WebElement cancel : pendingStatus) {
			
			if(cancel.isDisplayed()) {
				
				WebElement cancelButton = driver.findElement(By.xpath("//button[contains(text(), 'Cancel') and contains(@class, 'text-[#FF3E95]')]"));
				cancelButton.click();
				confirmButton.click();
				break;
			}
		}
		
		
	}
}
