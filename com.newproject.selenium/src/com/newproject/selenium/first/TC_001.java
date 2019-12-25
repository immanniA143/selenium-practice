package com.newproject.selenium.first;

import com.relevantcodes.extentreports.LogStatus;

public class TC_001 extends BaseTest{

	public static void main(String[] args) throws Exception {
		test=report.startTest("TC_001"); 
		
		init();
		test.log(LogStatus.INFO, "initializing the properties files.....");
		launch("chromebrowser");
		test.log(LogStatus.PASS, "launched the browser :- "+p.getProperty("chromebrowser"));
		navigateToUrl("amazonurl");
		test.log(LogStatus.PASS, "navigating to the URL :-"+p.getProperty("amazonurl"));
		selectItem("amazondropbox_id","amazondropbox_item");
		test.log(LogStatus.PASS, "seleted the item :- "+or.getProperty("amazondropbox_item")+" By using the locator :- "+or.getProperty("amazondropbox_id"));
		type("amazonsearchbox_css", "amazonsearchbox_value");
		test.log(LogStatus.PASS, "entered the text into the textbox :- "+or.getProperty("amazonsearchbox_value")+" By using the locator :- "+or.getProperty("amazonsearchbox_css"));
		click("amazonsearchbutton_xpath");
		test.log(LogStatus.FAIL, "clicked on the SearchButton using the locator :- "+or.getProperty("amazonsearchbutton_xpath"));
		driver.close();
		report.endTest(test);
		report.flush();
	}

}
