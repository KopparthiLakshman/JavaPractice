import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class FronSpaces {

	private static final Scanner scan = new Scanner(System.in);
	static int number;
	public static void main(String[] args) {
		number=1000;
		scan.useDelimiter(System.lineSeparator());
    	int i =scan.nextInt();
        Double d = scan.nextDouble();
        String s = scan.next();
        int l_nl = s.length();
        System.out.println(s);
        System.out.println("Length of string : "+l_nl);
        
        List<String> list_String = new ArrayList<>();
        List<String> linked_list = new LinkedList<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        Map<String , Integer> tMap = new TreeMap<>();
        
        Vector<String> vec = new Vector<>();
//        vec.
	
	}
}
