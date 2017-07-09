import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidTest {

	public void TestMobile() throws MalformedURLException, InterruptedException {
		// File appDir = new
		// File("D:/APK/bigbasket_com.bigbasket.mobileapp.apk");

		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		capability.setCapability("newCommandTimeout", 10000);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		WebDriver driver = new AndroidDriver(url, capability);
		BaseClass object1 = new BaseClass(driver);
		object1.BaseCode();

	}

}
