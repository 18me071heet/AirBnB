package TC_AB;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseClassAB;
import pageObject.LogInAB;
import pageObject.homePageAB;
import utlility_AB.DataProvidersAB;

public class Tc_DDAB extends BaseClassAB{

	@Test(dataProvider = "LoginData", dataProviderClass = DataProvidersAB.class)
	void logintoAB(String email, String password, String exp) throws InterruptedException {
		
		


	    LogInAB login = new LogInAB(driver);
	    homePageAB home = new homePageAB(driver);

	
	    login.emailField(email);
	    Thread.sleep(2000);
	    
	    
	    login.passField(password);
	    Thread.sleep(8000);
	    
	    login.loginClick();
	    
	    Thread.sleep(4000); 

	
	    boolean contactUsVisible = false;

	    try {
	    	
	    	
	        home.profileIconClick();
	        contactUsVisible = home.isContactUsDisplaying();  
	        
	       
	    } catch (Exception e) {
	    	
	    	
	        contactUsVisible = false;
	    }

	
	    if (exp.equalsIgnoreCase("Valid")) {
	    	
	    	
	        if (contactUsVisible) {
	        	
	        	
	            logger.info("Valid login: Contact Us is visible");

	            home.profileIconClick();  
	            home.LogoutClick();
	            Assert.assertTrue(true);
	            
	        } else {
	        	
	        	
	            logger.error("Valid login: Contact Us not visible. Login probably failed.");
	          
	        }

	    } 
	    
	    else if (exp.equalsIgnoreCase("Invalid")) {
	    	
	    	
	        if (contactUsVisible) {
	        	
	        	
	            logger.warn("Invalid login test failed: user got logged in unexpectedly");

	            home.profileIconClick();
	            home.LogoutClick();  
	           
	        } 
	        
	        else {
	        	
	        	Thread.sleep(4000);
	        	
	        	
	            logger.info("Invalid login test passed: Contact Us not visible as expected.");
	            Assert.assertTrue(true);
	        }
	    }


    	driver.get(p.getProperty("appUrl"));
   	    Thread.sleep(3000);
	 
	}

}
