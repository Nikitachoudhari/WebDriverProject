//Write a script to perform navigation methods on Google page.

package March14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws Throwable {
		// Create Instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// launch the url
		driver.navigate().to("http://google.com/");
		// Suspend tool for 5 sec to load the webelements.
		Thread.sleep(5000);
		
		String title1 = driver.getTitle();
		System.out.println("Page title 1 - "+title1);
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Gmail")).click();
		String title2 = driver.getTitle();   //gmail
		System.out.println("Page title 2 - "+title2);
		Thread.sleep(5000);
		
		driver.navigate().back();
		String title3 = driver.getTitle(); //google 
		System.out.println("Page title 3 - "+title3);
		Thread.sleep(5000);
		
		driver.navigate().forward();
		String title4 = driver.getTitle();     //gmail
		System.out.println("Page title 4 - "+title4);
		Thread.sleep(5000);
			
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.quit();
		
	}
}
