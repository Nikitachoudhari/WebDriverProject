//Write a script to print no. of links in a webpage and print each link name.

package March14;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {
	public static void main(String[] args) throws Throwable {
		// Create Instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// launch the url
		driver.navigate().to("http://www.google.com/");
		// Suspend tool for 5 sec to load the webelements.
		Thread.sleep(5000);
		
		List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of hyperlinks in a wabpage - "+hyperlinks.size());
		
		for (WebElement link : hyperlinks) {
			Thread.sleep(100);
			System.out.println(link.getText());
		}
		
		driver.quit();
		
		
		
	}
}
