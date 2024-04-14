//Write a script to verify checkbox in page is selected or not.

package March19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods2 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://formstone.it/components/checkbox/");
		Thread.sleep(5000);
		
		WebElement element = driver.findElement(By.xpath("(//div[@class='fs-checkbox-flag'])[1]"));
		boolean is_Selected = element.isSelected();
		System.out.println(is_Selected);
		
		if(is_Selected)
			driver.findElement(By.xpath("(//div[@class='fs-checkbox-flag'])[1]")).click();
		else
			driver.findElement(By.xpath("(//div[@class='fs-checkbox-flag'])[1]")).click();
		
	   Thread.sleep(3000);
		
		driver.quit();
	}
}
