package synchronisation;


public class TestSynchronizedBlock1{  
	public static void main(String args[]){  
		
//		System.gc();
		Synch_Table obj = new Synch_Table();//only one object  
//		My_Thread1 t1=new My_Thread1(obj);  
//		My_Thread2 t2=new My_Thread2(obj);  
	
		Thread t1 = new Thread() {
			
			public void run() {
				obj.printTable(10);
				
			}
		};
		
		Thread t2 = new Thread() {
			
			public void run() {
				obj.printTable(100);
				
			}
		};
		
		t1.start();  
		t2.start();  
	}  
}

class Synch_Table{  

	void printTable(int n){  
//		synchronized(this){//synchronized block  
			for(int i=1;i<=5;i++){  
				System.out.println(n*i);  
				try{  
					Thread.sleep(400);  
				}catch(Exception e){System.out.println(e);}  
			}  
		}  
	}//end of the method  
//}  

//class My_Thread1 extends Thread{  
//	Synch_Table t;  
//	My_Thread1(Synch_Table t){  
//		this.t=t;  
//	}  
//	public void run(){  
//		t.printTable(5);  
//	}  
//
//}  
//class My_Thread2 extends Thread{  
//	Synch_Table t;  
//	My_Thread2(Synch_Table t){  
//		this.t=t;  
//	}  
//	public void run(){  
//		t.printTable(100);  
//	}  
//}  