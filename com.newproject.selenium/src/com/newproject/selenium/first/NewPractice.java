package com.newproject.selenium.first;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class NewPractice {
	public static WebDriver driver;
	public static Properties p,or;
	public static Date dt=new Date();
	public static ExtentReports report;
	public static ExtentTest test;
	public static String projectPath=System.getProperty("user.dir");
	public static void init() throws Exception {
		p=new Properties();
		FileInputStream fis1=new FileInputStream(projectPath+"data.properties");
		p.load(fis1);
		FileInputStream fis2=new FileInputStream(projectPath+"Or.properties");
		or.load(fis2);
		PropertyConfigurator.configure(projectPath+"log4j.properties");
	}
	public static void launch(String browser) {
		if(p.getProperty(browser).equals("chrome")) {
			
		}
		
	}

}
