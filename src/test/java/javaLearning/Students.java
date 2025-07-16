package javaLearning;

public class Students {

	int id;
	String name;
	char grade;
	
	
	void displayData() {
		
		System.out.println(id+" "+name+" "+grade);
	}
	
	
	
	void setData(int sid,String sname,char sgrade) {
		
		
		// Storing the data into class variable
		
		id=sid;
		name=sname;
		grade=sgrade;
		
	}
	
	
	Students(int sid,String sname,char sgrade){
		
		// Using constructor
		
		id=sid;
		name=sname;
		grade=sgrade;
	}
	
	
}
