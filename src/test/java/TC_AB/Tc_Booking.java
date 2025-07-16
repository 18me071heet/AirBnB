package TC_AB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseClass.BaseClassAB;
import pageObject.CancelBooking;
import pageObject.EntertainerBooking;
import pageObject.LogInAB;
import pageObject.ProfileClass;

public class Tc_Booking extends BaseClassAB{
	
	@Test
	void acceptBooking() throws InterruptedException {
		
		
	LogInAB login = new LogInAB(driver);
		
		logger.info("Tc-01 --> Verify user is able to enter email ");
		
		Thread.sleep(2000);
		login.emailField(p.getProperty("email"));
		
		
		logger.info("Tc-02 --> Verify user is able to enter password ");
		Thread.sleep(2000);
		login.passField(p.getProperty("password"));
		
		logger.info("Tc-03 --> Verify user is able to login by clicking login button");
		Thread.sleep(8000);
		login.loginClick();
		
		ProfileClass pc = new ProfileClass(driver);
		
		
		logger.info("Tc-01 --> Verify user is switch to host or not by clicking switch to host ");
		Thread.sleep(4000);
		pc.swithToHostClick();
		
		
		logger.info("Tc-02 --> Verify profile menu is displaying or not by clicking profile icon ");
		Thread.sleep(3000);
		pc.profileIconClick();
		
		EntertainerBooking eb = new EntertainerBooking(driver);
		
		logger.info("Tc-03 --> Verify user is navigate to the Booking screen by clicking Bookings from side menu bar ");
		Thread.sleep(2000);
		eb.bookingNavigation();
		
		logger.info("Tc-04 --> Verify upcoming booking is displaying by selecting Upcoming tab ");
		Thread.sleep(2000);
		eb.upComingBooking();
		

		//logger.info("Tc-05 --> Verify accept button is displaying only in the Inprogress status and Booking is getting accepted or not. ");
	/*	List<WebElement> inProgressStatuses = driver.findElements(By.xpath("//span[contains(text(),'In Progress')]"));

		for (WebElement status : inProgressStatuses) {
		    if (status.isDisplayed()) {
		      
		        WebElement acceptButton = driver.findElement(By.xpath(".//button[normalize-space()='Accept']"));
		        acceptButton.click();
		        break; 
		    }
		}*/
		
		CancelBooking cb =new CancelBooking(driver);
		
		logger.info("Tc-06 --> Verify Cancel button is displaying in the Accepted status and cancel reason popup is displaying or not");
		
		List<WebElement> acceptedStatus = driver.findElements(By.xpath("//span[contains(text(),'Accepted')]"));
		
		for(WebElement accept : acceptedStatus) {
			
			if(accept.isDisplayed()) {
				
		        cb.cancelBtn();
				break;
			}
		}
		
		
		Thread.sleep(2000);
		cb.txtCancelReason();
		
		Thread.sleep(2000);
		cb.submitClick();
		
		
	}

	
	
      
	
	

}
