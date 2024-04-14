//write a script to handle Alert in Primus bank.

package March16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertDemo2 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.primusbank.qedgetech.com/");
		Thread.sleep(5000);

		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		//Branches page
		driver.findElement(By.xpath("(//img[@src='images/Branches_but.jpg'])[1]")).click();
		//click on delete button
		driver.findElement(By.xpath("(//img)[11]")).click();
		Thread.sleep(3000);
		String alert_text1 = driver.switchTo().alert().getText();
		System.out.println(alert_text1);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		//click on delete button
		driver.findElement(By.xpath("(//img)[11]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		String alert_text2 = driver.switchTo().alert().getText();
		System.out.println(alert_text2);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
