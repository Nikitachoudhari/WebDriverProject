import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		WebDriver d1 = new FirefoxDriver();
		
		WebDriver d2 = new EdgeDriver();
		
		WebDriver d3 = new InternetExplorerDriver();
		
		

	}

}
