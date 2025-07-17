package javaLearning;

public class SwitchDemo {

	public static void main(String[] args) {
	
		int a=10,b=20;
		char action='*';
		
		switch(action) {
		
		case('+'):System.out.println("Sum of two numbers:"+(a+b));break;
		case('-'):System.out.println("Substitue of two numbers:"+ (a-b));break;
		case('*'):System.out.println("Multiplication of two numbers: "+ (a*b));break;
		case('/'):System.out.println("Divison of two numbers: "+ (a/b));break;
		default:System.out.println("No any actions are found");
			
	
		}
	}

}
