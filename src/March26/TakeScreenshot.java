package March26;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//take a screenshot and store
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
		//copy screenshot into Local path.
		FileUtils.copyFile(screen, new File("C:\\Users\\nikita.choudhari\\Documents\\Development\\Selenium Automation\\Selenium_Qedge\\Screenshot\\homepage.png")); 
		
		driver.quit();
	}

}
