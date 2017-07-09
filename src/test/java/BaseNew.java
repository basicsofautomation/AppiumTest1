import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaseNew {

	public static void main(String[] args) throws Exception {

		// Take input from user which Device he/she wants the script to run on

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the driver name:");
		String driver1 = bf.readLine();

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
