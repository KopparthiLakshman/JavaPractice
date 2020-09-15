package learnings;

public class Clonnable_In_Java implements Cloneable{


	int rollno;  
	String name;  

	Clonnable_In_Java(int rollno,String name){  
		this.rollno=rollno;  
		this.name=name;  
	}  

	
//	@Override
//	public Object clone() throws CloneNotSupportedException{  
//		return super.clone();  
//	}  
	
//	public void finalize(){
//		System.out.println("finalize called");
//	} 

	public static void main(String args[]){
		

		try{  

			Clonnable_In_Java s1=new Clonnable_In_Java(101,"amit"); 
			Clonnable_In_Java s3 = (Clonnable_In_Java) s1.clone();
			Clonnable_In_Java s2=(Clonnable_In_Java)s1.clone();  

			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);  
			System.out.println(s3.rollno+" "+s3.name);
		
			
		}
		catch(CloneNotSupportedException c){
			
		}  

//		System.gc();  

		
	}  
} 
