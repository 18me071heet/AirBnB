package withoutPageFactory;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;


public class Tc_AB{

	WebDriver driver;
	
	public Logger logger;
	public Properties p;
		
			
	// For random generating name , email , number , password 
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
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

	
	// Test Case : 1 --> Sign Up Navigation 
	
//	@Test(priority=1,groups={"Smoke","Functional"})
	void setup() throws InterruptedException {
		
		
		logger = LogManager.getLogger(this.getClass());
		

		ChromeOptions co = new ChromeOptions();
		co.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		logger.info("Tc-01 Opening the Sign Up Site");
		driver.get("https://airbnb-user.inheritxdev.in/auth/signup");
		
	}
	
	
	// Test Case : 2 --> Add User Details 
	
	
 //	@Test(priority=2,groups={"Smoke","Functional"}))
	void addDetails() throws InterruptedException {
		
		//Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=17254523284975909880&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9145648&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		
	 
	    String fname = randomString().toUpperCase();
	    String lanme = randomString().toUpperCase();
	    String email = randomString()+"@yopmail.com";
	    String mobileNum = randomNumber();
	    String password = randomAlphaNumeric() + "@";
		
	    
		logger.info("Tc-02 Add the Sign Up details ");
		
		WebElement txtFname= driver.findElement(By.xpath("//input[@placeholder='Your first name']"));
		txtFname.sendKeys(fname);
		
		Thread.sleep(2000);
		
		WebElement txtLastName= driver.findElement(By.xpath("//input[@placeholder='Your last name']"));
		txtLastName.sendKeys(lanme);
		Thread.sleep(2000);
		
		
		WebElement txtEmail= driver.findElement(By.xpath("//input[@placeholder='Email']"));
		txtEmail.sendKeys(email);
		Thread.sleep(2000);
		
		
		WebElement txtNum= driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		txtNum.sendKeys(mobileNum);
		Thread.sleep(2000);
		
		WebElement password1= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password1.sendKeys(password);
		Thread.sleep(2000);
		
		WebElement cpassword= driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
		cpassword.sendKeys(password);
		Thread.sleep(2000);
		
		WebElement chkPc= driver.findElement(By.xpath("//input[@id='consentCheckbox']"));
		chkPc.click();
		Thread.sleep(15000);
		
		WebElement btnSignup= driver.findElement(By.xpath("//button[normalize-space()='Sign Up']"));
		btnSignup.click();
		
	
		
	}
	

	// Test Case : 3 --> Log In Navigation and Added Login Fields  
	
	

	@Test(priority=3,groups={"Smoke","Functional"})
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
		driver.get("https://airbnb-user.inheritxdev.in/auth/login/email");
		
	
		
		logger.info("Tc-03 Log In Navigation and Added Login Fields   ");
		
		WebElement txtEmailLogin= driver.findElement(By.xpath("//input[@placeholder='Email']"));
		txtEmailLogin.sendKeys("user23@yopmail.com");
		
	
		
		Thread.sleep(2000);
		
		WebElement txtPassword= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		txtPassword.sendKeys("Test@321");
		
	
		
		
		Thread.sleep(10000);
		
		WebElement btnLogin= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		btnLogin.click();
		
		
	}
	
	
	// Test Case : 4 --> Search the Band after Login .
	
	
//	@Test(priority=4,groups={"Smoke","Functional"}dependsOnMethods= {"logIn"})
	void searchBand() throws InterruptedException {
		
		
		logger.info("Tc-04 Search the Band after Login .");
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='searchTrigger']")) ;
		searchbox.sendKeys("Astonas");
		
		
		
		Thread.sleep(4000);
		
	}
	
	
	// Test Case : 5 --> Add to wish list to the specific Band and click on the band details .
	
	
