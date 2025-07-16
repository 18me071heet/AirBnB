package javaLearning;

                                     // Interface contains Abstract Methods

   interface Animal {
	   
	   void eat();                 // Abstract Methods
	   void sound();
   }
   
   
   class Dog implements Animal {   // Class Implement Interface
	
	public void sound() {                       
		
		System.out.println("Barking");
	}
	
	
	public void eat() {
		
		System.out.println("Grass");
		
	}
	   
   }
  
public class InterfaceDemo {

	public static void main(String[] args) {

		Animal a = new Dog();                         // Create reference variable for Interface and create object of Class.
		a.eat(); 
		a.sound();


	}

}
