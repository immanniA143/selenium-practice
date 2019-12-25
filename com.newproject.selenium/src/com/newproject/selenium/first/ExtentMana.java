package com.newproject.selenium.first;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentMana extends repeat{
	private static ExtentReports extent;
	public static ExtentReports getInstance()
	{
		if(extent==null) {
			Date dt=new Date();
			String path=dt.toString().replace(':', '_').replace(' ', '_')+".html";
			extent=new ExtentReports(projectPath+"\\HTMLReports\\"+path);
			extent.loadConfig(new File(projectPath+"\\extentreportconfig.xml"));
		}
		return extent;
		
	}

}
