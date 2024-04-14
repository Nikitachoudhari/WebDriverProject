//Write a script to select 0 to 8 from multiselection listbox and deselect from selection.

package March16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox4 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("file:///C:/Users/nikita.choudhari/Downloads/MultiListboxHtmlpage_lyst8730.html");
		Thread.sleep(5000);

		Select listBox = new Select(driver.findElement(By.name("multiSelection")));
		boolean value = listBox.isMultiple();
		System.out.println(value);
		
		//select 0 to 8 items
		for(int i=0 ; i<=8 ; i++) {
			Thread.sleep(3000);
			listBox.selectByIndex(i);
		}
		Thread.sleep(3000);
		
		//deselect from selection
		listBox.deselectByVisibleText("Yellow");
		Thread.sleep(3000);
		listBox.deselectByIndex(6);
		Thread.sleep(3000);
		listBox.deselectAll();
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
