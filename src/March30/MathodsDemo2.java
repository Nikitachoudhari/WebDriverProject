package March30;

public class MathodsDemo2 {
	//global static variables
	static int x, y, z;
	
	public static void mul() {
		x = 10;
		y = 23;
		z = x * y ;
		System.out.println("Multiplication is "+z);
	}
	
	public static void sub() {
		x = 14;
		y = 2 ;
		z = x - y;
		System.out.println("Subtraction is "+z);
	}
	
	
		public static void main(String[] args) {
			MathodsDemo2.mul();
			MathodsDemo2.sub();
			 
		}
}
