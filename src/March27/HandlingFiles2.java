//Write a script to Read text from a file.

package March27;

import java.io.*;


public class HandlingFiles2 {

		public static void main(String[] args) throws Throwable {
			//Create a file
			FileReader fr = new FileReader("C:\\Users\\nikita.choudhari\\Documents\\Development\\Selenium Automation\\Selenium_Qedge\\mrngbatch1.txt");
			BufferedReader br = new BufferedReader(fr);
			String str;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			 
			
		}
}
