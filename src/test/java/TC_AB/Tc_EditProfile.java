package TC_AB;

import org.testng.annotations.Test;

import baseClass.BaseClassAB;
import pageObject.EditProfile;
import pageObject.LogInAB;

               public class Tc_EditProfile extends BaseClassAB {
 
	           void threadTime() throws InterruptedException {
	        	   
	        	   Thread.sleep(3000);
	            }
	   
	            @Test(priority=1,groups= {"Smoke","Functional"})
	            void editProfile() throws InterruptedException {
	            
	            LogInAB login = new LogInAB(driver);
		
				logger.info("Tc-01 --> Verify user is able to enter email ");
				threadTime();
				login.emailField(p.getProperty("email"));
				
				
				logger.info("Tc-02 --> Verify user is able to enter password ");
				threadTime();
				login.passField(p.getProperty("password"));
				
				logger.info("Tc-03 --> Verify user is able to login by clicking login button");
				Thread.sleep(10000);
				login.loginClick();
				
				EditProfile profile = new EditProfile(driver);
				
				threadTime();
				logger.info("Tc-04 --> Verify side menu is getting open or not by clicking on profile icon");
				profile.clickProfileIcon();
				
				threadTime();
				logger.info("Tc-05 --> Verify profile page is open or not by click on Profile button");
				profile.clickProfile();
				
				threadTime();
				logger.info("Tc-06 --> Verify user is able to enter first name only by clickig on Edit ");
			    profile.clickEdit();
				
			    threadTime();
				profile.enterFname("Johnson");
		        
				threadTime();
				logger.info("Tc-07 --> Verify edited first name is getting saved or not by clicking Save ");
				profile.saveFname();
				
		
	            }
				
}
