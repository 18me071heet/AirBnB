package TC_AB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseClassAB;
import pageObject.Validation_SignUP;

public class Tc_SignUp_Validations extends BaseClassAB{

	@Test
	void verifyValidationMsg() throws InterruptedException {
		
		Validation_SignUP  signupPage = new Validation_SignUP(driver);
		
		logger.info("Tc-01 --> Verify user is navigate to the sign up screen ");
		Thread.sleep(2000);
		
		WebElement signUpLink = driver.findElement(By.xpath(" //a[normalize-space()='Signup']"));
		signUpLink.click();
		
		signupPage.signUpBtn();
		
		
		logger.info("Tc_01 verify validation message is displaying by keep first name blank");
		Assert.assertEquals(signupPage.getNameValidation(), "Please Enter Valid First Name.");
		
		logger.info("Tc_02 verify validation message is displaying by keep email blank");
		Assert.assertEquals(signupPage.getEmailValidation(), "Please Enter Valid Email.");
		
		logger.info("Tc_03 verify validation message is displaying by keep mobile number blank");
		Assert.assertEquals(signupPage.getMobileValidation(), "Please Enter Valid Mobile Number.");
		
		logger.info("Tc_04 verify validation message is displaying by keep password or confirm password blank");
		Assert.assertEquals(signupPage.getPasswordValidation(), "Password Must include at least one lowercase letter.");
		
		logger.info("Tc_05 verify validation message is displaying by not selecting terms and conditions");
		Assert.assertEquals(signupPage.getTermsValidation(), "Please Agree Terms and conditions");
		
		
	//	Assert.assertEquals(signupPage.getCaptchaValidation(), "Please Verify Captcha.");
		
		signupPage.passField("Test@123");
		Thread.sleep(2000);
		
		signupPage.cpassField("Test@321");
		Thread.sleep(2000);
		
		
		logger.info("Tc_06 verify validation message is displaying by entering different password ");
		Assert.assertEquals(signupPage.getCpassValidation(), "Please match password and confirm password.");
		
		signupPage. frstNameField("4567");
		
		logger.info("Tc_07 Verify numeric inputs are allowed in the last name field ");
		Assert.assertEquals(signupPage.fnameValidation(), "Please Enter Valid First Name.");
		
	  
	}
	

}

