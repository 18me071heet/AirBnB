package TC_AB;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import baseClass.BaseClassAB;
import pageObject.AddReview;
import pageObject.LogInAB;

public class Tc_AddReview extends BaseClassAB{

	@Test(priority=1,groups= {"Smoke,Functional"})
	public void addReview() throws InterruptedException {
	
		     LogInAB login = new LogInAB(driver);
			
			logger.info("Tc-01 --> Verify user is able to enter email ");
			
			Thread.sleep(2000);
			login.emailField(p.getProperty("email"));
			
			
			logger.info("Tc-02 --> Verify user is able to enter password ");
			Thread.sleep(2000);
			login.passField(p.getProperty("password"));
			
			logger.info("Tc-03 --> Verify user is able to login by clicking login button");
			Thread.sleep(10000);
			login.loginClick();
			
			
	    	AddReview review = new AddReview(driver);
		
		    Thread.sleep(2000);
		
		    logger.info("Tc-04 --> Verify profile screen is displaying by clicking profile icon");
		    review.clickprofileIcon();
		 
		    Thread.sleep(2000);
		 
		    logger.info("Tc-05 --> Verify booking screen is displaying by clicking bookings");
            review.btnMyBookings();
            
            Thread.sleep(3000);
        
            logger.info("Tc-06 --> Verify filter is getting open is or not by clicking filer icon ");
            review.filter();
        
            Thread.sleep(3000);
        
            logger.info("Tc-07 --> Verify band records are displaying according to select filter");
            Thread.sleep(2000);
        
            review.saveFilter();
          
            Thread.sleep(5000);
        
            logger.info("Tc-08 --> Verify review popup is open by clicking Add Review ");

            List<WebElement> addReviewButtons = driver.findElements(By.xpath("//button[normalize-space()='Add Review']"));

            for (WebElement button : addReviewButtons) {
        	
            if (button.isDisplayed()) {
            	button.click(); 
                break;
            }
         }

          Thread.sleep(4000);
          
          logger.info("Tc-09 --> Verify user is able to select rating stars ");
        
          List<WebElement> stars = driver.findElements(By.xpath("//svg[@width='32' and @height='32']"));
        
          for(int i=0;i<3 && i<stars.size();i++) {
        	
        	if(stars.get(i).isDisplayed()) {
        		
        		stars.get(i).click();
        		Thread.sleep(4000);
        	}
         }
        
          logger.info("Tc-10 --> Verify user is able to add reviews by clicking on Description text box");
        
         review.addReviews("Event was very well. I had enjoyed after a long time . I will go one more time . Event was really good");
        
         Thread.sleep(3000);
        
         logger.info("Tc-11 --> Verify review is getting send or not by clicking on submit ");
        
         review.send();
        
        
	    }
}
