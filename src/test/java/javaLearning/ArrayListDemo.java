package javaLearning;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	 
		
		// If want to add all types of data ( Hetrogenous data )
		
		ArrayList list = new ArrayList();
		
		list.add("First");
		list.add(1);
		list.add("Second");
		list.add(2);
		list.add(null);
		
		
		System.out.println(list);
		
		list.remove(2);             // 2 is index of element
		
	//	System.out.println("After removing the value:"+list);
		
		// Insert value between middle of the list
		
		list.add(3, "Yepp");
		
	//	System.out.println("After inserting value in the middle of the list:"+list);
		
		
		// Updating Modifying the list value 
		
	    list.set(0, "New First");
	
	//   System.out.println("After changing the first index value:"+list);
		
		// Access specific element from the list 
	   
	 //   System.out.println(list.get(2));
	   
	  
	                            // Read all the elements from the array list using normal for loop
	    
	    
	    
	 /*   for(int i=0;i<list.size();i++) {
	    	
	    	System.out.println(list.get(i));
	    }
	    
	    */
	    
	    
	    // Using for each loop
	    
	    for(Object x: list) {
	    	
	    	System.out.println(x);
	    }
	    
	    
	    // Using iterator 
	    
	    Iterator it = list.iterator();
           
	    // Use while loop coz we dont know how many element is present 
	    
	    while(it.hasNext()) {                  // Check if element is present or not
	    	
	    	System.out.println(it.next());   // Get perticular element from the arraylist
	    }
	    
	    
	    // Check arraylist is empty or not
	    
	    System.out.println("List is empty or not:"+list.isEmpty());
	    
	     // Remove all elements from list
	    
	    ArrayList myList2 =new ArrayList();
	    
	    myList2.add("New First");
	    myList2.add(0);
	    myList2.add(1);
	    
	   list.removeAll(myList2);
	   
	   System.out.println("After removing:"+list);
	   
	   
	 //  list.clear(); --> To clear all elements from the arraylist
	   
	                    	          // If want to add only integer  ( Homegenous data )
	    
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		myList.add(3);
		myList.add(4);
	
		//System.out.println(myList);
		
		//System.out.println("Size of the array list:"+myList.size());
		
	
		
	}

}
