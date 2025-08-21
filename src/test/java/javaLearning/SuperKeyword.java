package javaLearning;

     class Boy{
     	
     	int age=23;
     	
     	void m(int roll) {
     		
     		System.out.println(11);
     	}
     }
     
     class Girl extends Boy{
     	
     	int age =24;
     	
           void m(int roll) {                        // Over riding we only change implement 
     		
          	System.out.println(12);     // It will call only child's method.
     		
     		super.m(11);              // It will call Invoke immediate parent class's method .
     		
     		super.age=11;            // It will Invoke immediate parent class's variable.
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
