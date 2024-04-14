//Write a script to get the windows unique ids.
package March18;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
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
		driver.quit();
		
		
	}
}
