package javaLearning;

public class ThisKeywordDemo {
	
	int x,y;   // Class / Instance Variable
	
	ThisKeywordDemo(int x,int y){
		
		this.x=x;    // Use this keyword when local and class variable name is same 
		this.y=y;
		
	}
	
	void display() {
		
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {   // If we declare inside the main method then it will be local variable
		
		ThisKeywordDemo demo = new ThisKeywordDemo(10,20);
		demo.display();
	}

}
