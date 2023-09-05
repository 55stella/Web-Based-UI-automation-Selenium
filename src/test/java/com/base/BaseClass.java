package com.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

//import com.pageObjects.LoginPage;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import com.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	static ReadConfig  readconfig = new ReadConfig(); // Creating object of class ReadConfig
			//classname  variablename= new classname();
	// Integrating data from ReadConfig
	public static String baseURL=readconfig.getApplicationURL();
	public static String passwordCorp= readconfig.getPasswordCorp();
	public static String usernameCorp = readconfig.getUserNameCorp();
	public static String entityCodeCorp = readconfig.getEntityCodeCorp();

	public static String userNameCorpManager = readconfig.userNameCorpManager();

	public static String userNameCorpTestLead= readconfig.userNameCorpTestLead();

	public static String passwordCorpPjp= readconfig.getPasswordCorpPjp();
	public static String usernameCorpPjp = readconfig.getUserNameCorpPjp();
	public static String entityCodeCorpPjp = readconfig.getEntityCodeCorpPjp();

	public static String passwordPartner = readconfig.getPasswordPartner();
	public static String usernamePartner = readconfig.getUsernamePartner();



	public static String entityCodePartner = readconfig.getEntityCodePartner();

	public static String newUsernamePartner= readconfig.getNewUsernamePartner();

	public static String newPasswordPartner= readconfig.getNewPasswordPartner();

	public static String newEntityCodePartner = readconfig.getNewEntityCodePartner();

	public static String approveUsernamePartner= readconfig.getApproveUsernamePartner();

	public static String approvePasswordPartner= readconfig.getApprovePasswordPartner();

	public static String approveEntityCodePartner = readconfig.getApproveEntityCodePartner();

	public static String rejectUsernamePartner= readconfig.getRejectUsernamePartner();

	public static String rejectPasswordPartner= readconfig.getRejectPasswordPartner();

	public static String rejectEntityCodePartner = readconfig.getRejectEntityCodePartner();

	public static String browser = readconfig.getBrowser();

	public static ChromeOptions handlingSSL = new ChromeOptions();
	public static EdgeOptions handlingSSL1 = new EdgeOptions();
	public static FirefoxOptions handlingSSL2=new FirefoxOptions();
	public static WebDriver driver;
	public static Logger logger;
	//public static final Duration WAIT = ofMillis(5000);



	@BeforeMethod
	public  void setup()
	{
		if(browser.equalsIgnoreCase("chrome")) {
			 //Create instance of ChromeOptions Class
			//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
			handlingSSL.setAcceptInsecureCerts(true);
			//Creating instance of Chrome driver by passing reference of ChromeOptions object
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			//WebDriverManager.chromedriver().browserVersion("111.0.5563").setup();
			WebDriverManager.chromedriver().setup();
			//ChromeOptions options=new ChromeOptions();
			driver = new ChromeDriver(handlingSSL);

		}

		else if(browser.equalsIgnoreCase("edge")) {
			 //Create instance of MSEdgeOptions Class

			//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
			handlingSSL1.setAcceptInsecureCerts(true);
			//Creating instance of Edge driver by passing reference of EdgeOptions object
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(handlingSSL1);
			}

		else if(browser.equalsIgnoreCase("firefox")) {
			 //Create instance of FirefoxOptions Class
			//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
			handlingSSL2.setAcceptInsecureCerts(true);
			//Creating instance of Firefox driver by passing reference of FirefoxOptions object
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver(handlingSSL2);}

		// Initialization // Logger initiated within the setup method
		logger=Logger.getLogger("Trade automation solution");// Project Name
		PropertyConfigurator.configure("log4j.properties"); // Added Logger
		logger.setLevel(Level.DEBUG); // to get the debug log
		logger.debug("Debug logging has started ");

		driver.get(baseURL);
        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));

	}
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	public void handleAlert(){
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
			wait.until(ExpectedConditions.alertIsPresent());

			// Handle the alert
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			// No alert found, continue with the next action
		}
	}

//	private static Duration ofMillis(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@AfterMethod
	public void tearDown()
	{
		if(driver != null)
			{driver.quit();
			}
	}





	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}

//	public void validLogin(){
//		LoginPage loginpg = new LoginPage(driver);
//		loginpg.enterUsername(username);		//Pass username1 declared in config file
//		loginpg.enterPassword(password);	//Pass password declared in config file
//		loginpg.clickLoginToSandboxButton();             //Click on submit button
//		sleep(10);
//	}


	//a javascript executor scroll that uses a webElement has an argument



}