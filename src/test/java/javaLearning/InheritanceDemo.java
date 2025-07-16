package javaLearning;



// Single Inheritance - Single Parent and Single Child

class A {
	
	int x=20;
	void show() {
		
		System.out.println(x);
	}
}

class B extends A{
	
	int y=50;
	
	void display() {
		
		System.out.println(x+y);
	}
}


// MultiLevel Inheritance  -- Chaining 

  class C extends B{
	
	int z=70;
	
	void showing() {
		
		System.out.println(y+z);
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		
		
		// Creating child object , It will access their and their parent property
		
		B demo = new B();
		
		demo.show();
		demo.display();
		
		System.out.println(demo.x);
		System.out.println(demo.y);
		
		// Creating parent object , It will only access of their(parent) property
		
		A demo2 = new A();
		
		demo2.show();
		System.out.println(demo2.x);

		
		
		// Creating grand child object , It will access of their ( Self ) , Parent and Grand parent property .
		
		C demo3 = new C();
		
		
	//	System.out.println(demo3.x);
		System.out.println(demo3.y);
		System.out.println(demo3.z);
		
		demo3.show();
		demo3.showing();
		demo3.display();
		
		

	}

}
