//write a script to capture specific row column data in a table.

package March25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		Thread.sleep(5000);
		
		//Print specific row column data
		String tableText1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[1]")).getText();
		String tableText2 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]")).getText();
		String tableText3 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]")).getText();
		System.out.println(tableText1+"=========="+tableText2+"=========="+tableText3);

		driver.quit();
	}

}
