class Animal{
}

class Dog1 extends Animal{//Dog inherits Animal  
    
    static void print(Animal a){
        if (a instanceof Animal) {
            Dog1 d = (Dog1)a;
            System.out.println("inside Animal class print method");
        }
    }
    
    public static void main(String args[]){  
    
        Animal a=  new Dog1();  
        Dog1.print(a);
        Integer aa = 10;
        
        System.out.println(aa instanceof Integer);
        
        
    }  

}