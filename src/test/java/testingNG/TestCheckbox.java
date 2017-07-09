package testingNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\zt4226\\EclipseWork\\AppiumTesting\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stage-ft3.snaponepc.com/epc/#/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("AshishSati1");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("AshishSati1");
		driver.findElement(By.xpath("html/body/snapon-app/snapon-base/snapon-login/div/div[2]/p-panel/div/div[2]/div/div/form/div[3]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id='navGrid']/div/div/div/a[2]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='navGrid']/div/div/div/a[3]")).click();
		driver.findElement(By.xpath(".//*[@id='navGrid']/div/div/div/div[1]/a/div")).click();
		driver.findElement(By.xpath("//*[@id='navGrid']/div/div/div/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='navGrid']/div/div/div/a[7]/div[1]")).click();
		
		WebDriverWait wait  = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='image-toolbar']/p-toolbar/div/div/div/div/img[2]")));
		driver.findElement(By.xpath("//*[@id='image-toolbar']/p-toolbar/div/div/div/div/img[2]")).click();
		/*WebDriverWait wait  = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='epcToolBar']/epc-toolbar/p-toolbar/div/div[2]/div/p-dropdown/div/input")));*/
		
		driver.findElement(By.xpath("//*[@id='epcToolBar']/epc-toolbar/p-toolbar/div/div[2]/div/p-dropdown/div/input")).sendKeys("ABC");

	}

}
