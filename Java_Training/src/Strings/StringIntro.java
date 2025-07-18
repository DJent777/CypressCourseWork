package Strings;

public class StringIntro {

	public static void main(String[] args) {
		
		String name = "DJ Cassler";
		String name1 = "DJ Cassler";
		String name2 = "dj cassler";
		
		String country = new String("United States");
		String country1 = new String("United States");
		
//		System.out.println(name);
//		
//		System.out.println(country);
//		
//		System.out.println(name.equals(name1));
//		System.out.println(name.equals(name2));
//		
//		System.out.println(name.equalsIgnoreCase(name2));
//		
//		System.out.println(country.equals(country1));
		
//		System.out.println(name == name1);
//		System.out.println(country == country1);
		
		String finalString = name + name1 + name2;
		
		System.out.println(finalString);
		
		String secString = name.concat(name1).concat(name2);
		System.out.println(secString);

	}

}
