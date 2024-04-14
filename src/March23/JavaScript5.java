//Write a javascript to login

package March23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript5 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location = 'http://orangehrm.qedgetech.com/'");
		Thread.sleep(3000);

		js.executeScript("document.querySelector(\"input[name='txtUsername']\").value='Admin'"); 
		js.executeScript("document.querySelector(\"input[name='txtPassword']\").value='Qedge123!@#'"); 
		js.executeScript("document.querySelector(\"input[value='LOGIN']\").click()"); 
		Thread.sleep(3000);

		String Expected = "dashboard";
		String Actual = js.executeScript("return document.URL").toString();

		if(Actual.contains(Expected)) {
			System.out.println("Login Success"+"     "+Expected+"      "+Actual);
		}
		else {
			String error = js.executeScript("return document.querySelector(\"#spanMessage\").innerHTML").toString();
			System.out.println(error+"     "+Expected+"      "+Actual);
		}

		driver.quit();
	} 
}
