package TC_AB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseClass.BaseClassAB;
import pageObject.LogInAB;
import pageObject.UserBooking;

public class Tc_UserBooking extends BaseClassAB{

	@Test(priority=1,groups= {"Smoke","Functional"})
	void cancelBooking() throws InterruptedException {
		
		
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
			
		UserBooking ub = new UserBooking(driver);
		logger.info("Tc-04 --> Verify side header is open or not by clicking profile icon");
	
		ub.profileClick();
		
		Thread.sleep(2000);
		
		logger.info("Tc-05 --> Verify user is navigate to the Booking screen by clicking on My Bookings");
		ub.userBooking();
		
		Thread.sleep(2000);
		
		logger.info("Tc-06 --> Verify filter icon popup is open or not by clicking filter icon");
		ub.filterBooking();
		
		logger.info("Tc-07 --> Verify user is able to select In progress filter ");
		ub.inProgressFilter();
		
		Thread.sleep(2000);
		
		logger.info("Tc-08 --> Verify booking record is displaying or not by clicking submit button");
		ub.submitFilter();
		
	    logger.info("Tc-09 --> Verify Cancel button is displaying in the Confirmation pending status ");
	    
	    logger.info("Tc-10 --> Verify booking is getting cancel by clickking on the Cancel button");
		
		List<WebElement> inProgressStatus = driver.findElements(By.xpath("//div[contains(@class, 'text-gray-500') and contains(text(), 'Confirmation Pending')]"));
		
		for(WebElement cancel : inProgressStatus) {
			
			if(cancel.isDisplayed()) {
				
	            ub.cancelBtn();
				break;
			}
		}
		
		
	}
}
