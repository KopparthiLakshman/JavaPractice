import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TextFinding {

	
	public static void main(String[] args) {
		ReadThefile();
	}

	private static void ReadThefile() {
		List<String> list = new ArrayList<String>();
		Map<String, Integer> mapResult = new TreeMap<String, Integer>();
		String pline= null;
		try {
			FileReader fis = new FileReader(new File("InputFile.txt"));
			BufferedReader br = new BufferedReader(fis);
			while (( pline = br.readLine() )!= null ) {
				String[] charArray = pline.toString().trim().split(" ");
				for(String str : charArray) {
					if(mapResult.containsKey(str)){
						mapResult.put(str, mapResult.get(str)+1);
					}
					else {
						mapResult.put(str, 1);

					}
				}
				list.addAll(Arrays.asList(charArray));
			}
			 br.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("InputFile :: File not Found "+ e.getMessage());
		} 
		catch (IOException e) {
			 e.getMessage();
		}
		System.out.println(list);
		System.out.println(mapResult);
	}

}
