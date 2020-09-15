package learnings;



class HowToUseThis3{
	
	public static void main(String args[]){
		
		HowToUseThis3 obj=new HowToUseThis3();  
		System.out.println(obj);//prints the reference ID  
		obj.test();  
	
	}
	
	void test(){  
		System.out.println(this);//prints same reference ID  
	}  	
	
	
}
