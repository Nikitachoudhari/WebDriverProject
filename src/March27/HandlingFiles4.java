//Write a script to Read text from a file.

package March27;

import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingFiles4 {

	public static void main(String[] args) throws Throwable {
	
		FileReader fr = new FileReader("C:\\Users\\nikita.choudhari\\Documents\\Development\\Selenium Automation\\Selenium_Qedge\\Logindata.txt");
		BufferedReader br = new BufferedReader(fr);

		String str;
		while((str=br.readLine())!=null) {
			String login[] = str.split(",");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://orangehrm.qedgetech.com/");
			
			Thread.sleep(3000);
			driver.findElement(By.name("txtUsername")).sendKeys(login[0]);
			driver.findElement(By.name("txtPassword")).sendKeys(login[1]);
			driver.findElement(By.name("Submit")).click();

			String Expected = "dashboard";
			String Actual = driver.getCurrentUrl();
			if(Actual.contains(Expected))
				System.out.println("Login Success");
			else 
				System.out.println("Login Failed");

			driver.quit();
		}
		 
	}
}

