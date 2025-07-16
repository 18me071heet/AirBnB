package javaLearning;

public class ConstructorDemo {

	int x,y;
	
	ConstructorDemo(){  // Default Constructor
		
		x=10;
		y=20;
	}
	
	ConstructorDemo(int a,int b) {   // Parameterized Constructor
		
		x=a;
		y=b;
	}
	
	void sum() {
		
		System.out.println(x+y);
	}
	
	
	
	public static void main(String[] args) {
		
	//   ConstructorDemo demo = new ConstructorDemo();    // Invoke Default Constructor 
		
		
		ConstructorDemo demo = new ConstructorDemo(14,20);   // Invoke Parameterized Constructor
		demo.sum();
		
		

	}

}
