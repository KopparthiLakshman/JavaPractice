package learnings;

class Animal{  
	
	/**We cannot override a private method in java */
	/*private*/ void eat(){
		System.out.println("eating...");
	}  
}  

class Dog extends Animal{  
	void bark()	{
		System.out.println("barking...");
	}    
	@Override
//	String eat() {
	void eat() {
		System.out.println("overrinding eat in Animal in DOG Class");
//		return "returnValue";
	}
}
class BabyDog extends Dog{  
	void weep(){
		System.out.println("weeping...");
	}  
	//	@Override
	//	void eat() {
	//		System.out.println("overrinding eat in Animal BabyDog Class");
	//		
	//	}
}  

class TestInheritance2{  

	public static void main(String args[]){  

		BabyDog d=new BabyDog();
		Dog e=new Dog();
		Animal f=new Animal();
		Animal g=new BabyDog();
		Animal h=new Dog();
		
		BabyDog d1=(BabyDog) new Animal();
		
		//		Dog i = new BabyDog();
		//		Dog j=new Animal();      // Downcasting is not possible in java 

		d1.weep();  
		d1.bark();  
		d1.eat();  
		System.out.println("Object for DOG");
		e.bark();
		e.eat();
		System.out.println("object for animal");
		f.eat();
		System.out.println("Creating object for animal of type BabayDog");
		g.eat();
		System.out.println("Creating animal object of type DOG");
		h.eat();



	}
}  