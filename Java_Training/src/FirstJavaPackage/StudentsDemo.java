package FirstJavaPackage;

public class StudentsDemo {

	int rollNumber;
	String name;
	String Standard;
	
	public StudentsDemo(int rollNumber, String name, String Standard) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.Standard = Standard;
	}
	
	public void display() {
		System.out.println("Student Roll Number : " + rollNumber + " name is : " + name + " and in class : " + Standard);
	}
	
	public static void main(String[] args) {
		
		StudentsDemo std = new StudentsDemo(10, "Frank", "2nd");
		StudentsDemo std2 = new StudentsDemo(20, "Michael", "5th");
		
		std.display();
		std2.display();

	}

}
