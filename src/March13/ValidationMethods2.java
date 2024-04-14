//Write a script to capture gmail text in google page with the help of getText method and 
//url of that link with the help of getAttribute

package March13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethods2 {
	
	public static void main(String[] args) throws Throwable {
	// Create Instance object
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	// launch the url
	driver.get("http://www.google.com/");
	// Suspend tool for 5 sec to load the webelements.
	Thread.sleep(5000);
	
	String gmailtext = driver.findElement(By.linkText("Gmail")).getText();
	String gmailUrl = driver.findElement(By.linkText("Gmail")).getAttribute("href");

	System.out.println(gmailtext);
	System.out.println(gmailUrl);
	
	driver.quit();
	
 }
}
