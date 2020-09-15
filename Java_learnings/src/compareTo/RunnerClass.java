package compareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerClass {

	/*Enumeration in java - Enum defined in EnumInJava*/
//	private static SERVER_URL svanyc563;
	private static String svanyc563_url;
	

	public static void main(String[] args) {
		
//		svanyc563_url = EnumInJavaInnerClass.SERVER_URL.SVANYC563.getURL;
//		System.out.println(svanyc563);
		
		List<Laptop> list = new ArrayList<>();
		list.add(new Laptop("Apple", 8, 10000));
		list.add(new Laptop("Dell", 2, 200));
		list.add(new Laptop("Asus", 4, 500));
		
		Collections.sort(list);

		for (Laptop lap : list) {
			System.out.println(lap);
		}
		
		
//	Comparable<Laptop> comp = new Comparable<Laptop>() {
//		
//		@Override
//		public int compareTo(Laptop o) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//	};
		
	}
}
