//write a script to scroll top to bottom and bottom to top using Javascript.
package March22;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript2 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//launch the url.
		js.executeScript("window.location='https://www.myntra.com/'");
		Thread.sleep(5000);
		
		//print top to bottom vertically.
		js.executeScript("window.scrollTo(0 , document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//scroll bottom to top vertically.
		js.executeScript("window.scrollTo(document.body.scrollHeight , 0)");
		Thread.sleep(3000);
		
		//scroll to 1000 px. vertically
		js.executeScript("window.scrollBy(0 , 1000)");
		Thread.sleep(3000);
		
		driver.quit();
	}
}
