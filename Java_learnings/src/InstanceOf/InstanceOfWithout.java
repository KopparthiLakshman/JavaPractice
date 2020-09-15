package InstanceOf;

public class InstanceOfWithout {
	public static void main (String [] args) {  
		Animal a= new Dog4();  
		Dog4.method(a);  
	}  
}  

class Animal {
	static void method(Animal a) {  
		System.out.println("Method in Animal class");  
	}
}  

class Dog4 extends Animal {  
	static void method(Animal a) {  
		Dog4 d=(Dog4)a;    //downcasting  
		System.out.println("ok downcasting performed");  
	}  
}