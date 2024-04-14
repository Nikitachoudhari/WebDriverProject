//Write a script to verify item present in Listbox  
package March15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox3 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://www.amazon.in/");
		Thread.sleep(5000);

		Select element = new Select(driver.findElement(By.id("searchDropdownBox")));
		String item = "baby1";
		boolean present = false;

		List<WebElement> ListBox_elements = element.getOptions();
		System.out.println(ListBox_elements.size());

		for (WebElement each : ListBox_elements) {
			String Actual = each.getText();
			Thread.sleep(1000);
			System.out.println(Actual);

			if (Actual.equalsIgnoreCase(item)) {
				present = true;
				break;
			}
		}
		
		if (present) {
			System.out.println("Item Exist in ListBox " + present);
		} else {
			System.out.println("Item does not Exist in ListBox " + present);
		}

		driver.quit();

	}
}
