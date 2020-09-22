package staticPackage;
public class A{  
	int a=40;//non static  

	static{
		System.out.println("static block is printing.."); }  

	{
		System.out.println("Instance block is printing..");
	}  

	static int i = 10;
	int j = 20;

	public static void main(String args[]){  
		
		i = 200;
		A a = new A();
		a.j = 500;
		System.out.println("Value of i :: " + a.i +" :: Value of j ::"+a.j);
		A a2 = new A();
		System.out.println("Value of i :: " + a2.i +" :: Value of j ::"+a2.j);
		System.out.println("cheking...");
		System.out.println(new A().a);
		innerClass in = new innerClass();
		in.thisMethod();
	} 

	public static class innerCls{ 	}

	public static class innerCls2{	}
}  

class innerClass{

	void Display() {
		System.out.println("Inside display method...");
	}

	void thisMethod() {
		this.Display();
	}
}