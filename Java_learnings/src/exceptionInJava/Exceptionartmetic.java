package exceptionInJava;

public class Exceptionartmetic {
	public static void main(String[] args) {

		try {
			int a=10, b=0, c;
			c=a/b;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
//		catch(LogicalExceptio e) {
//			e.printStackTrace();
//		}
		
	}		
}

