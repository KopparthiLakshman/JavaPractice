// we cannot create an object when the constructor is private
/*
 * public
 * private
 * protected
 * default
 *
 */

/*
 * Super() / this() 
 * 					- We can use only inside the constructor
 * 					- We can use only @ the first line of the constructor 
 *					- ** we cannot use both at the same time
 *					- *** We cannot use inside in java	
 */
package constructor;

public class MainClass /* extends constructorClass */{

	
//	MainClass(int a) {
//		super(a);
//	}

	public static void main(String[] args) {

//		constructorClass cl1 = new constructorClass();
//		cl1.constructorClass();
	}
}


class constructorClass{

// Comment and see the argument constructor and overding is not possible in constructor 	
//	constructorClass() {
//		this(10);
//		System.out.println("no Arg constructor");
//	}

	constructorClass(int a) {
		System.out.println("int Arg constructor");
	}
	
	void constructorClass() {
		System.out.println("JVM considered this as Method since there is a rturn type");
	}


}