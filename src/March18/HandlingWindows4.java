//Write a script to open the child windows get the title and switch to parent window.

package March18;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWindows4 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/");
		Thread.sleep(5000);
		
		//get parent id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		driver.findElement(By.xpath("//li[@id='stayIcon']")).click(); 
		driver.findElement(By.xpath("//div[@id='divMain']//li[3]")).click();
		driver.findElement(By.xpath("//li[@id='eCaterinIcon']")).click();
		driver.findElement(By.xpath("//div[@id='divMain']//li[3]")).click();
		driver.findElement(By.xpath("//div[@id='divMain']//li[3]")).click();
		driver.findElement(By.xpath("//div[@id='divMain']//li[3]")).click();
		driver.findElement(By.xpath("//li[@id='hillRailwaysIcon']")).click();
		driver.findElement(By.xpath("//li[@id='charterTrainIcon']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circlenine']")).click();
		Thread.sleep(3000);
		
		ArrayList<String> all_windows = new ArrayList<String>(driver.getWindowHandles()) ;
		for (String each : all_windows) {
			if(!parent.equals(each)) {
				String title = driver.switchTo().window(each).getTitle();
				System.out.println(title+"   "+each);
				Thread.sleep(3000);
			}
		}
		 
		Thread.sleep(3000);
		driver.switchTo().window(parent);  
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}
}
