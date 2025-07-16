package withoutPageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssertDemo {


	WebDriver driver;
	@Test(priority=1,groups={"Smoke","Functional"})
	void logIn() throws InterruptedException {
		
		
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
		
		boolean logo = driver.findElement(By.xpath("//a[@href='/']//img")).isDisplayed();
		Assert.assertEquals(logo, true);
		
		Assert.assertEquals(driver.getTitle(), "Airbnb");
		
		
	}
	
	
	//@Test
	void softAssertion() {
		
	
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(123, 124);   
		sa.assertAll(); 
	}

}
