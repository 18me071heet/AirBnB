package javaLearning;

                                // Interface contains Abstract , Default and Static Method

    interface Vehicle {
	
	void fuel();                                       // Abstract Method
	
	default void service() {                           // Default Method
		
		System.out.println("After every 10000 km");
	}
	
	
	static void type() {                                // Static Method
		
		System.out.println("SUV");
	}
	
    }


   class Car implements Vehicle {
	
	public void fuel() {
		
		System.out.println("Petrol");
	}
}


public class InterfaceDemo2 {

	public static void main(String[] args) {

		
		Vehicle v = new Car();                    // Create reference variable of interface and create object of Class
		v.fuel();
		v.service();                                  // Call default method
		
		
		Vehicle.type();                              // Call static method by ClassName.method name
		
		
		Car c = new Car();
		c.fuel();
		
	}

}
