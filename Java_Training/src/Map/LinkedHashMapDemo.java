package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
		
		lmap.put("DJ",  35);
		lmap.put("John",  47);
		lmap.put("Amit",  26);
		lmap.put("Nitika", 23);
		lmap.put("Julia",  35);
		lmap.putIfAbsent("DJ", 35);
		
		System.out.println(lmap);
		System.out.println("Size of map : " + lmap.size());
		System.out.println("Is map empty : " + lmap.isEmpty());
		System.out.println("Does Contains Nitika : " + lmap.containsKey("Nitika"));
		System.out.println("Is contains 23 : " + lmap.containsValue(23));

	}

}
