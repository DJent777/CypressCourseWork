package OOPS;

public class SampleFinal {
	
	final int maxAge = 100;
	
	public void setAge() {
		maxAge = 110; /*cant be overwritten due to the 'final' definition above*/
	}

	public static void main(String[] args) {
		

	}

}
