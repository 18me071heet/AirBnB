package javaLearning;

    interface Hardware {
    	
    	void battery();
    	
    }
    
    class Mobile implements Hardware{
    	
     public void battery() {
    		
    		System.out.println("Battery Mah is : 5000");
    	}
    	
    	void condition() {
    		
    		System.out.println("Condition of battery is : Good");
    	}
    }
    
    
     public class TypeCastingWithInterface {

	 public static void main(String[] args) {
	 
		Hardware h = new Mobile();
		
		h.battery();                                // Accessing battery method
		
	   // h.condition();                          Can't Accessible condition method 
		
	    Mobile m = (Mobile) h;                        // Down Casting 
	    
	    m.condition();                             // Accessible condition method.            
		
	   
	}

}
