package com.newproject.selenium.first;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		test=report.startTest("TC_002"); 
		
		init();
		test.log(LogStatus.INFO, "initializing the properties files.....");
		launch("chromebrowser");
		test.log(LogStatus.PASS, "launched the browser :- "+p.getProperty("chromebrowser"));
		navigateToUrl("amazonurl");
		test.log(LogStatus.PASS, "navigating to the URL :-"+p.getProperty("amazonurl"));
		String expectedLink="amazonBasics";
		if(!verifyElement(expectedLink)) {
			reportFailure("Both Links Are Not Equal...");
		}else {
			reportSuccess("Both Links Are Equal...");
		}
		
		driver.close();
		report.endTest(test);
		report.flush();
  }

	
	
}
