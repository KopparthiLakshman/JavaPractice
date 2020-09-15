package garbageCollection;

public class FinalizeExample{  

	public void finalize(){
		System.out.println("finalize called");
	}  

	
	/** garbage collection is a process in which a demon thread run by JVM 
	 * to collect object which are unable to reach
	 * Account act = new Account();
	 * actNew = new Account(); - now act is unreachable */
	public static void main(String[] args){  
		FinalizeExample f1=new FinalizeExample();  
		FinalizeExample f2=new FinalizeExample();  
		f1=null;  
		f2=null;  
		System.gc();  
//		Scanner sc = new Scanner(System.in);
	}
}  