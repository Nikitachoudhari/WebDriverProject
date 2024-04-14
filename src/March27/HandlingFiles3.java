//Write a script to Read text from a file.

package March27;

import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingFiles3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.primusbank.qedgetech.com/");
		Thread.sleep(3000);
		String para1 = driver.findElement(By.xpath("(//P[@class='style7'])[2]")).getText();
		String para2 = driver.findElement(By.xpath("(//P[@class='style7'])[3]")).getText();

		File f = new File("C:\\Users\\nikita.choudhari\\Documents\\Development\\Selenium Automation\\Selenium_Qedge\\primus.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(para1);
		bw.newLine();
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();

		driver.quit();

	}


}

