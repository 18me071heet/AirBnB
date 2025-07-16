package javaLearning;

public class ThisKeywor {

	// Passing Current Object as an Argument
	
	String name ="John";
	int age = 30;
	
	void show(String str){
		
		System.out.println("Name: "+ str);
	}
	
	void show(int a){
		
		System.out.println("Age: "+ a);
	}
	
	void show(ThisKeywor obj) {
		
		System.out.println("Name: "+ obj.name + "Age: "+ obj.age);
		
	}
	
	void call() {
		
		show(name);
		show(age);
		show(this);
	}
	
	public static void main(String[] args) {
	
		ThisKeywor demo = new ThisKeywor();
		demo.call();
		

	}

}
