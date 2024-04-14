//Write a script to get the no. of radio buttons and print the name of radio buttons .

package March19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods3 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		
		List<WebElement> radios = driver.findElements(By.xpath("//li[contains(@class,'font12 blackText wrapFilter')]"));
		
		System.out.println("No. of radio buttons - "+radios.size());
		for (WebElement each : radios) {
			System.out.println(each.getText());
			System.out.println("===================");
		}
		
		
		driver.quit();
	}
}
