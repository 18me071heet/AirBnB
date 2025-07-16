package javaLearning;

public class OverLoadingDemo {
	
	int a=10;
	int b=20;
	
	void sum() {
		
		System.out.println(a+b);
	}
	
	// Method name same parameter different 
	
	void sum(int x,int y) {
		
		System.out.println(x+y);
	}
	
	
	// Method name same , parameter same , data type different
	void sum(int x ,double y) {
		
		System.out.println(x+y);
	}
	
	// Method name same , Parameter same , Data type same , Order of parameter different
	
	void sum(double x,int y) {
		
		System.out.println(x+y);
	}

	public static void main(String[] args) {

		OverLoadingDemo demo = new OverLoadingDemo();
		
		demo.sum();
		
		demo.sum(25, 35);
		
		demo.sum(5, 10.5);
		
		demo.sum(11.5, 20);
		
	}

}
