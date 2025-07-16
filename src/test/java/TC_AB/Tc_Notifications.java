package TC_AB;

import org.testng.annotations.Test;

import baseClass.BaseClassAB;
import pageObject.LogInAB;
import pageObject.Notifications;

public class Tc_Notifications extends BaseClassAB {


	@Test(priority=1,groups= {"Smoke,Functional"})
	public void notificationCases() throws InterruptedException{
	
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
			
		
	        Notifications notification = new Notifications(driver);
	
	        logger.info("Tc-04 --> Verify side menu bar is open or not by clicking on profile icon");
	        Thread.sleep(2000);
	        notification.clickProfileIcon();
	
	        logger.info("Tc-05 --> Verify notification page is displaying or not by clicking on notification option");
	        Thread.sleep(2000);
	        notification.clickNotification();
	
	        logger.info("Tc-06 --> Verify next page of notification is displaying or not by clicking on Next");
	        Thread.sleep(2000);
	        notification.nextNotification();
	
	        logger.info("Tc-07 --> Verify previous page of notification is displaying or not by clicking on Previous");
	        Thread.sleep(2000);
            notification.previousNotification();
	
            logger.info("Tc-08 --> Verify all the notifications are getting clear or not by clicking Clear All ");
  	        Thread.sleep(2000);
       	    notification.clearNotification();
	
	
	}
	
}
