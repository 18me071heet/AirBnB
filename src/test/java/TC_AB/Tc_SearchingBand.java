package TC_AB;

import org.testng.annotations.Test;

import baseClass.BaseClassAB;
import pageObject.LogInAB;
import pageObject.SearchEntertainer;

public class Tc_SearchingBand extends BaseClassAB {
	
	   void threadSleep() throws InterruptedException {
       	
       	Thread.sleep(3000);
       }
	   
	@Test(priority=1,groups= {"Functional"})
	void searchBand() throws InterruptedException {
		
		         
		            LogInAB login = new LogInAB(driver);
			
					logger.info("Tc-01 --> Verify user is able to enter email ");
					
					
					threadSleep();
					login.emailField(p.getProperty("email"));
					
					
					logger.info("Tc-02 --> Verify user is able to enter password ");
					threadSleep();
					login.passField(p.getProperty("password"));
					
					logger.info("Tc-03 --> Verify user is able to login by clicking login button");
					Thread.sleep(10000);
					login.loginClick();
					
					SearchEntertainer search = new SearchEntertainer(driver);
					
					threadSleep();
					logger.info("Tc-04 --> Verify Filter option is displaying by clicking filter icon");
					search.clickFilterIcon();
					
					
					threadSleep();
					logger.info("Tc-05 --> Verify Entertainment types are displaying or not by clicking Entertainment type ");
					search.clickEntertainmentType();
					
					
					threadSleep();
					logger.info("Tc-06 --> Verify user is able to select specific entertainment type by clicking on it ");
					search.specificEventSelect();
					
					
					threadSleep();
					logger.info("Tc-07 --> Verfy Event types are displaying or not by clicking Event Type dropdown ");
					search.eventTypeClick();
					
					
					threadSleep();
					logger.info("Tc-08 --> Verify user is able to select specific event type by clikcing on it ");
					search.specificEventTypeSelect();
					
					
					threadSleep();
					logger.info("Tc-09 --> Verify location is displaying or not by clicking on Location ");
					search.eventLocationSelect();
					
					
					threadSleep();
					logger.info("Tc-10 --> Verify user is able to select specific location by clicking on it ");
					search.specificLocationSelect();
					
					
					
					
	}
}
