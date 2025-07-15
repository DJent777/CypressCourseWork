package OOPS;

public class MedicalClass implements Student{

	
	public void displayName() {
		System.out.println("Hi, we are from Medical department");
	}

	
	public void getStudentNumber() {
		System.out.println("We are 140 Students");
	}

	
	public void getStandard() {
		System.out.println("We are from MMBS");
	}

	public void getUniversity() {
		System.out.println("University name is London University");
	}
	
	public static void main (String[] args) {
		EngineeringClass eng = new EngineeringClass();
		MedicalClass med = new MedicalClass();
		
		eng.displayName();
		eng.getStandard();
		eng.getStudentNumber();
		eng.getUniversity();
		
		System.out.println("***************************");
		
		med.displayName();
		med.getStandard();
		med.getStudentNumber();
		med.getUniversity();
	}


	public void getInterfaceName() {
		
	}
	
}
