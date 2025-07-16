package testAnnotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo1 {

	WebDriver driver;
	
	
	   @BeforeClass
	   void login() throws InterruptedException {
		
		System.out.println("Login");
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://airbnb-user.inheritxdev.in/auth/login/email");
		
		
		WebElement txtEmailLogin= driver.findElement(By.xpath("//input[@placeholder='Email']"));
		txtEmailLogin.sendKeys("user23@yopmail.com");
		Thread.sleep(2000);
		
		WebElement txtPassword= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		txtPassword.sendKeys("Test@321");
		
		
		Thread.sleep(10000);
		
		WebElement btnLogin= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		btnLogin.click();
		
	}
	

	   @Test(priority=1)
	   void searchbyPrice() throws InterruptedException {
		
		System.out.println("Searching Band by Price");
		
		Thread.sleep(2000);
		
		WebElement filterButton = driver.findElement(By.xpath("//button[normalize-space()='Filter']"));
		filterButton.click();
		
		Thread.sleep(2000);
		WebElement minPrice = driver.findElement(By.xpath("//input[@type='number' and @min='0']"));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=''", minPrice);
		minPrice.sendKeys("200");
		
		Thread.sleep(2000);
		minPrice.sendKeys(Keys.TAB);
		
		
		WebElement maxPrice = driver.switchTo().activeElement();
		maxPrice.sendKeys("1200");
		
		
		Thread.sleep(2000);
		WebElement submitBtn = driver.findElement(By.xpath(" //button[normalize-space()='Submit']"));
		submitBtn.click();
		
		
	}
	
	
	
	  @AfterClass
	  void logout() throws InterruptedException {
		System.out.println("logout");
		
		Thread.sleep(3000);
		
		
		WebElement profileIcon = driver.findElement(By.xpath("//img[@src='/assets/header/User.svg']"));
		profileIcon.click();
		
		Thread.sleep(3000);
		
		WebElement logOut =driver.findElement(By.xpath("//a[@href='/auth/signout' and text()='Logout']"));
		logOut.click();
	
	}

}
