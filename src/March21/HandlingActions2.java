//Write a script to perform keyboard and move to element mouse action in google page.  

package March21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions2 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);

		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//div[@class='ayzqOc pHiOh']"))) ;
		ac.click().build().perform();
		Thread.sleep(3000);

		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);

		driver.quit();

	}
}
