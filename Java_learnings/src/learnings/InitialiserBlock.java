package learnings;

class B2 {
	int a = 10;
	B2(){
		System.out.println("constructor is invoked");
	}  

}
class InitialiserBlock extends B2 {  
	InitialiserBlock(){ 
		super();  
		System.out.println("child class constructor invoked");  
	}  
	
	int a = 20;
	
	void superparr(){
		System.out.println(super.a);
	}

	/**Initialiser block in java which will invoke by default before constructor */
	{
 		System.out.println("instance initializer block invoked");
	}  

	public static void main(String args[]){  
		InitialiserBlock b1=new InitialiserBlock();  
		b1.superparr();
	} 
}
