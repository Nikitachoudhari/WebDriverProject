//Write a script to perform multiple mouse actions.
package March21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingActions4 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);

		Actions ac = new Actions(driver);
		//move mouse to Kids
		ac.moveToElement(driver.findElement(By.xpath("//a[@data-group='kids']")));
		ac.perform();
		Thread.sleep(3000);
		//move mouse to soft toys and click it.
		ac.moveToElement(driver.findElement(By.linkText("Soft Toys")));
		ac.pause(3000);
		ac.click().perform();

		//move mouse to Beauty
		ac.moveToElement(driver.findElement(By.xpath("//a[@data-group='beauty']")));
		ac.perform();
		Thread.sleep(3000);
		//move mouse to Hair Oil and click it.
		ac.moveToElement(driver.findElement(By.linkText("Hair Oil")));
		ac.pause(3000);
		ac.click().perform();
		
		Thread.sleep(5000);
		List<WebElement> radios = driver.findElements(By.xpath("//label[contains(@class,'common-customRadio gender-label')]"));
		
		for (WebElement each : radios) {
			System.out.println(each.getText());
		}

		driver.quit();

	}
}
