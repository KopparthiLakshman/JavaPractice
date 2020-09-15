import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class remove_aabbaaaacccc {

	public static void main(String[] args) {
		String str1 = "qwaaaccvaallkkkdf";
		char[] arr = str1.toCharArray();
		Set<Character> set1 = new HashSet<>();
		Set<Character> Tset = new TreeSet<>();
		for (Character character : arr) {
			set1.add(character);
		}
		System.out.println(set1);
		Tset.addAll(set1);
		System.out.println(Tset);
	}

}
