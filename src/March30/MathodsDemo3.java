package March30;

public class MathodsDemo3 {

	public static void addition(int a , int  b) {
		int c = a + b;
		System.out.println("Addition is "+c);
	}

	public static String Verify_String(String str1 , String  str2) {
		String res;
		if(str1.equalsIgnoreCase(str2))  
			res = "Both string are equal";
		else 
			res = "Both strings are not equal";

		return res;
	}

	public static boolean compare_values(int x , int y) {
		if(x == y)  
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {

		MathodsDemo3.addition(12 , 6);
		String 	res = MathodsDemo3.Verify_String("Test", "jio");
		boolean a = MathodsDemo3.compare_values(100, 100);
		System.out.println(res);
		System.out.println(a);

	}
}
