package FirstJavaPackage;

public class SecondJavaClass {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Team";
		
		int a = 200;
		int b = 300;
		
		/* concatanating 
		/*System.out.println(str1 + " " + str2);
		System.out.println(a + b);
		
		System.out.println(a + b + str1 + str2);
		System.out.println(str1 + str2 + a + b);
		*/
		
		/* if and if else statements
		/*if(a>1000) {
			System.out.println("A is greater then 1000");
		} else {
			System.out.println("A is less then 1000");
		}*/
		
		/* nested if statement
		/*if(a==100) {
			System.out.println("A is 100");
		}else if (a==200) {
			System.out.println("A is 200");
		}else if (a==300) {
			System.out.println("A is 300");
		}else {
			System.out.println("Value doesnt present");
		}*/
		
		/*switch cases*/
		int day = 6;
		
		switch (day) {
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2: 
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		
		default:
			System.out.println("Its the weekend!");
			break;
		}
	}

}
