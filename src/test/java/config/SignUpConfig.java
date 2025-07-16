package config;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SignUpConfig {
	
    WebDriver driver;
	
	public Logger logger;
	public Properties p;
	
	@Test(priority=1,groups={"Smoke","Functional"})
	void signup() throws InterruptedException, IOException {
		
		logger = LogManager.getLogger(this.getClass());
		
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		ChromeOptions co = new ChromeOptions();
		co.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		
		driver.get(p.getProperty("appUrlSignUp"));
		
		logger.info("Tc-01 Log In Navigation and Added Login Fields   ");
		
		WebElement txtFname= driver.findElement(By.xpath("//input[@placeholder='Your first name']"));
		txtFname.sendKeys(p.getProperty("firstname"));
		
		Thread.sleep(2000);
		
		WebElement txtLastName= driver.findElement(By.xpath("//input[@placeholder='Your last name']"));
		txtLastName.sendKeys(p.getProperty("lastname"));
		
	    
		WebElement txtEmail= driver.findElement(By.xpath("//input[@placeholder='Email']"));
		txtEmail.sendKeys(p.getProperty("emailSignUp"));
		
		
		
		WebElement txtNum= driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		txtNum.sendKeys(p.getProperty("number"));
		
		
		WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys(p.getProperty("password"));
		
		
		WebElement cpassword= driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
		cpassword.sendKeys(p.getProperty("confirmPassword"));
		
		
		WebElement chkPc= driver.findElement(By.xpath("//input[@id='consentCheckbox']"));
		chkPc.click();
		Thread.sleep(15000);
		
		WebElement btnSignup= driver.findElement(By.xpath("//button[normalize-space()='Sign Up']"));
		btnSignup.click();
		
}
}
