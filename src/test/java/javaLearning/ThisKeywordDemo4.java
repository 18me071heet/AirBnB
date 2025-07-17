package javaLearning;

public class ThisKeywordDemo4 {

	int id;
	String name;
	String location;
	
	// Default Constructor
	ThisKeywordDemo4() {
		
		this(0,"Will","Rajkot");              // Calling 3 arg constructor
		
	}
	
	
	// 2 parameters constructor
	
	ThisKeywordDemo4(int id,String name){
		
         this(id,name,"Jamnagar");	          // Calling 3 arg constructor   	
	}
	
	
	  // Constructor with 3 parameters
	
   ThisKeywordDemo4(int id, String name, String location) {
	
	   this.id=id;
	   this.name=name;
	   this.location=location;
	}
   
   void display() {
	   
	   System.out.println("Id: " + id + ",Name :" + name +",Location : " + location);
   }
   
   
	public static void main(String[] args) {
	
		ThisKeywordDemo4 demo = new ThisKeywordDemo4();
		ThisKeywordDemo4 demo2 = new ThisKeywordDemo4(1,"John");
		ThisKeywordDemo4 demo3 = new ThisKeywordDemo4(2,"Stonis","Ahmedabad");
		
		demo.display();
		demo2.display();
		demo3.display();
	    

	}

}
