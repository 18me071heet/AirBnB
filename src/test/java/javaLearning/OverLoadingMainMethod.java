package javaLearning;

public class OverLoadingMainMethod {

	
	void main(int a) {
		
		System.out.println(a);
		
	}
	
	void main(String b) {
		
		System.out.println(b);
	}
	
	public static void main(String[] args) {
	 
		OverLoadingMainMethod demo = new OverLoadingMainMethod();
		demo.main(10);
		
		demo.main("John");

	}

}
