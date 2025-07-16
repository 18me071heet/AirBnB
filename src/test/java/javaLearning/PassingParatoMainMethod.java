package javaLearning;

public class PassingParatoMainMethod {

	public static void main(String[] args) {
		
		System.out.println(args.length);

		// Go to Run configuration > Go to arguments -> Add parameter
		
		for(String value:args) {
			System.out.println(value);
		}
	}

}
