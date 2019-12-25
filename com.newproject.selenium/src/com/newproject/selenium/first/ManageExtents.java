package com.newproject.selenium.first;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ManageExtents extends NewPractice{
	public static ExtentReports extents;
	public static ExtentReports manageExtent() {
		if(extents==null) {
			Date dt=new Date();
			String filename=dt.toString().replace(':', '_').replace(' ', '_');
			extents=new ExtentReports(projectPath+"\\HTMLReports"+filename);
			extents.loadConfig(new File(projectPath+"\\extentreportconfig.xml"));
		}
		
		return extents;
		
	}

}
