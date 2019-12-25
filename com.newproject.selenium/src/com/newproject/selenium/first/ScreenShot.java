package com.newproject.selenium.first;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravi\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		//File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(srcFile, new File("C:\\Users\\aravi\\OneDrive\\Desktop\\ScreenShots\\img1.jpg"));
		List<WebElement> links=driver.findElements(By.linkText("aravind"));
		System.out.println(links.size());
		if(links.size()==0) {
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(srcFile, new File("C:\\Users\\aravi\\OneDrive\\Desktop\\ScreenShots\\img.jpg"));
			
		}
		driver.close();
	}

	
	
}
