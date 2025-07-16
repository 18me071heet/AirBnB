package TC_AB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseClass.BaseClassAB;
import pageObject.AcceptndRejectBooking;
import pageObject.LogInAB;

public class Tc_AcceptndRejectBooking extends BaseClassAB{

	
	WebDriver driver;
	
	@Test(priority=1,groups= {"Smoke,Functional"})
	public void acceptndRejectBooking() throws InterruptedException {
		
		
		logger.info("Tc-01 --> Verify user is able to enter email ");
		
		LogInAB login = new LogInAB(driver);
		
		login.emailField(p.getProperty("email"));
		Thread.sleep(2000);
		
		logger.info("Tc-02 --> Verify user is able to enter password ");
		login.passField(p.getProperty("password"));
		
		logger.info("Tc-03 --> Verify user is able to login by clicking login button");
		Thread.sleep(10000);
		login.loginClick();
		
		
		AcceptndRejectBooking booking = new AcceptndRejectBooking(driver);

		logger.info("Tc-04 --> Verify user is able to switch to host by clicking switch to host");
		booking.switchTohostClick();
		
		Thread.sleep(3000);
		logger.info("Tc-05 --> Verify side menu bar is open by clicking profile icon");
		booking.profileIconClick();
		
		Thread.sleep(5000);
		logger.info("Tc-06 --> Verify Entertainer is navigate to the booking screen ");
		booking.bookingNavigation();
		
		Thread.sleep(4000);
		logger.info("Tc-07 --> Verify Upcoming bookings are displaying by clicking Upcoming booking tab ");
		booking.upcomingBookings();
		
		Thread.sleep(3000);
		logger.info("Tc-08 --> Verify accept button is displaying only in the Inprogress status and Booking is getting accepted or not. ");
		
		
			List<WebElement> inProgressStatuses = driver.findElements(By.xpath("//span[contains(text(),'In Progress')]"));

			for (WebElement status : inProgressStatuses) {
			    if (status.isDisplayed()) {
			      
			        WebElement acceptButton = driver.findElement(By.xpath(".//button[normalize-space()='Accept']"));
			        acceptButton.click();
			        break; 
			    }
			}
	
			
			logger.info("Tc-09 --> Verify reject  button is displaying only in the Inprogress status and Booking is getting reject or not. ");
			List<WebElement> inProgressStatus = driver.findElements(By.xpath("//span[contains(text(),'In Progress')]"));

			for (WebElement status : inProgressStatus) {
			    if (status.isDisplayed()) {
			      
			        WebElement reject = driver.findElement(By.xpath(".//button[normalize-space()='Reject']"));
			        reject.click();
			        break; 
			    }
			}
		
	}
}
