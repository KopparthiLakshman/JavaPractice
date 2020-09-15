package learnings;

public class DowncastingInJava extends Ant {

	public static void main (String [] args) {  
		Ant  a=new DowncastingInJava();  
		DowncastingInJava.method(a);  
	}  

	  static void method(Ant a) {  
		  DowncastingInJava d=(DowncastingInJava)a;  //downcasting  
	       System.out.println("ok downcasting performed");  
	  }  
}

class Ant { 
	
}  
