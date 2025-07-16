package withoutPageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dataDriven.DPExcelUtility;

public class TC_DataDriven {

	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		driver=new ChromeDriver();
		driver.get("https://airbnb-user.inheritxdev.in/auth/login/email");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider= "LoginData",dataProviderClass=DPExcelUtility.class)
	void logInDetails(String email,String pass) throws InterruptedException {
		
	
		WebElement txtEmailLogin= driver.findElement(By.xpath("//input[@placeholder='Email']"));
		txtEmailLogin.sendKeys(email);
		Thread.sleep(2000);
		
		WebElement txtPassword= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		txtPassword.sendKeys(pass);
		
		
		Thread.sleep(10000);
		
		WebElement btnLogin= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		btnLogin.click();
		
		
		boolean homePage = driver.findElement(By.xpath("//a[@href='/']//img")).isDisplayed();
		
		if(homePage==true) {
			
			Assert.assertTrue(true);
		}
		
	}
}
