package javaLearning;

public class NonstaticAccessStaticDemo {

	static int count = 15;
	
	static void zoo() {
		
		System.out.println("The name of Zoo is Madhuvan");
	}
	
	void animals() {
		
		zoo();
		System.out.println("Count of animals in the Zoo :"+count);
	}
	
	
	public static void main(String[] args) {
		
		NonstaticAccessStaticDemo demo = new NonstaticAccessStaticDemo();
		demo.animals();
	

	}

}
