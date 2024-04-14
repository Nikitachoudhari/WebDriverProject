//write a script to print title and url along with length

package March13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethods {

	public static void main(String[] args) throws Throwable {
		// Create Instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// launch the url
		driver.get("http://www.amazon.com/");
		// Suspend tool for 5 sec to load the webelements.
		Thread.sleep(5000);
		
		System.out.println("Title of the Page - ");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(title.length());
		
		System.out.println("Current Url - ");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(url.length());
		
		driver.quit();

	}

}
