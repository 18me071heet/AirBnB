package testAnnotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {

	
WebDriver driver;
	

	@BeforeMethod
	public void setUp() {
	    System.out.println("Set up");
	    
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://airbnb-user.inheritxdev.in/auth/login/email");
		
	 
	    
	}
	
	 @Test
	 public void login() throws InterruptedException {
		
		WebElement txtEmailLogin= driver.findElement(By.xpath("//input[@placeholder='Email']"));
		txtEmailLogin.sendKeys("user23@yopmail.com");
		Thread.sleep(2000);
		
		WebElement txtPassword= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		txtPassword.sendKeys("Test@321");
		
		
		Thread.sleep(10000);
		
		WebElement btnLogin= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		btnLogin.click();
	}
	
	 @AfterMethod
	  void logOut() throws InterruptedException {
		
        Thread.sleep(3000);
		
		
		WebElement profileIcon = driver.findElement(By.xpath("//img[@src='/assets/header/User.svg']"));
		profileIcon.click();
		
		Thread.sleep(3000);
		
		WebElement logOut =driver.findElement(By.xpath("//a[@href='/auth/signout' and text()='Logout']"));
		logOut.click();
		
		
	}

}
