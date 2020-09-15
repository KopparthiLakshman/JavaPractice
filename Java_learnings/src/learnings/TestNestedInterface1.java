package learnings;

class TestNestedInterface1 implements Show.Message{  
	public void msg(){System.out.println("Hello nested interface");}  

	public static void main(String args[]){  

		Show.Message message=new TestNestedInterface1();//upcasting here
		message.msg();

		
		TestNestedInterface1 test = new TestNestedInterface1();
		test.msg();
		
	}  
}  


interface Show{  
	
	void show();  
	
	interface Message{  
	
		void msg();  
	}
}