//	@Test(priority=5,groups={"Smoke","Functional"},dependsOnMethods= {"searchBand"})
	void addtoWishlist() throws InterruptedException {
		
		

		logger.info("Tc-05  Add to wish list to the specific Band and click on the band details.");
	
		WebElement wishList =  driver.findElement(By.xpath("//img[@class='w-full h-full object-contain']"));
		wishList.click();
		
		WebElement clickBand = driver.findElement(By.xpath("//h1[normalize-space()='Astonas']"));
		clickBand.click();
		
		Thread.sleep(4000);
		
		
	}

	// Test Case : 6 --> Search Band based on the Price ( Min and Max ) Filter 
	
	@Test(priority=6,groups={"Smoke","Functional"},dependsOnMethods= {"logIn"})
	
	void priceFilter() throws InterruptedException {
		

		logger.info("Tc-06 Search Band based on the Price ( Min and Max ) Filter .");
		
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
		
		
		//Actions actions = new Actions(driver);
	   //	actions.sendKeys(Keys.TAB).perform();
		
		//WebElement maxPrice = driver.findElement(By.xpath("//input[@type='number' and @max='10000']"));
	   //	Thread.sleep(2000);
	   //	maxPrice.sendKeys("3000");
		
		WebElement maxPrice = driver.switchTo().activeElement();
		maxPrice.sendKeys("1200");
		
		
		Thread.sleep(2000);
		WebElement submitBtn = driver.findElement(By.xpath(" //button[normalize-space()='Submit']"));
		submitBtn.click();
		
		
		
	}
	
	// Test Case : 7 --> Load More Bands by clicking  " Show More " after filtering
	
	@Test(priority=7,groups={"Smoke","Functional"},dependsOnMethods= {"priceFilter"})
	void showMoreBand() throws InterruptedException {
		
		logger.info("Tc-07 Load More Bands by clicking  \" Show More \" after filtering.");
		Thread.sleep(2500);
		WebElement showMoreBtn = driver.findElement(By.xpath("//button[normalize-space()='Show More']"));
		showMoreBtn.click();
		
	}
	
	
	// Test Case : 8 --> Switch to Host .
	
	@Test(priority=8,groups={"Smoke","Functional"},dependsOnMethods= {"showMoreBand"})
	void switchtoHost() throws InterruptedException {
		
		
		logger.info("Tc-08 Switch to Host ..");
		Thread.sleep(3000);
		WebElement switchtoHost = driver.findElement(By.xpath(" //button[normalize-space()='Switch to host']"));
		switchtoHost.click();
	}
	
	// Test Case : 9 --> Switch to User .
	
	//@Test(priority=9,groups={"Smoke","Functional"})
		void switchtozUser() throws InterruptedException {
			
			
			logger.info("Tc-09 Switch to User..");
			Thread.sleep(3000);
			WebElement switchtoUser = driver.findElement(By.xpath("//button[normalize-space()='Switch to user']"));
			switchtoUser.click();
		}
		
		
	
	// Test Case : 10 --> Navigation to Entertainer > Booking Screen
	
	@Test(priority=10,groups={"Smoke","Functional"},dependsOnMethods= {"switchtoHost"})
	void myBooking() throws InterruptedException {
		
		logger.info("Tc-10 Navigation to Entertainer > Booking Screen");
		Thread.sleep(3000);
		
		WebElement profileIcon = driver.findElement(By.xpath("//img[@src='/assets/header/User.svg']"));
		profileIcon.click();
		
		Thread.sleep(2000);
		
		WebElement myBooking = driver.findElement(By.xpath("//a[text()='Bookings']"));
		myBooking.click();
		
	}
	
	// Test Case : 11 --> Accept the specific Booking 
	
	
	//@Test(priority=11,groups={"Smoke","Functional"})
	void acceptBooking() throws InterruptedException {
		
		logger.info("Tc-11 Accept the specific Booking ");
		
        Thread.sleep(2000);
		
		WebElement upComing = driver.findElement(By.xpath(" //button[normalize-space()='Upcoming Bookings']"));
		upComing.click();
		
		Thread.sleep(5000);
		
		
	/*	WebElement secondIcon = driver.findElement(
			    By.xpath("(//div[.//svg[@width='24' and @height='24']])[2]")
			);

		secondIcon.click();
			
			Thread.sleep(2000);
		
		WebElement btnSave = driver.findElement(By.xpath(" //button[normalize-space()='Save']"));
		btnSave.click();
		
		*/
		
		
		List<WebElement> inProgressStatuses = driver.findElements(By.xpath("//span[contains(text(),'In Progress')]"));

		for (WebElement status : inProgressStatuses) {
		    if (status.isDisplayed()) {
		      
		        WebElement acceptButton = driver.findElement(By.xpath(".//button[normalize-space()='Accept']"));
		        acceptButton.click();
		        break; 
		    }
		}
		
	    Thread.sleep(2000);
		
		}
		
	
	
	
	// Test Case : 12 --> Reject the specific Booking
	
	@Test(priority=12,groups= {"Functional"})
	void rejectBooking() throws InterruptedException {
		
		logger.info("Tc-12 --> Reject the specific Booking ");
		
		Thread.sleep(2000);
		
		WebElement btnReject = driver.findElement(By.xpath("(//button[contains(text(),'Reject')])[6]"));
		btnReject.click();
	}
	
	
	// Test Case : 13 --> Navigate to Home Page
	
	@Test(priority=13,groups= {"Functional"})
	void homePage() throws InterruptedException {
		
		logger.info("Tc-13 --> Navigate to Home Page ");
		
		Thread.sleep(2000);
		
		WebElement homeLogo = driver.findElement(By.xpath("//a[@href='/']//img"));
		homeLogo.click();
	}
	
	
	
	
