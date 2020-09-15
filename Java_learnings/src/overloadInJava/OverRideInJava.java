package overloadInJava;

class mainclass{

	protected void a(){
		System.out.println("print class A in parrent class");
	}
}

class overrideclass extends mainclass{
	
/** 1. overriding Method should have same signature as parent method 
 * 	we cannot override a private method
 *  2. if super class method does not declare any exception then
 *  subclass should not declare any exception/ 
 *  should not declare the *same* exception according to point.1*/
	
	@Override
	protected void a() {
		System.out.println("overriding class a in parrent class in child class");
	}
}

class OverRideInJava {
	
	public static void main(String[] args) {
		mainclass child = new overrideclass();
		mainclass parr = new mainclass();
		
		parr.a();
		child.a();
	}
}
