package testingNG;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.annotations.Test;

public class Testdriver {

	@Test
	public void doLogin() throws IOException, InterruptedException
	{
		/*BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the driver name:");
		String driver1 = bf.readLine();*/
		String driver1="WebDriver";

		if (driver1.equals("AndroidDriver")) {
			AndroidTest object = new AndroidTest();
			object.TestMobile();
		}

		else {
			WebDriverTest object2 = new WebDriverTest();
			object2.TestWeb();
		}
		
	}
}
