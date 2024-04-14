package March28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitStatement {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		//Explicit wait - create object for webdriverwait class
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));  
		
		//wait until element is clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account") ) );
		driver.findElement(By.linkText("Create new account")).click();
		
		//wait until element is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("testing");
		
		//wait until element is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname")));
		driver.findElement(By.name("lastname")).sendKeys("Data");
		
 		
	}
}
