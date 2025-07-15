package OOPS;

public class x3 extends BMW{
	
	static String model = "x3";

	public static void main(String[] args) {
		
		BMW bmw = new BMW();
		
		System.out.println("Model is " + model);
		System.out.println("Brand is " + bmw.name);
		
		System.out.println("Behavior is ");
		bmw.run();
		
	}

}
