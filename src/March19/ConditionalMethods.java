//Write a script to verify webelements status in facebook Page

package March19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.name("firstname"));
		boolean is_Enabled = element.isEnabled();
		System.out.println(is_Enabled);
		
		WebElement element1 = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		boolean is_Displayed = element1.isDisplayed();
		System.out.println(is_Displayed);
		
		WebElement element2 = driver.findElement(By.xpath("//input[@value='1']"));
		boolean is_Selected = element2.isSelected();
		System.out.println(is_Selected);
		
		driver.quit();
	}
}
