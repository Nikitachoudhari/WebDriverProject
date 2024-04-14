//Write a script to print each row cell data in a Table.

package March25;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		Thread.sleep(5000);
		
		//store table into webelement
		WebElement webtable = driver.findElement(By.id("customers"));
		List<WebElement>  rows , cols;
		
		//get collection of rows from a webtable
		rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No. of rows in a table - "+row);
		
		//iterate all rows
		for (WebElement eachrow : rows) {
			//get each row cell collection
			cols = eachrow.findElements(By.tagName("td"));
			//iterate each cell
			for (WebElement eachcell : cols) {
				Thread.sleep(1000);
				//print each cell data
				System.out.print(eachcell.getText()+"   ||   ");
			}
			System.out.println();
		}

		driver.quit();
	}

}
