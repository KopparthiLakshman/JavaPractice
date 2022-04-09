// Java program to demonstrate working of shuffle()
// with user provided source of randomness.
import java.util.*;

public class GFG {
	public static void main(String[] args)
	{
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		mylist.add(4);
		mylist.add(5);
		mylist.add(6);
		mylist.add(7);
		mylist.add(8);
		mylist.add(9);
		mylist.add(10);
		mylist.add(11);
		mylist.add(12);
		mylist.add(13);
		mylist.add(14);
		
		
		TreeSet<Integer> sett = new TreeSet<Integer>();
		for(int j=0; j<10000 ; j++) {
			sett.add((int)(Math.random()*(5.9999)));
		}

		for(int i=0; i<mylist.size() ; i++) {
			mylist.set(i,mylist.set((int)((Math.random()*(5.9999))),mylist.get(i)));
		}
		
		Collections.shuffle(mylist, new Random());
		
		System.out.println(sett);
		
	}
}
