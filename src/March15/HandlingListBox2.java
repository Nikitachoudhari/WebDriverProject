//Write a script to print no. of items in listbox and print all the items on screen.    
package March15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox2 {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://www.amazon.in/");
		Thread.sleep(5000);
		
		Select element = new Select(driver.findElement(By.id("searchDropdownBox"))); 
		List<WebElement> options = element.getOptions();
		System.out.println("Number items in List - "+options.size());
		Thread.sleep(5000);
		
		for (WebElement each : options) {
			Thread.sleep(1000);
			System.out.println(each.getText());
		}
		
	 	driver.quit();	
		
	}
}
