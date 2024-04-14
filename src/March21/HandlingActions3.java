//Write a script to perform keyboard and move to element mouse action in google page.  

package March21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingActions3 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);

		Actions ac = new Actions(driver);
		//click on settings option
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
		
		//Go to back for 2 times
		driver.navigate().back();
		Thread.sleep(3000);
				
		//click on Privacy option
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Privacy']"))) ;
		ac.click().build().perform();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Overview")).click();
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		
		Select element = new Select(driver.findElement(By.xpath("//select[@class='iCthae']")));
		List<WebElement> items = element.getOptions();
		
		System.out.println(items.size());
		for (WebElement each : items) {
			System.out.println(each.getText());
		}
		Thread.sleep(3000);
		
		driver.quit();

	}
}
