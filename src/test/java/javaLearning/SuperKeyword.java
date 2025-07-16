package javaLearning;

class Boy{
	
	int age=23;
	
	void m(int roll) {
		
		System.out.println(roll);
	}
}

class Girl extends Boy{
	
	int age =24;
	
      void m(int roll) {
		
     	System.out.println(roll);     // It will call only child's method.
		
		super.m(11);              // It will call Invoke immediate parent class's method .
	}


	void displayAge() {
		
		System.out.println(age);               // It will call only child and get only child's value.
		
		System.out.println(super.age);          // It will call Invoke immediate parent class and get parent's value.
	}
}


public class SuperKeyword {

	public static void main(String[] args) {
		
		Girl demo = new Girl(); 
		demo.displayAge();
		demo.m(20);
 
	}

}