//Test Case : 14 --> Band Genre Category Navigation.
	
	@Test(priority=14,groups= {"Functional"})
	void categoryNavigation() throws InterruptedException {
		
		logger.info("Tc-14 --> Band Genre Category Navigation. ");
		Thread.sleep(2000);
		
		WebElement btnMusicians = driver.findElement(By.xpath("//span[text()='Musicians']"));
		btnMusicians.click();
	}
	
	
	// Test Case : 15 --> Navigate to " My Profile " page .
	
	@Test(priority=15,groups= {"Smoke","Functional"})
	void profileNavigation() throws InterruptedException {
		
		logger.info("Tc-15 --> Navigate to My Profile page .");
		
		
		Thread.sleep(2000);
		
		WebElement profileIcon = driver.findElement(By.xpath("//img[@src='/assets/header/User.svg']"));
		profileIcon.click();
		
		Thread.sleep(2000);
		WebElement myProfile = driver.findElement(By.xpath("//a[@href='/user/profile' and text()='My Profile']"));
		myProfile.click();
		
		Thread.sleep(3000);
		
		
	}
	
	// Test Case : 16 -> Edit the First Name and Save.
	
	@Test(priority=16,groups= {"Functional"})
	void editName() throws InterruptedException {
		
		logger.info("Tc-16 -> Edit the First Name and Save..");
		WebElement editName = driver.findElement(By.xpath("(//button[contains(text(),'Edit')])[2]"));
		editName.click();
		
		Thread.sleep(2000);
		WebElement txtName = driver.findElement(By.xpath("//input[@placeholder='Your Name']"));
		txtName.sendKeys("John");
		
		Thread.sleep(2000);
		WebElement btnSave = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		btnSave.click();
		
		Thread.sleep(2000);
		WebElement homeLogo = driver.findElement(By.xpath("//a[@href='/']//img"));
		homeLogo.click();
		
	}
	
	
	// Test Case : 17 -> Select Specific Entertainment type , Event Type , Event Location , Descending filter ( Custom Dropdown )
	
	@Test(priority=17,groups= {"Functional"})
	void selectDropdown() throws InterruptedException {
		
		logger.info("Tc-17 -> Select Specific Entertainment type , Event Type , Event Location , Descending filter ( Custom Dropdown )");
		Thread.sleep(2000);
		
		WebElement filterIcon = driver.findElement(By.xpath("//span[@class='select-none']//*[name()='svg']"));
		filterIcon.click();
		
		Thread.sleep(2000);
		WebElement entDropdown = driver.findElement(By.xpath("//span[normalize-space()='Entertainment type']"));
		entDropdown.click();
		
		WebElement specificEntertainmentType = driver.findElement(By.xpath("//li[normalize-space()='Theater and Performing Arts']"));
		specificEntertainmentType.click();
		
		Thread.sleep(2000);
		
		WebElement eventTypeDrop = driver.findElement(By.xpath("//span[normalize-space()='Event Types']"));
		eventTypeDrop.click();
		
		Thread.sleep(2000);
		
		WebElement specificEventType = driver.findElement(By.xpath(" //li[normalize-space()='Private Party']"));
		specificEventType.click();
		
		Thread.sleep(2000);
		
		WebElement locationDrop = driver.findElement(By.xpath("//span[normalize-space()='Event location']"));
		locationDrop.click();
		
		Thread.sleep(2000);
		
		WebElement specificLocation = driver.findElement(By.xpath(" //li[normalize-space()='London']"));
		specificLocation.click();
		
		Thread.sleep(2000);
		
		WebElement ascFilter = driver.findElement(By.xpath("//span[normalize-space()='Ascending']"));
		ascFilter.click();
		
		WebElement disFilter = driver.findElement(By.xpath(" //li[normalize-space()='Descending']"));
		disFilter.click();
		
		Thread.sleep(1000);
		
		
		//Select drop = new Select(dropdown);
		
		//drop.selectByVisibleText("Theater and Performing Arts");
		
	}
	
	@Test(priority=18,groups= {"Functional"})
	void createBand() throws InterruptedException {
		
		logger.info("Tc-18 -> Create the Band");
		
		Thread.sleep(3000);
		WebElement switchtoHost = driver.findElement(By.xpath(" //button[normalize-space()='Switch to host']"));
		switchtoHost.click();
		
		Thread.sleep(2000);
		
		WebElement btnCreate = driver.findElement(By.xpath(" //button[contains(text(),'Create New Event')]"));
		btnCreate.click();
		
		Thread.sleep(2000);
		WebElement btnStarted = driver.findElement(By.xpath("//button[normalize-space()='Get started']"));
		btnStarted.click();
		
		Thread.sleep(2000);
		WebElement txtbandName = driver.findElement(By.xpath("//input[@id='bandName']"));
		txtbandName.sendKeys("myBand");
		
		Thread.sleep(2000);
		WebElement txtDescription = driver.findElement(By.xpath(" //textarea[@id='description']"));
		txtDescription.sendKeys("Book your seats now and feel the good vibes with your happy people ");
		
		Thread.sleep(2000);
		WebElement txtMember = driver.findElement(By.xpath(" //input[@id='members']"));
		txtMember.clear();
		txtMember.sendKeys("100");
		
		Thread.sleep(2000);
		WebElement btnNext = driver.findElement(By.xpath(" //button[normalize-space()='Next']"));
		btnNext.click();
		
		Thread.sleep(3000);
		WebElement switchtoUser = driver.findElement(By.xpath("//button[normalize-space()='Switch to user']"));
		switchtoUser.click();
		
	
		
	}
	
	//@Test(priority=19)
	void bandDetails() throws InterruptedException {
		
		
		logger.info("Tc-19 -> Specific band details");
		Thread.sleep(2000);
		
		WebElement homePage = driver.findElement(By.xpath("//a[@href='/']//img"));
		homePage.click();
		
		Thread.sleep(2000);
		
		WebElement specifiBandDetails = driver.findElement(By.xpath("//p[contains(text(),'We are introducing our new band')]"));
		specifiBandDetails.click();
		
		Thread.sleep(4000);
		
		WebElement droplocation = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
		droplocation.click();
		
		Thread.sleep(3000);
		
		WebElement dropEvent = driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
		dropEvent.click();
		
		
		
	}
	
	
	// Test : 20 -> Bookings Navigation
	
