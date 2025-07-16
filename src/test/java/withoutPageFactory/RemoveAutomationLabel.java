package withoutPageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemoveAutomationLabel {

	public static void main(String[] args) {
		
		WebDriver driver;
	
		ChromeOptions co = new ChromeOptions();
		co.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
	    driver = new ChromeDriver(co);
	    driver.get("https://airbnb-user.inheritxdev.in/auth/login/email");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   

	}

}
