package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesConcept {
		public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users//aravi//Downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://hugelearning.com/iframe-practice-page/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[@href='http://hugelearning.com/what-is-java/']")).click();
	}

}
