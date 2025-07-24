package javaLearning;

                                     // Interface contains Abstract Methods

   interface Birds {
	   
	   void eat();                 // Abstract Methods
	   void sound();
   }
   
   
   class Pigeon implements Birds {   // Class Implement Interface
	
	public void sound() {                       
		
		System.out.println("Barking");
	}
	
	
	public void eat() {
		
		System.out.println("Grass");
		
	}
	   
   }
  
public class InterfaceDemo {

	public static void main(String[] args) {

		Birds bird = new Pigeon();
		bird.eat();
		bird.sound();


	}

}
