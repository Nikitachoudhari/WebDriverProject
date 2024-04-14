//Write a script to get collection of rows in a table and print each row's column size.

package March25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		Thread.sleep(5000);
		
		//store table into webelement
		WebElement webtable = driver.findElement(By.id("customers"));
		//get collection of rows in a webtable
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;		
		System.out.println("No. of rows in a Table - "+row);
		
		for(int i=1 ; i<=row ; i++) {
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row No. "+i+"  "+"column size "+col.size());
		}
				
		driver.quit();
	}

}
