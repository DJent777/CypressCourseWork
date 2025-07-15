package OOPS;

public class Car {
	
	Car(){
		System.out.println("Creating consturcutor of car class");
	}
	
	public final void setWheels() {
		System.out.println("Only 4 wheels are allowed");
	}
	
	String name = "Car Segment";
	
	public void run() {
		System.out.println("Car is running");
	}

}
