package javaLearning;

     
     class Bank{
     	
     	void m1(int m) {
     		
     		System.out.println(m);
     	}
     	
     	void m2(double n) {
     		
     		System.out.println(n);
     	}
     }
     
     class HDFC extends Bank{
     	
     	void m1(int m) {                     // Over riding -> We just change the body ( Implementation part ) but not the declaration.
     		
     		System.out.println(m+m);
     	}
     	
     	void m2(double m , double n) {     // Over loading -> We change the parameter and body .
     		
     		System.out.println(m*n);
     	}
     }
     
     public class OverLoadingvsOverRiding {
     
     	public static void main(String[] args) {
     		
     		HDFC demo = new HDFC();
     		
     		demo.m1(35);   // It will take m1 method from HDFC class .
     		
     		demo.m2(14.50);  // It will take m2 method from Bank class
     		
     		demo.m2(20.5, 34.5);  // It will take m2 method from HDFC class
     		
     		
     	}
     
}
