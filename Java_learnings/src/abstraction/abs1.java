package abstraction;

public abstract class abs1 implements interabs1{

	public static final void abs1Method() {

	}

	public abstract void  abs1Method2();

}

abstract class absInner extends abs1{
	
	@Override
	public void abs1Method2() {

	}
	
	
}

interface interabs1 {
	void methodab1();
	void methodab2();
	void methodab3();
}


interface interabs2 extends interabs1{
	void methodab1();
	void methodab2();
	void methodab3();
}