package pageFactory;

import java.io.InputStream;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class LogIn_TC {

	WebDriver driver;
	
	public Logger logger;
	
	@Test
	public void checkLog4jConfig() {
	    InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("log4j2.xml");
	    System.out.println("✅ log4j2.xml found on classpath: " + (is != null));
	}
	
	@Test(priority=1)
	void setUp() {
		
		logger = LogManager.getLogger(this.getClass());
		
		System.out.println("Log4j2 Config Location: " + System.getProperty("log4j.configurationFile"));

		logger.info("Navigating to the site");
		
	   driver=new ChromeDriver();
		driver.get("https://airbnb-user.inheritxdev.in/auth/login/email");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=2)
	void loginDetails() throws InterruptedException {
		
		
		logger.info("Tc-01 --> Add Login Credentials ");
		LogIn_PageFactory pf = new LogIn_PageFactory(driver);
		pf.addEmail("user23@yopmail.com");
		Thread.sleep(1000);
		pf.addPass("Test@321");
		Thread.sleep(10000);
		
		pf.login();
		
	}
	

	@Test(priority=3)
	void quit() {
		
		
		driver.quit();
	}
}
