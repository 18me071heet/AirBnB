package dataDriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DataProviderLogIn {

  WebDriver driver;
	
  @BeforeClass
  @Parameters({"browser"})
  public void setup(String br) {
    
    if (br.equalsIgnoreCase("chrome")) {
        driver = new ChromeDriver();
    } else if (br.equalsIgnoreCase("firefox")) {
        driver = new FirefoxDriver();
    } else {
        throw new IllegalArgumentException("Browser not supported: " + br);
    }

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
  
  }
	
	@Test(dataProvider="dp")
	void logIn(String email,String pwd) throws InterruptedException {
		
	     	driver.get("https://airbnb-user.inheritxdev.in/auth/login/email");
	     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		
		WebElement userEmail =driver.findElement(By.xpath("//input[@placeholder='Email']"));
		userEmail.sendKeys(email);
		
		WebElement userPass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		userPass.sendKeys(pwd);
		
		Thread.sleep(9000);
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		btnLogin.click();
		
	}

	
	@DataProvider(name="dp")
	Object[][] loginData()
	{
		
		Object data[][] =
			{
				{"abc@gmail.com","test123"},
		        {"abc@gmail.com","1234"},
			    {"abc@gmail.com","4567"},
			    {"user23@yopmail.com","Test@321"}
	
};

     return data;

	}
	
	@AfterClass()
	void quit() {
		driver.quit();
	}
}
