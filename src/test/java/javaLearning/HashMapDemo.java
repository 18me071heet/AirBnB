package javaLearning;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		// Adding elements
		
		map.put(100, "First");
		map.put(102, "First");
		map.put(100, "Second");  // Old value is replacing with the new value
		
		System.out.println(map);
		
		System.out.println(map.size());   // Size 
		
		
		// Remove pair 
		
		map.remove(100);
		
		System.out.println("After removing pair:"+map);
		
		// Access value of the key
		
		System.out.println(map.get(102));
		
		// Get all keys
		
		System.out.println(map.keySet());
		
		// Get all value
		
		System.out.println(map.values());
		
		// Get key along with value
		
		System.out.println(map.entrySet());
		
		
		// Read value using for each loop
		
		
		for(int k:map.keySet()) {
			
			System.out.println(k+"   "+map.get(k));
		}

	}

}
