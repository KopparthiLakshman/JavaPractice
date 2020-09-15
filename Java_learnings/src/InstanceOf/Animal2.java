package InstanceOf;
class Animal2 { 
	
}  
class Dog5 extends Animal2 {
	
	static void method(Animal2 a) {
		
		Dog5 d=(Dog5)a;//downcasting  
		System.out.println("ok downcasting performed");  
	}  
	
	public static void main (String [] args) {  
		Animal2 a=new Dog5();  
		Dog5.method(a);  
	}  
}  