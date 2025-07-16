package javaLearning;

public class StaticMethodDemo {

	static int a =20;
	int b = 40;
	
	static void m1() {                                             // Static Method
		
		System.out.println("This is m1 static method");
	}
	
	void m2() {                                                   // Non Static Method 
		 
		System.out.println("This is m2 non-static method");
	}
	
	void m3() {                            // Non static method can access everything directly .
		
		System.out.println(a);             // Access static variable directly .
		System.out.println(b);
		
		m1();                              // Access static method directly              
		m2();
		
	}
	public static void main(String[] args) {
		
		System.out.println(a);    // We can achieve static variable directly .
		StaticMethodDemo.m1();    // We can achieve static method stuff without creation of Object .
		
		StaticMethodDemo demo = new StaticMethodDemo();   // We can achieve non static method stuff by creating an Object .
		System.out.println(demo.b);   // We can achieve non static variable by creating an Object .
		demo.m2();
		
		demo.m3();
		
	}
}
