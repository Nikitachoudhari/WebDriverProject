//write a script to handle Alert

package March16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertDemo {
      
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		driver.quit();
		
	}
	
}
