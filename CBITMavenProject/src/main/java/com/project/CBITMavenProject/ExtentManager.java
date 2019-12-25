package com.project.CBITMavenProject;

import java.io.File;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends BaseTest{
	public static ExtentReports extents;
	public static ExtentReports getInstance() {
		if(extents==null) {
			
			String filePath=dt.toString().replace(':', '_').replace(' ', '_')+".html";
			extents=new ExtentReports(projectPath+"\\HTMLReports\\"+filePath);
			extents.loadConfig(new File(projectPath+"\\extentreportconfig.xml"));
		}
				
		return extents;
		
	}

}
