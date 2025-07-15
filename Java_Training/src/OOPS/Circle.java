package OOPS;

public class Circle extends Shape{

	
	public void displayShape() {
		System.out.println("Shape is circle");
		
	}
	
	public static void main(String[] args) {
		
		Shape s = new Circle();
		Shape s1 = new Triangle();
		
		s.displayShape();
		s1.displayShape();
	}

}
