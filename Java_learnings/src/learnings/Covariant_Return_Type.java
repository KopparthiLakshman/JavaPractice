package learnings;

public class Covariant_Return_Type {
	Covariant_Return_Type getMehodInSuperClass()
	{
		return this;
	}  
}  

class B1 extends Covariant_Return_Type{  
	/**Eventhough Java doesnot allow overrding different return types
	 * JVM allow 
	 * @return */
	
	 B1 getMehodInSuperClass(){
	
		return this;
	}  
	
	int message(){
		
		System.out.println("welcome to covariant return type");
		return 0;
	}  

	
	public static void main(String args[]){  

		new B1().getMehodInSuperClass().message();

	}  
} 
