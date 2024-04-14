//write a script to validate login module.

package March13;                                     

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethods4 {

	public static void main(String[] args) throws Throwable {
		// Create Instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// launch the url
		driver.get("http://orangehrm.qedgetech.com/");
		// Suspend tool for 5 sec to load the webelements.
		Thread.sleep(5000);

		WebElement element = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		element.clear();
		element.sendKeys("Admin");
		String username = element.getAttribute("value");
		System.out.println("Username Text -"+username); 

		WebElement element1 = driver.findElement(By.xpath("//input[@id='txtPassword']")); 
		element1.clear();
		element1.sendKeys("Qedge123!@#");
		String password = element1.getAttribute("value");
		System.out.println("Password Text -"+password); 

		driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
		Thread.sleep(5000);

		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();			
		if(Actual.contains(Expected)) {
			System.out.println("Login is successful"+Expected+"    "+Actual);
		}
		else {
			String error = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println("Error message - "+error);
		}

		Thread.sleep(5000);
		driver.quit();

	}
}

