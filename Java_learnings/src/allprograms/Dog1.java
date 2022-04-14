package allprograms;
class Animal{
	
	void print()
	{
		System.out.println("Printing from Animal Class");
	}

	void print(Animal a) {
		System.out.println("Printing from Animal Class animal a");
	}
}

class Dog1 extends Animal{//Dog inherits Animal  
    
	
	@Override
	void print(Animal a){
        if (a instanceof Animal) {
            System.out.println("Inside Dog class print method");
        }
        else {
        	System.out.println("Provided wrong instance");
        }
    }
    
    public static void main(String args[]){  
    
        Animal a =  new Dog1();
//    	Animal a =  new Animal();
        a.print(a);
//        Dog1.print(a);
        Integer aa = 10;
        
        System.out.println(aa instanceof Integer);
        
        
    }  

}