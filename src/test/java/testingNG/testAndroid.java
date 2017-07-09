package testingNG;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class testAndroid {

	public void Androidtest() throws MalformedURLException
	{

		DesiredCapabilities capability = new DesiredCapabilities();	
		capability.setCapability(CapabilityType.BROWSER_NAME,BrowserType.CHROME);
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		 URL url= new URL("http://127.0.0.1:4723/wd/hub");
		 
		 WebDriver driver = new AndroidDriver(url,capability);
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);

	}

}
