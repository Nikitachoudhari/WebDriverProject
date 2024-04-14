package April1;

public class Overload {

	void demo(int a) {
		System.out.println("a - "+a);
	}

	void demo(int a , int b) {
		System.out.println("a -"+a+"  "+"b -"+b);
	}

	double demo(double a) {
		System.out.println("double a -"+a);
		return a*a;
	}

	public static void main(String[] args) {

	}
}
