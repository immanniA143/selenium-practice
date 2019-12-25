package com.newproject.selenium.first;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class repeat {
	
	public static WebDriver driver;
	public static Properties p,or;
	public static String projectPath = System.getProperty("user.dir");
	public static ExtentReports report=ExtentMana.getInstance();
	public static ExtentTest test;
	
	public static void init() throws Exception {
		
		p=new Properties();
		FileInputStream fis1=new FileInputStream(projectPath+"\\data.properties");
		p.load(fis1);
		FileInputStream fis2=new FileInputStream(projectPath+"\\Or.properties");
		or=new Properties();
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
				FirefoxProfile profile=p.getProfile("aravind");
				profile.setPreference("dom.webnotifications.enabled", false);
				option.setProfile(profile);
				driver=new FirefoxDriver(option);
				
			}
		}
	public static void navigateToUrl(String url) {
		
		driver.get(p.getProperty(url));
	}
	private static WebElement getElement(String locatorKey) {
		WebElement element=null;
		if(locatorKey.endsWith("_id")) {
			element=driver.findElement(By.id(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_name")) {
			element=driver.findElement(By.name(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_class")) {
			element=driver.findElement(By.className(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_xpath")) {
			element=driver.findElement(By.xpath(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_css")) {
			element=driver.findElement(By.cssSelector(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_linktext")) {
			element=driver.findElement(By.linkText(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_plinktext")) {
			element=driver.findElement(By.partialLinkText(or.getProperty(locatorKey)));
		}
		
		return element;
		
	}
	
	
	public static void selectItem(String locatorKey, String itemtoSelect) {
		
		getElement(locatorKey).sendKeys(or.getProperty(itemtoSelect));
	}
	public static void type(String locatorKey,String value) {
		
		getElement(locatorKey).sendKeys(or.getProperty(value));
	}
	public static void clicks(String locatorKey) {
		
		getElement(locatorKey).click();
	}
	
}
