package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String args[]) {
		
		HashSet hash = new HashSet<>();
		
		hash.add("DJ");
		hash.add("Cassler");
		hash.add("Franklin");
		hash.add("Canal Winchester");
		hash.add("Ohio");
		
		System.out.println(hash);
		
		hash.remove("Franklin");
		System.out.println(hash);
		
		System.out.println("Is set contain Cassler : " + hash.contains("Franklin"));
		
		Iterator i = hash.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
