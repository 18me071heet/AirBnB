package TC_AB;

import org.testng.annotations.Test;

import baseClass.BaseClassAB;
import pageObject.LogInAB;

public class Tc_Login extends BaseClassAB{
	
	
	@Test
	void loginDetails() throws InterruptedException {
		
		
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
		


		
	}
			
}
