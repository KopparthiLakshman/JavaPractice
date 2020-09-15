package exceptionInJava;

// Error is a critical condition that cannot be handled by the code

public class CustomerExceptions{

	
	public static void main(String args[]) {  
//				try{  
//				}
//				finally {
//					System.out.println("....executing code inside finally block ...");
//				}
//
//		System.out.println("rest of the code...");  
		try{
			returnException();
		}
		finally {
				validate(2);
		}
//		catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getClass());
//			System.out.println("Before to if block");
//			}
//		}
		
		

	} 

	static void validate(int age) {  
		try {
			if(age<18)  
				throw new UserNotFoundExceptio("Using THROW Handing exception in CustomerException Class");
		} catch (UserNotFoundExceptio e) {
			System.out.println(e);
		}

		System.out.println("welcome to without exception::S");

		System.out.println("welcome to user defined exceptions");  
	}  

	public static int returnException() {
		int a=1, b=0;
		int infinite = a/b;
		return infinite;
	}

}