package com.newproject.selenium.first;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends BaseTest{
	public static ExtentReports extents;
	public static ExtentReports getInstance() {
		if(extents==null) {
			Date dt =new Date();
			String filePath=dt.toString().replace(':', '_').replace(' ', '_')+".html";
			extents=new ExtentReports(projectPath+"\\HTMLReports\\"+filePath);
			extents.loadConfig(new File(projectPath+"\\extentreportconfig.xml"));
		}
				
		return extents;
		
	}

}
