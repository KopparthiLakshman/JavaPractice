import java.util.HashMap;

public class duplicatesUsingHashmap {

	public static void main(String[] args) {

		String str = "aaaabbbcccddffaa";
		HashMap<Character, Integer> map = new HashMap<>();
		char[] carr = str.toCharArray();

		for (char c : carr) {
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else                	
				map.put(c,1);
		}

		System.out.println(map);
//		{a=6, b=3, c=3, d=2, f=2}
		//{a=6, b=3, c=3, d=2, f=2}
		//{a=6, b=3, c=3, d=2, f=2}


		//            Iterator<Character> iterator = map.keySet().iterator();
		//            Set<Character> setChar = map.keySet();
		//            for (Character character : setChar) {
		//                if (map.get(character)>1) {
		//                    System.out.println(character + "::"+map.get(character));
		//                }
		//            }
	}
}