package abstraction;

public class class1 {

	void method1 () {
		System.out.println("methos in class1");
	}
	
	public static void main(String[] args) {
		subClasses cls = new subClasses();
		cls.method1();
		
		class1 cls2 = new subClasses();
		cls2.method1();
	}
}

class subClasses extends class1{
	@Override
	void method1() {
//		System.out.println("methos in subClasses");
		super.method1();
	}
}