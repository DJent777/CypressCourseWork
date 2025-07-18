package Strings;

public class StringBuggeringIntro {

	public static void main(String[] args) {
		
		
		String name = "DJ";
		name.concat(" Cassler");
		
		// System.out.println(name);
		
		StringBuffer name1 = new StringBuffer("DJ");
		// name1.append(" Cassler");
		
		//name1.insert(2, "Cassler");
		
		//name1.replace(0, 2, "Cassler");
		
		//name1.delete(0, 1);
		
		name1.reverse();
		System.out.println(name1);
		

	}

}
