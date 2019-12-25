package com.newproject.selenium.first;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ManageExtent extends JustRepeat{
	public static ExtentReports extent;

	public static ExtentReports getinstance() {
		if(extent==null) {
			Date dt=new Date();
			String fileName=dt.toString().replace(':', '_').replace(' ', '_')+".html";
			extent=new ExtentReports(projectPath+"\\HTMLReports\\"+fileName);
			extent.loadConfig(new File(projectPath+"\\extentreportconfig.xml"));
		}
		return extent;
	}

}
