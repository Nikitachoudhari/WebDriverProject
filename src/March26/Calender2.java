package March26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import March25.WebTable1;

public class Calender2 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(3000);

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		//click on Leave
		driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();

		String dob = "2025-Sep-28";
		String temp[] = dob.split("-");
		String month = temp[1];
		String date = temp[2];
		String year = temp[0];
		//click on calender
		driver.findElement(By.xpath("//li[1]//img[1]")).click();
		Thread.sleep(3000);
		//select year from calender
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(year);
		Thread.sleep(3000);
		//select month from calender
		new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByVisibleText(month);
		Thread.sleep(3000);

		WebElement table = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows , cols;

		rows = table.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcol : cols) {
				if(eachcol.getText().equals(date)) {
					Thread.sleep(3000);
					//click on date from calender
					eachcol.click();
				}

			}
		}
		Thread.sleep(3000);

		driver.quit();

	}
}
