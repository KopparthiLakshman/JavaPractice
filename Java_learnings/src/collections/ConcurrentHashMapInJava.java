package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapInJava {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
//		Map<Integer, String> map = new Hashtable();
		map.put(1, "one");
		map.put(4, "Four");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(0, "Zero");
		
		Set<Integer> kset = map.keySet();
		
		for (Integer fset : kset) {
//			System.out.println(map.get(fset));
		}
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
//			System.out.println(entry.getKey());
		}
//		System.out.println(entrySet);
		

		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();		
		
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> ite = iterator.next();
			System.out.println(ite.getValue());
			map.put(6, "Interrup");
			
		}
		
	}
}
