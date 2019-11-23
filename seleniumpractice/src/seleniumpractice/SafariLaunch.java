package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariLaunch {

	public static void main(String[] args) {
		WebDriver driver=new SafariDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
