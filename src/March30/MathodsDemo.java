package March30;

public class MathodsDemo {
	//global non-static variable
	int x, y, z;
	
	public void add() {
		x = 10;
		y = 23;
		z = x + y ;
		System.out.println("Addition is "+z);
	}
	
	public void division() {
		x = 14;
		y = 2 ;
		z = x/y;
		System.out.println("Division is "+z);
	}
	
		public static void main(String[] args) {
			MathodsDemo m1 = new MathodsDemo();
			m1.add();
			m1.division();
		}
}
