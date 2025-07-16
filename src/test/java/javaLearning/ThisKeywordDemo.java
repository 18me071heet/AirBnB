package javaLearning;

public class ThisKeywordDemo {
	
	int x,y;   // Class / Instance Variable
	
	ThisKeywordDemo(int x,int y){
		
		this.x=x;
		this.y=y;
		
	}
	
	void display() {
		
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		ThisKeywordDemo demo = new ThisKeywordDemo(10,20);
		demo.display();
	}

}
