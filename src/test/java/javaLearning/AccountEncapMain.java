package javaLearning;

public class AccountEncapMain {

	public static void main(String[] args) {
	
		AccountEncapDemo demo = new AccountEncapDemo();
		
		//demo.setId(100);
		
		//demo.setAccId(100);
		//System.out.println(demo.getId());
		
		demo.setAccid(101);
		demo.setAmount(50000);
		demo.setName("John");
		
		System.out.println(demo.getAccid());
		System.out.println(demo.getName());
		System.out.println(demo.getAmount());
				
	
	}

}
