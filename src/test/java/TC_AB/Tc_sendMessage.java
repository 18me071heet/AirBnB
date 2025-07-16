package TC_AB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClassAB;
import pageObject.LogInAB;
import pageObject.messageScreen;

public class Tc_sendMessage extends BaseClassAB {

	@Test(priority=1,groups= {"Smoke,Functional"})
	void sendMessage() throws InterruptedException {
		
		
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
		
		messageScreen ms = new messageScreen(driver);
		
		logger.info("Tc-04 -->Verify side bar is open by clicking profile icon ");
		
		ms.profileIconClick();
		
		Thread.sleep(2000);
		
		logger.info("Tc-05 --> Verify Message screen is displaying by clicking Message ");
		ms.messageClick();
		Thread.sleep(4000);
		
		ms.searchBoxClick();
		Thread.sleep(2000);
		

		logger.info("Tc-06 --> Verify user is able to fill the search box ");
		
		logger.info("Tc-07 --> Verify record is displaying according to the searching ");
		
		try {
			
		    ms.txtArea("Anand");

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement searchResult = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//div[contains(text(),'Anand')]")
		    ));

		    if (searchResult.isDisplayed()) {
		        searchResult.click();
		        System.out.println("Clicked on Anand");
		    } else {
		        System.out.println("No user found");
		    }
			    
		} 
		
		
		catch (Exception e) 
		
		{
		    System.out.println("Exception occurred: " + e.getMessage());
		    e.printStackTrace();
	
		}
		
	    //	Thread.sleep(3000);
		
		  logger.info("Tc-08 --> Verify Message is send to the user or not ");
	      ms.enterSend();
	      
	      Thread.sleep(3000);
	      
	      logger.info("Tc-09 --> Verify filter popup is displaying or not by clicking filter icon ");
	      ms.filterIconClick();
	      
	      
	      Thread.sleep(2000);
	      ms.clickFilterButton();
	      
	      logger.info("Tc-10 --> Verify user is able to select Today filter ");
	      Thread.sleep(2000);
	      ms.todayFilter();
	      
	      Thread.sleep(2000);
	      
	      logger.info("Tc-11 --> Verify chat list is displaying according to select filter ");
	      ms.submitBtn();
		
		}
}
