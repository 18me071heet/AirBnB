package javaLearning;


   abstract class Animal {
	
	abstract void eat() ;        // Abstract Method ( Without body / implementation )
	
 //	abstract int = 5;   There is no any abstract variable in java.
	
	void behaviour() {
		
		System.out.println("Behaviour of the Animal :");
	}
	
}

    class Dog extends Animal {                  // Extend Abstract class to another class
	
	void eat(){
		
		System.out.println("Milk");
	}
	
	void behaviour() {
		
		System.out.println("Normal");
	}

 }

    public class AbstractDemo {

	public static void main(String[] args) {

	   
		
	//	Animal animal = new Animal();  --> Can't create object for abstract class   
		
		Animal animal = new Dog();   //  --> Can create object reference for abstract class 
		animal.eat();
		animal.behaviour();          // Behaviour of Dog 
	     
		
	//	Dog d = new Dog();
    //		d.eat();
		
	
	
	}

}
