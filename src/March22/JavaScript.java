//write a script to get title , url and domain using Javascript.
package March22;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//launch the url.
		js.executeScript("window.location='https://www.myntra.com/'");
		Thread.sleep(5000);
		
		//print title and length of title.
		String title1 = js.executeScript("return document.title").toString();
		System.out.println(title1+"    "+title1.length());
		
		//print url and length of url.
		String url = js.executeScript("return document.URL").toString();
		System.out.println(url+"    "+url.length());
		
		//print domain and length of domain.
		String domain = js.executeScript("return document.domain").toString();
		System.out.println(domain+"   "+domain.length());
		
		driver.quit();
	}
}
