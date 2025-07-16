package TC_AB;

import org.testng.annotations.Test;

import baseClass.BaseClassAB;
import pageObject.ContactUs;
import pageObject.LogInAB;

public class Tc_contactUs extends BaseClassAB{

	@Test(priority=1,groups= {"Smoke,Functional"})
	void contactUsDetails() throws InterruptedException {
		
		
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
		 Thread.sleep(4000);	
			
		 ContactUs contact = new ContactUs(driver);
		
		 logger.info("Tc-04 --> Verify side menu bar is displaying by clicking on profile icon");
		 contact.profileIconClick();
	     Thread.sleep(2000);
		
		 logger.info("Tc-05 --> Verify contact us page is displaying or not by clicking on Contact us option");
		 contact.contactUsNavigation();
		 Thread.sleep(2000);
		
		 contact.ClickSubmit();
		 Thread.sleep(2000);
		 
		 logger.info("Tc-06 --> Verify validation message is displaying by keep mandatory field blank");
		 contact.isValidationDisplaying();
		 Thread.sleep(2000);
	
		 logger.info("Tc-07 --> Verify user is able to fill User's First name ");
		 contact.addFname("Johnas");
		 Thread.sleep(2000);
		
         logger.info("Tc-08 --> Verify user is able to fill User's last name ");
		 contact.addLname("Steven");
		 Thread.sleep(2000);
		
         logger.info("Tc-09 --> Verify user is able to fill User's email address");
		 contact.addEmail("johnas.steven@yopmail.com");
		 Thread.sleep(2000);
		
		 logger.info("Tc-10 --> Verify user is able to add the feedbacks in the description text box");
		 contact.addFeedback("I am not able to cancel my event which on after 10 days . Please resolved it As soon as Possible");
		 Thread.sleep(2000);
		
		 logger.info("Tc-11 --> Verify added feedback is send to the admin with all details or not by clicking on Submit ");
		 contact.clickSubmits();
	}
}
