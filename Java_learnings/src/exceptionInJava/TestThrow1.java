package exceptionInJava;

public class TestThrow1{  
	static void validate(int age){  
	
		if(age<18)
			try {
//				throw new UserNotFoundExceptio("not valid");
				throw new ArithmeticException("My definition of throw");
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		else  
			System.out.println("welcome to vote");  
		
		System.out.println("After handling the exception ");
	}  
	
	public static void main(String args[]){  
	
		validate(2);  
		System.out.println("rest of the code...");  
	
	}  
}  