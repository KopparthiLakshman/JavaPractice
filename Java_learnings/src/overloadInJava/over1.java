package overloadInJava;

public class over1 {

	
	/**COnstructor overloading*/
	public over1() {
		System.out.println("Default in constrctor in java");
	}

	public over1(String addVar) {
		System.out.println("Parameterised constrctor in java");
	}

	
	/**Method overloading*/
	void baseMethod(String a, String b) {
		System.out.println("Method with two paramteres");
	}


	void baseMethod(String a) {
		System.out.println("Override method"); 
	}

}

