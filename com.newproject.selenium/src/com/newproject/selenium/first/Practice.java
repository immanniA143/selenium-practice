package com.newproject.selenium.first;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;
public class Practice extends JustRepeat {
	public static final Logger log=Logger.getLogger(Practice.class.getName());
	public static void main(String[] args) throws Exception {
		test=report.startTest("Practice");
		init();
		test.log(LogStatus.INFO, "initializing the properties files...........");
		launch("chromebrowser");
		test.log(LogStatus.PASS, "launching the browser  "+p.getProperty("chromebrowser"));
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "navigating to the url "+p.getProperty("amazonurl"));
		selectItem("amazondropbox_id","amazondropbox_item");
		log.info("selecting the required field in the search box");
		typeText("amazonsearchbox_name","amazonsearchbox_value");
		log.info("typeing the required on the search box");
		clicks("amazonsearchbutton_xpath");
		log.info("clicks on the search button");
		String expectedLink = "Amazonbasics" ;
		if(!verifyElement(expectedLink,"amazonbasics_linktext")) {
			reportFailure("Both Links Are Not Equal");
		}else {
			reportSuccess("Both Links Are Equal");
		}
				
		report.endTest(test);
		report.flush();
		driver.close();
	}
		
	
}
