//Write a script to perform right click mouse action 
package March21;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions5 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);

		Actions ac = new Actions(driver);
		//move mouse to About and right click
		ac.moveToElement(driver.findElement(By.linkText("About")));
		ac.contextClick().perform();
		Thread.sleep(3000);
		//create object for robot class as *Right click on webpage is window related*
		Robot r = new Robot();
		//press down arrow for 2 times
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		//collection of all windows
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
	
		//switch to new child window
		driver.switchTo().window(windows.get(1));
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[3]/div/div[2]/div/div/a[1]"))).click().perform();
		Thread.sleep(3000);
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.close();
		
		//switch back to parent window
		driver.switchTo().window(windows.get(0));
		ac.moveToElement(driver.findElement(By.linkText("Images"))).click().perform();
		Thread.sleep(3000);
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.close();

	}
}
