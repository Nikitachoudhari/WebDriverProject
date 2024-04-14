//Write a script to select items in Listbox.

package March15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		
		Select dayListBox = new Select(driver.findElement(By.name("birthday_day")));
		Select monthListBox = new Select(driver.findElement(By.name("birthday_month")));
		Select yearListBox = new Select(driver.findElement(By.name("birthday_year")));
		
		boolean value = dayListBox.isMultiple();
		System.out.println("Is List box is multi-selection - "+value);
		
		dayListBox.selectByIndex(20);
		Thread.sleep(5000);
		monthListBox.selectByVisibleText("Dec");
		Thread.sleep(5000);
		yearListBox.selectByVisibleText("1998");
		Thread.sleep(5000);
		
		driver.quit();	
		
	}
}
