//Write a script to print the no. of radio buttons and print the name of them.

package March19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods4 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		//collection of all radio buttons
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("No. of radio buttons - "+radios.size());
		//Label of each radio buttons
		List<WebElement> labels = driver.findElements(By.xpath("//label[@class='_58mt']"));

		for (WebElement each : labels) {
			System.out.println(each.getText());
			System.out.println("===================");
		}
		
		
		driver.quit();
	}
}
