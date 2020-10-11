package inheritance;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		ParentClass.pm1();
		
		int a = 2;
		int b = 3;
		
		a = a+b; //5
		b = a-b;   
		a = a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
}
