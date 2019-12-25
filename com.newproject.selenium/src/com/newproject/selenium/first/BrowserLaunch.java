package com.newproject.selenium.first;

import org.apache.log4j.Logger;

public class BrowserLaunch extends BaseTest {
	private static final Logger log=Logger.getLogger(BrowserLaunch.class.getName());
	public static void main(String[] args) throws Exception {
		init();
		log.info("initializing the properties files.....");
		launch("chromebrowser");
		log.info("launched the browser :- "+p.getProperty("firefoxbrowser"));
		navigateToUrl("amazonurl");
		log.info("navigating to the URL :-"+p.getProperty("amazonurl"));
		selectItem("amazondropbox_id","amazondropbox_item");
		log.info("seleted the item :- "+or.getProperty("amazondropbox_item")+" By using the locator :- "+or.getProperty("amazondropbox_id"));
		type("amazonsearchbox_css", "amazonsearchbox_value");
		log.info("entered the text into the textbox :- "+or.getProperty("amazonsearchbox_value")+" By using the locator :- "+or.getProperty("amazonsearchbox_css"));
		click("amazonsearchbutton_xpath");
		log.info("clicked on the SearchButton using the locator :- "+or.getProperty("amazonsearchbutton_xpath"));
		driver.close();
	}

}
	
