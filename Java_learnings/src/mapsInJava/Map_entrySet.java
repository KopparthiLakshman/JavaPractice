package mapsInJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_entrySet {  
public static void main(String[] args) {  
    Map<Integer, String> map=new HashMap<Integer, String>();  
    //Adding elements to map  
    map.put(1,"Amit");  
    map.put(5,"Rahul");  
    map.put(2,"Jai");  
    map.put(6,"Amit");  
    
    
    map.put(0,"Amit");
    map.put(0,"Amit");
    map.put(0,"Amit");
    map.put(0,"lakshman");
    map.put(0,"");
    
    map.put(null, null);
    
    for (Map.Entry<Integer, String> string : map.entrySet()) {
    	System.out.println(string.getValue()+ " = " + string.getKey());
	}
    
    System.out.println("map :: "+map);
//    List<String> str = new ArrayList<>();
//    for (String string : str) {
//		
//	}
    
//    try {
		
    	Hashtable<String, String> ht = new Hashtable<String, String>();
    	ht.put(null, "nullvalue");
    	System.out.println("Hast table :: " + ht);
    	
//	} catch (Exception e) {}
    
        
    TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
    tMap.put(0, "Tom");
    tMap.put(1, "insertion");
    tMap.put(0, "Jesrry");
    tMap.put(0, null);
    tMap.put(0, null);
    
    System.out.println(tMap);
    
    /**Traversing Map  
     * Converting to Set so that we can traverse
     * keySet() - It is used to return the Set view containing all the keys.*/
    Set<Entry<Integer, String>> set = map.entrySet();
    Set kSet = map.keySet();
//  System.out.println(set);

    /**Print only the keys in map*/
//    System.out.println(kSet); 
    
    
    Iterator<Entry<Integer, String>> itr = set.iterator();  
    while(itr.hasNext()){  
        //Converting to Map.Entry so that we can get key and value separately  
        Map.Entry entry=(Map.Entry)itr.next();  
        
//        System.out.println(entry.getKey()+" "+entry.getValue());  
        
        
        HashSet<String> ss = new HashSet<String>();
        
    }  
}  
}  