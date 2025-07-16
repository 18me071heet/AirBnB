package TC_AB;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseClassAB;
import pageObject.LogInAB;
import pageObject.homePageAB;
import utlility_AB.DataProvidersAB;

public class TC_DDT extends BaseClassAB{

	@Test(dataProvider="LoginData",dataProviderClass=DataProvidersAB.class)
	void logintoAB(String email,String password,String exp) throws InterruptedException {
		
		logger.info("Tc-001 login by valid credentials");
		
		LogInAB login = new LogInAB(driver);
		login.emailField(email);
		Thread.sleep(2000);
		
		login.passField(password);
		Thread.sleep(8000);
		
		login.loginClick();
		

		Thread.sleep(4000);
		
		homePageAB home = new homePageAB(driver);
		
	    boolean targetPage = home.isContactUsDisplaying();
		
		if(exp.equalsIgnoreCase("Valid")) {
			
			if(targetPage==true) {
				
				Thread.sleep(2000);
			    home.profileIconClick();
			    
			    Thread.sleep(2000);
				home.LogoutClick();
				Assert.assertTrue(true);
			
			}
			
			else {
				
				Assert.assertTrue(false);
				
			}
		}
			
       if(exp.equalsIgnoreCase("Invalid")) {
			
			if(targetPage==true) {
				
				
				    driver.get(p.getProperty("appUrl"));
				   Thread.sleep(3000);
				    Assert.assertTrue(false);
			
			}
			
			else {
				
				Assert.assertTrue(true);
				
			}
		}
       
       Thread.sleep(5000);
       driver.get(p.getProperty("appUrl"));
	   Thread.sleep(3000);
	}
}
