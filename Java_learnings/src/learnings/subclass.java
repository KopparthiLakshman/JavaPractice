package learnings;

public class subclass extends Super_Constructor{

	subclass(String str) {
		super(str);
	}
	
	public static void main(String[] args) {
	
		subclass obj = new subclass("lakshman");
		
		/***passing value through method*/
		obj.meth("passing value thorugh methos");
	}
}

