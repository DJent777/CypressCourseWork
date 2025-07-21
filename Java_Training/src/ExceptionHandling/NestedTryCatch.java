package ExceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		try {
			System.out.println("First Try Block");
			
			String text = "DJ";
			System.out.println(text.length());
			
			try {
				System.out.println("Second Try Block");
				
				int value = 100/1;
				
				try {
					
					System.out.println("Third Try Block");
					
					int[] array = new int[3];
					array[5] = 100;
					
				} catch(Exception e) {
					System.out.println("End of third try block");
					e.printStackTrace();
				}
			} catch(Exception e) {
				
				System.out.println("End of Second Try Block");
				e.printStackTrace();
				
			}
			
		} catch(Exception e) {
			System.out.println("End of First try Block");
			e.printStackTrace();
		}

	}

}
