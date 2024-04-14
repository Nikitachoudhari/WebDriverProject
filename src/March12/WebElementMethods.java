package March12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {
		// Create Instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// launch the url
		driver.get("http://www.primusbank.qedgetech.com/");
		// Suspend tool for 5 sec to load the webelements.
		Thread.sleep(5000);

		driver.findElement(By.id("txtuId")).sendKeys("admin");
		driver.findElement(By.name("txtPword")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(5000);
		
		//close the Browser.
		driver.quit();
	}

}
