package javaLearning;


// HierarchyInheritance -> One Parent and Multiple Children


class X {
	
	void display(String name) {
		
		System.out.println(name);
	}
}

class Y extends X {
	
	void show(int x) {
		
		System.out.println(x);
	}
}

class Z extends X {
	
	void seen(int p) {
		
		System.out.println(p);
	}
}

public class HierarchyInheritance {

	public static void main(String[] args) {
		
		// Creating Parent object , It will access only parent property.
		
		X x = new X();
		x.display("Merriam");
	
		
		
		// Creating child object , It will access parent property.
		
		Y y = new Y();
		
		y.show(45);
		y.display("Will");
		
		
		// Creating another child object , It will access parent property.
	
		Z z = new Z();
		
		z.display("William");
		z.seen(11);

	}

}
