package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users//aravi//Downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https:\\www.facebook.com/");
		System.out.println(driver.getTitle());
		//driver.findElement(By.className("_8esh")).click();
		driver.findElement(By.id("u_0_o")).sendKeys("immanni");
		driver.findElement(By.name("reg_email__")).sendKeys("9436558741");
		driver.findElement(By.name("sex")).click();
	//	System.out.println(driver.getCurrentUrl());
		//String title=driver.getTitle();
		//System.out.println(title);
	//	if(title.equals("Google"))
	//		System.out.println("correct title");
	//	else
	//		System.out.println("in-correct title");
	//driver.quit();
	}

}
