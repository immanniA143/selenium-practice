package com.newproject.selenium.first;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravi\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		Iterator<WebElement> list = links.iterator();
		while(list.hasNext()) {
			
			if(!list.next().getText().isEmpty()) {
				String linktext=list.next().getText();
				list.next().click();
			File srcFle=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(srcFle, new File("C:\\Users\\aravi\\OneDrive\\Desktop\\ScreenShots\\"+linktext+".jpeg"));
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
			}
		}
		driver.close();
	}
	
}
