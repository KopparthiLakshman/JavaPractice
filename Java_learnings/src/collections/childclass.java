package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class childclass {
	
	public static void main(String[] args) {
		
		List<Student> list1 = new ArrayList<Student>();
		List<String> list2 = new ArrayList<>();
		List<String> list3 = new ArrayList<>();
		
		list1.add(new Student(1, "A", "Commerce", 350));
		list1.add(new Student(3, "C", "Commerce", 350));
		list1.add(new Student(2, "B", "Physics", 450));
		list1.add(new Student(4, "D", "Physics", 400));
		
		Map<String, List<String>> map = new HashMap<>();
		
		for (Student l1 : list1) {
			if (l1.getDept().equals("Commerce")) {
				System.out.println(l1);
				list2.add(l1.getName());
				map.put(l1.getDept(), list2);
			}
			
			else if (l1.getDept().equals("Physics")) {
				System.out.println(l1);
				list3.add(l1.getName());
				map.put(l1.getDept(), list3);
			}
		}
		System.out.println(map);
		
	}
}