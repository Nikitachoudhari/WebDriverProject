package March26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import March25.WebTable1;

public class Calender {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(3000);
		
		String dob = "November/16/2010";
		String temp[] = dob.split("/");
		String month = temp[0];
		String date = temp[1];
		String year = temp[2];
		driver.switchTo().frame(0);
		driver.findElement(By.className("hasDatepicker")).click();
		
		//get calender year
		String calyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		while(!calyear.equals(year)) {
			//click previous button
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		Thread.sleep(3000);
		
		//get calender month
		String calmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		while(!calmonth.equalsIgnoreCase(month)) {
			//click previous button
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		Thread.sleep(3000);
		
		WebElement table = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows , cols;
		rows = table.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcol : cols) {
				if(eachcol.getText().equals(date)) {
					Thread.sleep(3000);
					eachcol.click();
				}
			}
		}
		Thread.sleep(3000);
		driver.quit();
		
	}
}
