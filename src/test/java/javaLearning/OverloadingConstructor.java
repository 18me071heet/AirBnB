package javaLearning;

public class OverloadingConstructor {

	int a,b,c;
	
	OverloadingConstructor(){
		
		a=b=c=5;
		
	}
	
	OverloadingConstructor(int x,int y,int z){
		
		a=x;
		b=y;
		c=z;
		
	}
	
	
	double volume() {
		
		return a*b*c;
	}
	
	
	public static void main(String[] args) {
	
		//OverloadingConstructor demo = new OverloadingConstructor();
		
		OverloadingConstructor demo = new OverloadingConstructor(3,4,5);
		
	     System.out.println(demo.volume());
	     

	}

}
