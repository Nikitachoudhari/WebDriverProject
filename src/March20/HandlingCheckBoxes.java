package March20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {
	public static void main(String[] args) throws Throwable {
		//Get collection of all checkboxes
		//Verify which checkbox is true or false
		//Get each checkbox name stored into value property
		//uncheck checkbox if already checked and check if already unchecked. 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/nikita.choudhari/Documents/Development/Selenium%20Automation/Selenium_Qedge/checkbox_1_lyst7599.html");
		Thread.sleep(5000);
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		//Get collection of all checkboxes
		System.out.println("No. of Checkboxes are - "+checkboxes.size());
		
		for (WebElement each : checkboxes) {
			System.out.println(each.getAttribute("value")+"    "+each.isSelected());
			Thread.sleep(3000);
			each.click();
		}
		Thread.sleep(3000);
		
		driver.quit();
	}
	
}
