package March16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox5 {
	public static void main(String[] args) throws Throwable {
		//select items in listbox from 0 to 9
		//get collection from items which are selected.
		//Print each item name which are selected.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("file:///C:/Users/nikita.choudhari/Downloads/MultiListboxHtmlpage_lyst8730.html");
		Thread.sleep(5000);

		Select listBox = new Select(driver.findElement(By.name("multiSelection")));
		boolean value = listBox.isMultiple();
		System.out.println(value);
		
		//select items in listbox from 0 to 9
		for(int i=0 ; i<=9 ; i++) {
			Thread.sleep(1000);
			listBox.selectByIndex(i);
		}
		Thread.sleep(3000);
		
		List<WebElement> elements = listBox.getAllSelectedOptions();
		//get collection from items which are selected.
		System.out.println("No. of items selected - "+elements.size());
		
		//Print each item name which are selected.
		for (WebElement each : elements) {
			Thread.sleep(1000);
			System.out.println(each.getText());
		}
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
