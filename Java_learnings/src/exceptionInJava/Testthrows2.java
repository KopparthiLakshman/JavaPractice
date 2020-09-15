package exceptionInJava;

import java.io.FileNotFoundException;

class M{  

	void method() throws FileNotFoundException/*UserNotFoundExceptio*/{  
//			throw new IOException(" device error ");
		//		System.out.println(new IOException("device error"));
	}  
}  


/**1. If the superclass method declares an exception, 
 * subclass overridden method can declare same, 
 * subclass exception or no exception but cannot declare parent exception.
 * 2. If the superclass method does not declare an exception, 
 * subclass overridden method cannot declare the checked exception
 *  but can declare unchecked exception*******/

public class Testthrows2{  

	public static void main(String args[]){  
		
		try{  
			M m=new M();  
			m.method();  
		}
		catch(Exception e){

			/**If you want to re-through the exception we have to do it in catch 
			 * block */
//			try {
//				throw new IOException("device error");
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}

			System.out.println("exception handled  :::: "+e);
			}     

		System.out.println("normal flow...");  
	}  
}