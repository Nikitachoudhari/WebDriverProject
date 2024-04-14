//Write a script to write some text in a file.

package March27;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class HandlingFiles {

		public static void main(String[] args) throws Throwable {
			//Create a file
			File f = new File("C:\\Users\\nikita.choudhari\\Documents\\Development\\Selenium Automation\\Selenium_Qedge\\mrngbatch.txt");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("I want a Job in Top MNC");
			bw.newLine();
			bw.write("With 20L of package");
			bw.newLine();
			bw.write("In Automation Testing");
			bw.flush();
			bw.close();
			
		}
}
