import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {

	public WebDriver driver;

	public BaseClass(WebDriver driver) {
		this.driver = driver;
	}

	public void BaseCode() {
		// WebDriver driver = null;
		driver.get("https://stage-ft3.snaponepc.com/epc/#/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("AshishSati1");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("AshishSati1");
	}

}
