package pageObject;


    class Fruit{
	
	void types() {
		
		System.out.println("Types of Fruit and Color ");
	}
}

    class Apple extends Fruit{
	
	void color() {
		
		System.out.println("Apple : Red");
	}
}

    class Graps extends Fruit{
	
	void color() {
		
		System.out.println("Bana: Yellow");
	}
}
    
    
    public class ObjectCastingDemo {

	public static void main(String[] args) {
		

		Fruit f1 = new Apple();           // Up Casting
		Fruit f2 = new Graps();           // Up Casting
		
	    f2.types(); // Accessing parent class method
	    
	    // f1.color();  Getting Error not accessible
	    
	    
	    
	   Apple a = (Apple) f1;        // Down Casting 
	   
	   a.color();  // Accessing Apple class method 
	
	   Graps g = (Graps)f2;
	   
	   g.color();   // Accessing Graps class method 
	   
		
		
		
	}

}
