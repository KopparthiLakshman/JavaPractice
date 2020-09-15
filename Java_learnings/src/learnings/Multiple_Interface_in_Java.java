package learnings;

public class Multiple_Interface_in_Java implements Printable,Showable{

		public void print(){

			System.out.println("Hello print()");
		}  
		public void show(){

			System.out.println("Welcome show()");
		}  

		public static void main(String[] args) {
			Multiple_Interface_in_Java obj = new Multiple_Interface_in_Java();
			obj.print();
			obj.show();
		}


}

interface Printable{  

	void print();  
}  

interface Showable extends Printable{  

	void show();  
	void print(); 
	
	/**In Java 8 there is a default and static method introduced in Interface*/
	default int run() {
		return 0;
	}
	
	static void execute() {
		System.out.println("We can have a static method in interface ");
	}
	

}  


