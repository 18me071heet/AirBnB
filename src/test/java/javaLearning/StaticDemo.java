package javaLearning;


   class Shape {
	
	static void a1(int g) {
		
		System.out.println(g);
	}
	
   }

class Triangle extends Shape{
	
	static void a1(int g) {
		
		System.out.println(g+g);
	}
}
public class StaticDemo {

	public static void main(String[] args) {

		Triangle.a1(45);    // Call the child static method by Child class name.it's Method name
		
		Shape.a1(10);   // Call the parent static method by Parent class name.it's Method name .
		
	}

}
