package compareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareOverrideClass {

	/*Enumeration in java - Enum defined in EnumInJava*/
//	private static SERVER_URL svanyc563;
//	private static String svanyc563_url;
	

	public static void main(String[] args) {
		
//		svanyc563_url = EnumInJavaInnerClass.SERVER_URL.SVANYC563.getURL;
//		System.out.println(svanyc563);
		
		List<Laptop> list = new ArrayList<>();
		list.add(new Laptop("Apple", 8, 400));
		list.add(new Laptop("Dell", 2, 200));
		list.add(new Laptop("Asus", 4, 10000));

		System.out.println("*** Printing the original list in preserved order ***");
		for (Laptop lap : list) {
			System.out.println(lap);
		}

		

		Comparator<Laptop> compareUsingBrand = new Comparator<Laptop>() {
			@Override
			public int compare(Laptop o1, Laptop o2) {
				return o1.getBrand().compareTo(o2.getBrand());
			}
		};

		Comparator<Laptop> compareUsingPrice = new Comparator<Laptop>() {
			@Override
			public int compare(Laptop o1, Laptop o2) {
				if(o1.getPrice() < o2.getPrice())
					return 1;
				else 
					return -1;
			}
		};

		ArrayList<Integer> ilist = new ArrayList<Integer>();
		
		list.sort(compareUsingBrand);
		Collections.sort(ilist);;

		System.out.println("*** Sorting of list using BRAND name ***");
		Collections.sort(list, compareUsingBrand);
		for (Laptop lap : list) {
			System.out.println(lap);
		}
		System.out.println("*** Sorting of list using PRICE name ***");
		Collections.sort(list, compareUsingPrice);
		for (Laptop lap : list) {
			System.out.println(lap);
		}
		
		
	}
}