@Test(priority=20,groups= {"Smoke"})
	void bookingsNavigation() throws InterruptedException {
		
		
		logger.info("Tc-20 ->Bookings Navigation");
		Thread.sleep(3000);
		WebElement profileIcon = driver.findElement(By.xpath("//img[@src='/assets/header/User.svg']"));
		profileIcon.click();
		
		Thread.sleep(3000);
		WebElement btnMyBookings = driver.findElement(By.xpath("//a[@href='/user/booking' and text()='My Bookings']"));
		btnMyBookings.click();
		
	}
	

   // Test Case : 21 -> User > Booking Filter .

  @Test(priority=21,groups= {"Functional"})
  void filterBooking() throws InterruptedException {
	
	logger.info("Tc-21 -> Filter the Booking");
	Thread.sleep(3500);
	
	
	
	Thread.sleep(2000);
	
	WebElement LatestToOldest = driver.findElement(By.xpath("(//*[local-name()='svg' and @width='24' and @height='24'])[2]"));
	LatestToOldest.click();
	
	Thread.sleep(2000);
	
	WebElement inProgress = driver.findElement(By.xpath("//span[normalize-space()='In Progress']"));
	inProgress.click();
	
	Thread.sleep(2000);
	WebElement OldestToLatest = driver.findElement(By.xpath(" //span[normalize-space()='Oldest to Latest']"));
	OldestToLatest.click();
	
	Thread.sleep(2000);
	
	WebElement btnSave = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
	btnSave.click();
	

}
	
	
	//@Test(priority=22,groups= {"Functional"})
	void cancelBooking() throws InterruptedException {
	
		logger.info("Tc-22 -> Cancel Booking");
		Thread.sleep(3000);
		
		
		//WebElement btnCancel = driver.findElement(By.xpath(" (//button[contains(text(),'Cancel')])[2]"));
		//btnCancel.click();
		
		
		List<WebElement> cancelButtons = driver.findElements(By.xpath("//button[text(),'Cancel']"));

		if (!cancelButtons.isEmpty()) {
		    cancelButtons.get(0).click(); 
		} else {
		    System.out.println("No Cancel button found.");
		}

		
		
	}
	
	
	// Test Case : 23 -> Navigate to Listed Band
	
			@Test(priority=23,groups= {"Functional"})
			void listedBand() throws InterruptedException {
				
				logger.info("Tc-22 -> Navigate to Listed Band");
				Thread.sleep(3000);
				
				WebElement switchtoHost = driver.findElement(By.xpath("//button[normalize-space()='Switch to host']"));
				switchtoHost.click();
				
				Thread.sleep(2000);
				
				WebElement profileIcon = driver.findElement(By.xpath("//img[@src='/assets/header/User.svg']"));
				profileIcon.click();
				
				Thread.sleep(2000);
				
				WebElement btnListedBand = driver.findElement(By.xpath("//a[@href='/entertainer/listed-band' and contains(text(), 'Listed Band')]"));
				btnListedBand.click();
				
				
			}
			
			// Test Case : 24 -> Change the Band Details
			
			@Test(priority=24,groups= {"Functional"})
			void changeDetails() throws InterruptedException {
				
				logger.info("Tc-23 -> Change the Band Details");
				Thread.sleep(2000);
				
			//	WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(
					 //   By.xpath("(//button[text()='Edit' and contains(@class, 'bg-[#0368FF]')])[1]")
					//));
				//	editButton.click();
				
				

				Thread.sleep(9000);

				WebElement txtBand = driver.findElement(By.xpath("//input[@id='band_name']"));
				txtBand.clear();
				txtBand.sendKeys("ThunderBitt");
				
				Thread.sleep(4000);
				
				WebElement txtDescription =  driver.findElement(By.xpath("//textarea[@id='Description']"));
				txtDescription.clear();
				txtDescription.sendKeys("Book your seats now and meet the co stars");
				
				Thread.sleep(2000);
				
				WebElement txtPrice = driver.findElement(By.xpath("//input[@placeholder='Enter price']"));
				txtPrice.sendKeys("2000");
				
				Thread.sleep(4000);
				
				WebElement addLink = driver.findElement(
					    By.xpath("//button[text()='Add New Link' and contains(@class, 'bg-[#0368FF]')]")
					);

				addLink.click();
				
				Thread.sleep(4000);
				
				WebElement txtLink = driver.findElement(
					    By.xpath("//div[@class='mt-4']//button[@type='button'][normalize-space()='Add New Link']")
						);
				txtLink.sendKeys("https://www.youtube.com/watch?v=x1EPtz1Uk4s&list=RDQMN6TeOcl0L-w&start_radio=1");
				
				Thread.sleep(4000);
				
				WebElement txtKeyword = driver.findElement(By.xpath("//input[@placeholder='Type a keyword and press Enter (e.g. travel, cooking, vlogs)']"));
				txtKeyword.sendKeys("Event" + Keys.ENTER);
				
				
				
				Thread.sleep(4000);
			
				WebElement btnSave = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
				btnSave.click();
				
				
				
				
			}
			
			// Test Case : 25 -> Terms and Condition Navigation
			
			
			@Test(priority=25,groups= {"Functional"})
			void termsConditionNavigation() throws InterruptedException {
				
				logger.info("Tc-24 -> Terms and Condition Navigation");
				Thread.sleep(3000);
				
				WebElement profileIcon = driver.findElement(By.xpath("//img[@src='/assets/header/User.svg']"));
				profileIcon.click();
				
				Thread.sleep(2000);
				
				WebElement termsCondition = driver.findElement(By.xpath("//a[@href='/terms-and-conditions' and text()='Terms and Conditions']"));
				termsCondition.click();
				
				Thread.sleep(2000);
				
			}
			
			// Test Case : 26 -> Privacy policy Navigation
			
			@Test(priority=26,groups= {"Functional"})
			void privacyPolicyNavigation() throws InterruptedException {
				
				logger.info("Tc-25 -> Privacy policy Navigation");
				Thread.sleep(3000);
				
				WebElement profileIcon = driver.findElement(By.xpath("//img[@src='/assets/header/User.svg']"));
				profileIcon.click();
				
				Thread.sleep(2000);
				
				WebElement privacyPolcy = driver.findElement(By.xpath("//a[@href='/privacy-policy' and text()='Privacy policy']"));
				privacyPolcy.click();
				
				Thread.sleep(2000);
				
			}
			
			// Test Case : 27 -> Contact Us Navigation
			
	@Test(priority=27,groups= {"Functional"})
			void contactUsNavigation() throws InterruptedException {
				
			     logger.info("Tc-26 -> Contact Us Navigation");
		         Thread.sleep(3000);
				
				
				WebElement profileIcon = driver.findElement(By.xpath("//img[@src='/assets/header/User.svg']"));
				profileIcon.click();
				
				Thread.sleep(3000);
				WebElement btnContactUs = driver.findElement(By.xpath("//a[@href='/contact-us' and text()='Contact Us']"));
				btnContactUs.click();
				
				Thread.sleep(2000);
				
			}
		
			
		   // Test Case : 28 -> Send the Queries to the Admin 
		
		
		//	@Test(priority=28,groups= {"Functional"})
			void contactUsDetails() throws InterruptedException {
				
				
				logger.info("Tc-27 -> Send the Queries to the Admin ");
				WebElement txtName =  driver.findElement(By.xpath(" //input[@placeholder='Your first name']"));
				txtName.sendKeys("Jolemon");
				
				Thread.sleep(1000);
				
				WebElement txtLname = driver.findElement(By.xpath("//input[@placeholder='Your last name']"));
				txtLname.sendKeys("Tom");
				
				Thread.sleep(1000);
				
				WebElement txtEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
				txtEmail.sendKeys("user11@yopmail.com");
				
				Thread.sleep(1000);
				
				WebElement txtQuery =  driver.findElement(By.xpath("//textarea[@placeholder='How can we help you?']"));
				txtQuery.sendKeys("I have blocked the entertainer still i am getting messages from entertainer ");
				
				WebElement btnSave = driver.findElement(By.xpath("//button[normalize-space()='Send message']"));
				btnSave.click();
				
				
			}
		       // Test Case : 28 -> Send Message to the User
			
		 			@Test(priority=28,groups= {"Smoke","Functional"})
		 			void sendMesage() throws InterruptedException {
		 				
		 				Thread.sleep(5000);
		 				
		 				WebElement profileIcon = driver.findElement(By.xpath("//img[@src='/assets/header/User.svg']"));
		 				profileIcon.click();
		 				
		 				Thread.sleep(4000);
		 				
		 				WebElement message = driver.findElement(By.xpath("//a[@href='/user/message' and text()='Messages']"));
		 				message.click();
		 				
		 				Thread.sleep(2000);
		 				WebElement searchIcon =	driver.findElement(By.xpath("(//*[name()='svg'][@class='select-none cursor-pointer'])[1]"));
		 				//WebElement searchIcon = driver.findElement(By.xpath("//svg[@class='select-none cursor-pointer']"));
		 				searchIcon.click();
		 				
		 				WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search Messenger']"));
		 				searchBox.sendKeys("Heet");
		 				
		 				Thread.sleep(3000);
		 				
		 				WebElement name = driver.findElement(By.xpath("//div[normalize-space()='Heet Nanda']"));
		 				name.click();
		 				
		 				Thread.sleep(2000);
		 				
		 				WebElement sendBox =driver.findElement(By.xpath("//input[contains(@placeholder,'What would you like to say?')]"));
		 				sendBox.sendKeys("Hello , How are you ?");
		 				sendBox.sendKeys(Keys.ENTER);
		 				
		 			}
	
    // Test Case : 29 -> Log Out
	
    @Test(priority=29,groups={"Smoke"},dependsOnMethods= {"contactUsNavigation"})
	
	void Logout() throws InterruptedException {
		
		Thread.sleep(3000);
		
		logger.info("Tc-28 -> Log Out");
		WebElement profileIcon = driver.findElement(By.xpath("//img[@src='/assets/header/User.svg']"));
		profileIcon.click();
		
		Thread.sleep(3000);
		
		WebElement logOut =driver.findElement(By.xpath("//a[@href='/auth/signout' and text()='Logout']"));
		logOut.click();
	
	}
    
 
	
    // Test Case : 30 -> Forgot Password
    
    @Test(priority=30,groups= {"Smoke"},dependsOnMethods= {"Logout"})
    void forgotPassword() throws InterruptedException {
 	   
    	logger.info("Tc-29 -> Forgot Password");
 	   Thread.sleep(3000);
 	   
 		driver.get("https://airbnb-user.inheritxdev.in/auth/login/email");
 		
 		Thread.sleep(2000);
 		
 		WebElement forgotPassword = driver.findElement(By.xpath(" //a[normalize-space()='Forgot Password?']"));
 		forgotPassword.click();
 		
 		Thread.sleep(2000);
 		WebElement txtEmail = driver.findElement(By.xpath(" //input[@placeholder='Email']"));
 		txtEmail.sendKeys("user23@yopmail.com");
 		
 		Thread.sleep(2000);
 		WebElement btnSend = driver.findElement(By.xpath(" //button[normalize-space()='Send Email']"));
 		btnSend.click();
 			
 	   
    }
    
    // Test Case : 31 Open in Incognito mode .
	
	@Test(priority=31,groups= {"Functional"})
	void incognitoMode() {
		
		        logger.info("Tc-30 Open in Incognito mode ");
		        ChromeOptions co = new ChromeOptions();
				co.addArguments("--incognito");
				
				driver=new ChromeDriver(co);
				
				driver.get("https://airbnb-user.inheritxdev.in/");
		        driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));

	}
   
  
}
