package collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HowToExecuteBatchFile {

	public static void main(String[] args) throws IOException {
	
//		Runtime.getRuntime().exec("E:\\Softwares\\Testing\\FileIUploadAutoit.exe");
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.shuffle(list); 
		Collections.sort(list);
		
		List<Item> list1 = new ArrayList<>() ;
		list1.add(new Item("lakshman", "abc"));
		list1.add(new Item("lakshman", "abc"));
		list1.add(new Item("lakshman", "abc"));

		Map<String,String> map = list1.stream().collect(
                Collectors.toMap(Item::getCollege, Item::getName));
		
		
//        Map<Integer, String> result1 = list.stream().collect(
//                Collectors.toMap(Hosting::getId, Hosting::getName));

	}
	
}
