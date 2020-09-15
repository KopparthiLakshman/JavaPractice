package staticPackage;
public class A{  
	int a=40;//non static  

	static{
		System.out.println("static block is printing..");
	}  

	{
		System.out.println("Instance block is printing..");
	}  

	public static void main(String args[]){  
		System.out.println("cheking...");
		System.out.println(new A().a);
		innerClass in = new innerClass();
		in.thisMethod();
	}  

}  


class innerClass{
	
	void Display() {
		System.out.println("Inside display method...");
	}

	void thisMethod() {
		this.Display();
	}

}