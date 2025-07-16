package pageFactory;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUp_TC {

	WebDriver driver;
	
     public String randomString() {
		
		String generatedString = RandomStringUtils.randomAlphabetic(7);
		return generatedString;
	}
	
	public String randomNumber() {
		
		String generatedNumeric = RandomStringUtils.randomNumeric(10);
		return generatedNumeric;
		
	}
	
	public String randomAlphaNumeric() {
		String generatedString = RandomStringUtils.randomAlphabetic(4);
		String generatedNumeric = RandomStringUtils.randomNumeric(4);
        return(generatedString+generatedNumeric);
	}
	
	@Test(priority=1)
	void setUp() {
		
	    driver=new ChromeDriver();
		driver.get("https://airbnb-user.inheritxdev.in/auth/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=2)
	void addDetails() throws InterruptedException {
		
		
		String fname = randomString().toUpperCase();
		String lname = randomString().toLowerCase();
		String phone = randomNumber();
		String password = "Test@123";
		String email = fname + "@yopmail.com";
		
		
		SignUp_PageFactory sp = new SignUp_PageFactory(driver);
		
		sp.addFname(fname);
		Thread.sleep(1500);
		
		sp.addLname(lname);
		Thread.sleep(1500);
		
		sp.addEmail(email);
		Thread.sleep(1500);
		
		sp.addPhone(phone);
		Thread.sleep(1500);
		
	    sp.addPass(password);
	    Thread.sleep(1500);
	    
	    sp.addCpass(password);
	    Thread.sleep(1500);
	    
	    sp.chkPrivacy();
	    
	    Thread.sleep(10000);
	    
	    sp.btnSignupp();
	    
	    Thread.sleep(2000);
	    sp.linkLogin();
		
			
	}
}
