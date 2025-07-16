package javaLearning;

public class StudentsMain {

	public static void main(String[] args) {
	 
		
		// Using object reference variable
		
	//	1: Students stud = new Students();
		
	/*	stud.id=01;
		stud.name="John";
		stud.grade='A';
		
		stud.displayData();
		*/
		
		
		// 2: Using Method
		
		//stud.setData(02,"Will",'B');
		//stud.displayData();
		

		// 3: Using Constructor
		
		Students stu = new Students(101,"Will",'B');
		stu.displayData();
		
		
	}

}
