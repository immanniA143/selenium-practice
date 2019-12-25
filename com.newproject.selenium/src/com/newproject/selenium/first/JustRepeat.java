package com.newproject.selenium.first;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class JustRepeat {

	public static WebDriver driver;
	public static Properties p,or;
	public static Date dt=new Date();
	public static String projectPath=System.getProperty("user.dir");
	public static ExtentReports report=ManageExtent.getinstance();
	public static ExtentTest test;
	
	public static void init() throws Exception {
		p=new Properties();
		FileInputStream fis1=new FileInputStream(projectPath+"\\data.properties");
		p.load(fis1);
		or=new Properties();
		FileInputStream fis2=new FileInputStream(projectPath+"\\Or.properties");
		or.load(fis2);
		PropertyConfigurator.configure(projectPath+"\\log4j.properties");
	}
	public static void launch(String browser) {
		if(p.getProperty(browser).equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver.exe");
			ChromeOptions option=new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\aravi\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 2");
			option.addArguments("--disable-notifications");
			driver=new ChromeDriver(option);
		}else if(p.getProperty(browser).equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver.exe");
			FirefoxOptions option=new FirefoxOptions();
			ProfilesIni p=new ProfilesIni();
			FirefoxProfile profile = p.getProfile("aravind");
			profile.setPreference("dom.webnotifications.enabled", false);
			option.setProfile(profile);
			driver=new FirefoxDriver(option);
		}
		driver.manage().window().maximize();
	}
	public static void navigateUrl(String url) {
		driver.get(p.getProperty(url));
	}
	
	private static WebElement getElement(String locator) {
		WebElement element=null;
		if(locator.endsWith("_id")) {
			element=driver.findElement(By.id(or.getProperty(locator)));
		}else if(locator.endsWith("_xpath")) {
			element=driver.findElement(By.xpath(or.getProperty(locator)));
		}else if(locator.endsWith("_css")) {
			element=driver.findElement(By.cssSelector(or.getProperty(locator)));
		}else if(locator.endsWith("_name")) {
			element=driver.findElement(By.name(or.getProperty(locator)));
		}else if(locator.endsWith("_linktext")) {
			element=driver.findElement(By.linkText(or.getProperty(locator)));
		}else if(locator.endsWith("_plinktext")) {
			element=driver.findElement(By.partialLinkText(or.getProperty(locator)));
		}else if(locator.endsWith("_classname")) {
			element=driver.findElement(By.className(or.getProperty(locator)));
		}
		return element;
			
	}
	public static void selectItem(String locator, String item) {
		getElement(locator).sendKeys(or.getProperty(item));
	}
	public static void typeText(String locator,String text) {
		getElement(locator).sendKeys(or.getProperty(text));
	}
	public static void clicks(String locator) {
		getElement(locator).click();
	}
	public static void reportSuccess(String successMessage) {
		test.log(LogStatus.PASS, successMessage);
		
	}
	public static void reportFailure(String failureMessage) {
		test.log(LogStatus.FAIL, failureMessage);
		takesScreenShot();
		
	}
	public static String screenshotFileName=projectPath+"\\ScreenShots\\"+dt.toString().replace(':', '_').replace(' ', '_')+".png";
	public static void takesScreenShot() {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)	;
		try {
			FileHandler.copy(srcFile, new File(screenshotFileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(LogStatus.INFO, "Screenshot............>"+test.addScreenCapture(screenshotFileName));
	}
	public static boolean verifyElement(String expectedLink,String locator) {
		String actualLink = getElement(locator).getText();
		if(actualLink.equals(expectedLink))
			return true;
		else
			return false;
	}

	
}
