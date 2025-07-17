package javaLearning;

public class ThisKeywordDemo3 {

	// Calling another method in the same class
	
	void print() {
		
		String name ="Laptop";
		System.out.println("Printing processs :" + name);
	}
	
	void scan() {
		
		this.print();    // Calling another method .
		this.graphics();  // Calling another method .
		
		String name = "Computer";
		System.out.println("Printing process :" + name);
		
	}
	
	void graphics() {
		
		String name ="3D";
		System.out.println("Graphics Avialable :" + name);
	}
	
	public static void main(String[] args) {
		
		ThisKeywordDemo3 demo = new ThisKeywordDemo3();
		demo.scan();
		demo.graphics();
	}

}
