import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


	

public class TestAppium {

	public static void main(String[] args) throws MalformedURLException {
		
	AndroidDriver driver;
	DesiredCapabilities capability = new DesiredCapabilities();	
	capability.setCapability(CapabilityType.BROWSER_NAME, "chrome");
	capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
	driver.get("https://stage-ft3.snaponepc.com/epc/#/");
}
}