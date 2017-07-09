package testingNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

	public void TestWeb() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\zt4226\\EclipseWork\\AppiumTesting\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		BaseClass object1 = new BaseClass(driver);
		object1.BaseCode();

	}

}
