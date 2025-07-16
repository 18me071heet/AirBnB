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

public class LogInConfig {
	
WebDriver driver;
	
	public Logger logger;
	public Properties p;
	
	@Test(priority=1,groups={"Smoke","Functional"})
	void logIn() throws InterruptedException, IOException {
		
		logger = LogManager.getLogger(this.getClass());
		
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		ChromeOptions co = new ChromeOptions();
		co.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		
		driver.get(p.getProperty("appUrl"));
		
		logger.info("Tc-01 Log In Navigation and Added Login Fields   ");
		
		WebElement txtEmailLogin= driver.findElement(By.xpath("//input[@placeholder='Email']"));
	    txtEmailLogin.sendKeys(p.getProperty("email"));
		
		Thread.sleep(2000);
		
		WebElement txtPassword= driver.findElement(By.xpath("//input[@placeholder='Password']"));
	    txtPassword.sendKeys(p.getProperty("password"));
		
		
		Thread.sleep(10000);
		
		WebElement btnLogin= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		btnLogin.click();
		
}
}
