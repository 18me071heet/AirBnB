package javaLearning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		// Adding elements
		
		set.add("First");
		set.add(10);
		set.add('A');
		set.add(10);
		set.add(null);
		
		System.out.println(set);
		
		// removing specific value
		
		set.remove("First");
		
		System.out.println("After removing specific value:"+set);
		
		// Inserting element --> Not possible 
		
		set.add("Fourth");
		
		System.out.println("After inserting:"+set);
		
		// Access specific element --> Not possible
		
		// Converting Hashset -> ArrayList
		
		ArrayList list = new ArrayList(set);
		System.out.println(list);
		System.out.println(list.get(1));            // We can get element by using arraylist converting concept
		
		
		// Read all elments using enhanced loop concept
		
		for(Object x:set) {
			
			System.out.println(x);
		}
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());   // If you enter only this statement without while then it will return only one random element
		}
		
		
		// Size of hashset
		
		System.out.println("Size of Set:"+set.size());
		
		// Clearing all elements from the set
		
		set.clear();
		
		System.out.println(set);
		
		
		

	}

}
