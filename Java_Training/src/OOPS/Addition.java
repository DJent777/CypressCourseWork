package OOPS;

public class Addition extends finalClass{ /*cant extend due to the class defined with the 'final' keyword*/
	
	public void addValues(int a, int b) {
		int c = a + b;
		System.out.println("Addition is : " + c);
	}

	public void addValues(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("Addition is : " + d);
	}
	
	public double addValues(double a, double b) {
		double c = a + b;
		return c;
	}
	
}
