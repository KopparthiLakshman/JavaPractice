package allprograms;

public class Classes {
	protected Classes() {
	}
	void firstMethod(Classes obj){  
		System.out.println("method is invoked");  
	}
	
	
	void p(){  
		firstMethod(this);  
	} 
	
	
	public static void main(String args[]){  
	
		Classes s1 = new Classes();  
		s1.p();
		s1.firstMethod(s1);  
	
	}  
} 

class cls2{
	Classes cl = new Classes();
}
