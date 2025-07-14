package FirstJavaPackage;

public class FirstJavaProgram {
	
	static int varSec = 9876;
	
	public static void firstMethod() {
		int number = 12345;
		
		boolean flag = true;
		
		char character = 'A';
		
		String city = "newyork";
		
		long phoneNumber = 9876543210L;
		
		double decimalValue = 123.43D;
		
		System.out.println(number);
		System.out.println(city);
		System.out.println(varSec);
	}

	public static void main(String[] args) {
		FirstJavaProgram.firstMethod();
		System.out.println(varSec);

	}

}
