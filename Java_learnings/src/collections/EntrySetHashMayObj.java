package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetHashMayObj {


	public static void main(String[] args) {
		
		Map<Integer, Employee> hashMap = new HashMap<Integer, Employee>();
		Employee emp1 = new Employee("Lakshman", 420170);
		Employee emp2 = new Employee("Rajesh", 420165);
		Employee emp3 = new Employee("Bramhi", 888888);
		Employee emp4 = new Employee("Raghavan", 425628);
		
		hashMap.put(emp1.getEmpID(), emp1);
		hashMap.put(emp2.getEmpID(), emp2);
		hashMap.put(emp3.getEmpID(), emp3);
		hashMap.put(emp4.getEmpID(), emp4);
		
		Set<Map.Entry<Integer, Employee>> entries = hashMap.entrySet();
		
		for (Map.Entry<Integer, Employee> entry : entries) {
			System.out.println(entry.getKey());
			Employee emp = entry.getValue();
			emp.display();
		}
	
		Iterator<Integer> iterator;
		iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			Employee emp = hashMap.get(iterator.next());
			emp.display();
		}
		
		
		
	}
	
}
