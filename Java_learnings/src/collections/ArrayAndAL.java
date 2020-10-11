package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayAndAL {

	
	public static void main(String[] args) {
		
		/**While creating an Array we have to de
		 * fine size for the variable*/
		String[] str = new String[10];
		
		/**Here no need to define size for array List - it will use dynamic array for creation*/
		ArrayList<String> listOfString = new ArrayList<String>();
		
//		Collection of heterogeniuos elements
		List list = new ArrayList<String>();
		list.add(1);
		list.add("String");
		list.add(0.0F);
		list.add('c');
	}
}
