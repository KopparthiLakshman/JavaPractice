package enumInJava;

import java.lang.reflect.Array;

public class Array1 {

	public static void methos() {
		EnumInJavaInnerClass svanyc563 = EnumInJavaInnerClass.SVANYC563;
		EnumInJavaInnerClass svanyc5631 = EnumInJavaInnerClass.SVANYC598;
		System.out.println(svanyc5631);
		
	}
	
	public static void main(String[] args) {

		//	Array can be declared with size zero in java
		
		System.out.println(args.length);
		
		int d[][] = new int[10][2];
		System.out.println(d.length);
		System.out.println(Array.getLength(d));
		methos();


//			Object[] data ;
//			data =	new Object[2147483647];

			
//			Object[] charsize =	new Object['4'];  // -> byte is allowed to give as size
//			Object[] intsize =	new Object[4];   //-> integer is allowed to give as size


	}

}
