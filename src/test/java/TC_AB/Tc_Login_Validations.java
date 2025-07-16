package TC_AB;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseClassAB;
import pageObject.Validation_LogIn;

public class Tc_Login_Validations extends BaseClassAB{

	@Test
	void verifyLoginValidations() throws InterruptedException {
		
		Validation_LogIn login = new Validation_LogIn(driver);
		
		logger.info("Tc-01 Verify validation message is displaying or not by keep email field blank ");
		
		login.addPass("Test@321");
		
		Thread.sleep(2000);
		
		login.clickLogin();
		
		Assert.assertEquals(login.getEmailValidation(), "Please Enter Valid Email.");
		
		logger.info("Tc-02 Verify validation message is displaying or not by keep password field blank");
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		login.addEmail("user7@yopmail.com");
		
		Thread.sleep(2000);
		
		login.clickLogin();
		
		Assert.assertEquals(login.passwordValidation(),"Please Enter Password.");
		
		logger.info("Tc-03 Verify validation message is displaying by entering Invalid email address");
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		login.addEmail("user7");
		
		Thread.sleep(2000);
		
		login.addPass("Test@123");
		
		Thread.sleep(2000);
		
		login.clickLogin();
		
		Assert.assertEquals(login.getInvalidEmailValidation(), "Please Enter Valid Email.");
		
		
		
		
	
	}
}
