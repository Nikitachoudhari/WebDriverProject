//write a script to scroll particular element in webpage.
package March22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript3 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location = 'https://www.myntra.com/'");
		Thread.sleep(3000);
		
		String title1 = js.executeScript("return document.title").toString();
		System.out.println(title1);
		
		WebElement element = driver.findElement(By.linkText("Men"));
		js.executeScript("document.scrollInToView", element);
		element.click();
		Thread.sleep(3000);
		String title2 = js.executeScript("return document.title").toString();
		System.out.println(title2);
		
		
		driver.quit();
	}
}
