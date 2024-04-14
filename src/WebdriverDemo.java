import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverDemo {

	public static void main(String[] args) throws Throwable {
		//Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();     // maximize the browser window
		driver.manage().deleteAllCookies();
		
		//launch the url
		driver.get("https://google.com");
		//suspend tool from execution for 5 sec	
		Thread.sleep(5000);
		driver.close();

	}

}
