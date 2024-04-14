//Write a script to perform drag and drop in frames
package March22;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop2 {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		Actions ac = new Actions(driver);
		//collection of frames in webpage
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No. of freames in webpage - "+frames.size());
		
		//switch to frame
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable")); 
		WebElement target = driver.findElement(By.id("droppable"));
		 
		int x = target.getLocation().getX();
		int y = target.getLocation().getY();
		System.out.println(x+"   "+y);
		ac.dragAndDropBy(source, x, y).perform();
		Thread.sleep(3000);		
		
		driver.quit();
		
		
	}
}
