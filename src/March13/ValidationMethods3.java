package March13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethods3 {
	
	public static void main(String[] args) throws Throwable {
		// Create Instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// launch the url
		driver.get("http://www.google.com/");
		// Suspend tool for 5 sec to load the webelements.
		Thread.sleep(5000);
		
		String Expected = "https";
		String Actual = driver.getCurrentUrl();
		
		if(Actual.startsWith(Expected))
			System.out.println("URL is Secured "+Expected+"   "+Actual);
		else
			System.out.println("URL is Local "+Expected+"   "+Actual);
		
		driver.quit();
		
	}
}
