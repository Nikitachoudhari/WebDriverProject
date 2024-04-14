//Write a script to perform keyboard action in google page. 

package March21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		Actions ac = new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("Selenium openings in ");
		Thread.sleep(3000);
		
		//click down arrow for 3 times
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
