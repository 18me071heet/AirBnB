package TC_AB;

import org.testng.annotations.Test;

import baseClass.BaseClassAB;
import pageObject.SignUpAB;

public class Tc_SignUp extends BaseClassAB {



	@Test(priority=1,groups= {"Smoke"})
	void signUpDetails() throws InterruptedException {
		
		SignUpAB signup = new SignUpAB(driver);
		
		
		logger.info("Tc-01 --> Verify user is able to enter first name ");
	    Thread.sleep(2000);
		signup.frstNameField(randomString().toUpperCase());
		
		logger.info("Tc-02 --> Verify user is able to enter last name ");
		Thread.sleep(2000);
		signup.lastNamefield(randomString().toUpperCase());
		
		logger.info("Tc-03 --> Verify user is able to enter email ");
		Thread.sleep(2000);
		signup.emailField(randomString()+"@yopmail.com");
		
		logger.info("Tc-04 --> Verify user is able to enter phone number ");
		Thread.sleep(2000);
		signup.phoneField(randomNumber());
		
	
		
		String password = randomAlphaNumeric();
		
		logger.info("Tc-05 --> Verify user is able to enter password ");
		Thread.sleep(2000);
		signup.passField(password);
		
		logger.info("Tc-06 --> Verify user is able to enter confirm password ");
		Thread.sleep(2000);
		signup.cpassField(password);
		
		Thread.sleep(2000);
		signup.privacyClick();
		
		logger.info("Tc-07 --> Verify user is able to sign up by clicking sign up button");
		Thread.sleep(6000);
		signup.signUp();
				
	}
}
