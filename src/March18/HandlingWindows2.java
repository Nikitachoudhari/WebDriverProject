//Write a script to handle child and parent windows.

package March18;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWindows2 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		//get parent id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
	 	
		driver.findElement(By.xpath("(//a[contains(text(),'Terms')])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Privacy Policy')])[2]")).click(); 
		driver.findElement(By.xpath("(//a[contains(@href,'/policies/cookies/')])[2]")).click();
		Thread.sleep(3000);
		
		//get collection of all window ids.
		Set<String> all_windows = driver.getWindowHandles();
		System.out.println(all_windows);
		
		for (String each : all_windows) {
			//switch to all child windows
			if(!parent.equals(each)) {
				driver.switchTo().window(each);
				String title = driver.getTitle();
				System.out.println(title);
				Thread.sleep(3000);
				driver.close();
			}
		}
		//switch to parent
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		Select element = new Select(driver.findElement(By.id("year")));
		List<WebElement> items = element.getOptions();
		
		for (WebElement each : items) {
			System.out.println(each.getText());
		}
		
		driver.quit();
		
	}
}
