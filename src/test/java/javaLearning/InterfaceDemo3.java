package javaLearning;


                              // Multiple Inheritance can be achieve by using Interface 

interface Print {
	
	int x=100;
	void scan();
}

interface Draw {
	
	int y=200;
	void scatch();
}


class VFX {
	
	int z=300;
	
	void effect() {                               // Public Method 
		
		System.out.println("VFX Effect");
	}
}

class Animation extends VFX implements Print,Draw{
	
	public void scan() {
		
		System.out.println(x);
		System.out.println("Scanning");
	}
	
	public void scatch() {
		
	    System.out.println(y);
		System.out.println("Drawing");
		
	}
}

public class InterfaceDemo3 {

	public static void main(String[] args) {
	
		Print p = new Animation();
		p.scan();
		
		Draw d = new Animation();
	    d.scatch();
		
		VFX v = new Animation();
	    v.effect();
		
		Animation a = new Animation();   
		a.effect();                               // Call their parent ( VFX's method )
	    a.scan();
	    a.scatch();

	}

}
