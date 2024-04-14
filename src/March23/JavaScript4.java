//Write a javascript to register to opencart

package March23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript4 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location = 'https://demo.opencart.com/'");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		
		
		js.executeScript("document.querySelector(\"#input-firstname\").value='Nita'");   //"JS path".value=''
		js.executeScript("document.querySelector('#input-lastname').value='Test'"); //document.querySelector('Css selector').value=''
		js.executeScript("document.getElementById('input-email').value='niki@gmail.com'"); // document.getElementById('id').value=''
		js.executeScript("document.querySelector(\"#input-password\").value='Test@123'"); //"JS path".value=''
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0 , 400)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()"); //"JS path".click() 
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"#form-register > div > div > div > input\").click()"); //"JS path".click() 
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"#form-register > div > div > button\").click()"); //"JS path".click() 
		Thread.sleep(3000);
		
		
		driver.quit();
	} 
}
