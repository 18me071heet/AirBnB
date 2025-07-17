package javaLearning;

public class ParaConstructorDemo {
	
	
	String name;
	int age;
	
	ParaConstructorDemo(String n , int a){
		
		name=n;
		age=a;
	}

	void displayData() {
		
		System.out.println("Name : "+ name +", Age : "+ age);
		
	}
	
	
	public static void main(String[] args) {
		
		
		ParaConstructorDemo demo1 = new ParaConstructorDemo("John",25);
		
		ParaConstructorDemo demo2 = new ParaConstructorDemo("Will", 24);
		
		
		demo1.displayData();
		demo2.displayData();

	}

}
