package com.newproject.selenium.first;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravi\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.newtours.demoaut.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-YYYY  HH-mm-ss");
		for(int i=0;i<links.size();i++) {
			Date dt=new Date();
			
			if(!links.get(i).getText().isEmpty()) {
				String linktext = links.get(i).getText();
				links.get(i).click();
				File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(srcFile, new File("C:\\Users\\aravi\\OneDrive\\Desktop\\ScreenShots\\"+dateformat.format(dt)+linktext+".jpeg"));
				links=driver.findElements(By.tagName("a"));
			}
		}
		driver.close();		
		
	}
	
}
