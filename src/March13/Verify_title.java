//Write a script to verify your Expected title with Actual title.

package March13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_title {

	public static void main(String[] args) throws Throwable {
		// Create Instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// launch the url
		driver.get("http://www.google.com/");
		// Suspend tool for 5 sec to load the webelements.
		Thread.sleep(5000);
		
		String Expected = "google";
		String Actual = driver.getTitle();
		
		if(Expected.equalsIgnoreCase(Actual))
			System.out.println("Title is Matching -"+Expected+" "+Actual);
		else
			System.out.println("Title is not Matching -"+Expected+" "+Actual);
		
		driver.close();
	}
}
