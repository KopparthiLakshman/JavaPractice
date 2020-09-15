package learnings;

class TestSuperJavaClass {

	String color="white";  
}  
class choclate extends TestSuperJavaClass{  
	public choclate() {
		System.out.println("::Printing inside choclate constructor ::");
	}
	String color="black";  
	
	void printColor(){  
		
		/**prints color of chocolate class*/
		System.out.println(color);  
	
		/**prints color of Animal class*/
		System.out.println(super.color);  
	
	}  
}  
class Super_In_Java extends choclate{  
	public static void main(String args[]){  
		choclate d=new choclate();  
		Super_In_Java sup = new Super_In_Java();
		d.printColor();  
	}
	public Super_In_Java() {
		super();
	}
}  
