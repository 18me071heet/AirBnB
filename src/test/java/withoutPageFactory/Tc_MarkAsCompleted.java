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

public class Tc_MarkAsCompleted {
WebDriver driver;
	
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
		
	
		
		logger.info("Tc-03 Log In Navigation and Added Login Fields   ");
		
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
		
	
		Thread.sleep(4000);
		
		WebElement switchtoHost = driver.findElement(By.xpath("//button[normalize-space()='Switch to host']"));
		switchtoHost.click();
		
		Thread.sleep(2000);
		
		WebElement profileIcon = driver.findElement(By.xpath("//img[@src='/assets/header/User.svg']"));
		profileIcon.click();
		
		Thread.sleep(4000);
		
		
		WebElement myBooking = driver.findElement(By.xpath("//span[contains(text(),'Bookings')]"));
		myBooking.click();
		
	}
	
	@Test(priority=3,groups= {"Smoke","Functioanl"})
	void markComplete() throws InterruptedException {
		
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	//	WebElement upComing = driver.findElement(By.xpath(" //button[normalize-space()='Upcoming Bookings']"));
	//	upComing.click();
		
		WebElement LatestToOldest = driver.findElement(By.xpath("(//*[local-name()='svg' and @width='24' and @height='24'])[3]"));
		LatestToOldest.click();
		
		Thread.sleep(2000);
		
		WebElement inProgress = driver.findElement(By.xpath("//span[normalize-space()='In Progress']"));
		inProgress.click();
		
		Thread.sleep(5000);
	
		
	logger.info("Tc-01 --> Verify Cancel button is displaying in the Accepted status and cancel reason popup is displaying or not");
		
		List<WebElement> acceptedStatus = driver.findElements(By.xpath("//span[contains(text(),'Accepted')]"));
		
		WebElement popupButton = wait.until(ExpectedConditions.elementToBeClickable(
			    By.xpath("//div[contains(@class, 'mt-6') and contains(@class, 'border-t')]//button[normalize-space()='Mark as Completed']")
			));
		
		for(WebElement accept : acceptedStatus) {
			
			if(accept.isDisplayed()) {
				
				WebElement btn = driver.findElement(
					    By.xpath("//button[normalize-space()='Mark as Completed']"));
					btn.click();
					popupButton.click();
					
				break;
			}
		}
	
	}
}
