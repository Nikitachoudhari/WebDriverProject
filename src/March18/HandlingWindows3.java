//Write a script to switch to specific window when multiple windows are opened.

package March18;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWindows3 {
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
	 	
		//click three links
		driver.findElement(By.xpath("(//a[contains(text(),'Terms')])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Privacy Policy')])[2]")).click(); 
		driver.findElement(By.xpath("(//a[contains(@href,'/policies/cookies/')])[2]")).click();
		Thread.sleep(3000);
		
		//store all windows into ArrayList.
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		//switch to child window
		driver.switchTo().window(windows.get(3));
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("email")).sendKeys("Abc");
		driver.findElement(By.id("pass")).sendKeys("$%^56sfs");
		driver.findElement(By.xpath("//input[@value='Log in']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.close();
		
		
	}
}
