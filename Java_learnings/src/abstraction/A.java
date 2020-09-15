package abstraction;

public class A {
	public static void main(String[] args) {
		C c = new D();
		D d = new D();
//		c.m();
		d.m();
	}
	
	void inner() {
		String sts = "inner";
	}
}

interface AA {

	/**Java 8 we can implement method inside interface using default keyword*/
	default void m() { 
		System.out.println("hello from A"); 
	}
}

interface B extends AA {

//	default void matter() { 
//		System.out.println("hello from B"); 
//	}
		@Override
		default void m() {
			AA.super.m();
		}
		
		void method2();
}

interface C extends AA {
	abstract void coco();
	public abstract void mamacoco();
	/*private*/ abstract void mamacocooo();
	/*protected*/ void delago();
}

class Data implements B {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

}

class D implements B, C {
	void newM() {

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void coco() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mamacoco() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mamacocooo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delago() {
		// TODO Auto-generated method stub
		
	}
}

