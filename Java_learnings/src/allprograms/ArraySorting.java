package allprograms;



import java.util.Arrays;

public class ArraySorting {
	
//	public static void main(String[] args) {
//		String[] inp = {"bcd","has","gfee","a","ad"};
//		sort(inp);
//		System.out.println(Arrays.toString(inp));
//	}
	public static void main(String[] args) {
	
//		String[] inputArray1 = {"2", "3", "4", "7", "1"};
//		sort(inputArray1);
//		System.out.println(Arrays.asList(inputArray1));
		
		Integer[] inputArray2 = {8, 2, 4, 9, 3, 7, 5, 1, 7, 0};
		sort1(inputArray2);
	}
	
	private static void sort1(Integer[] inputArray2) {
		
		int temp = 0;
		for (int i = 0; i < inputArray2.length-1; i++) {
			if(inputArray2[i]>inputArray2[i+1])
			{
				temp = inputArray2[i];
				inputArray2[i] = inputArray2[i+1];
				inputArray2[i+1]= temp;
				i = -1;
				System.out.println("Lakshman");
			}
		}
		
		System.out.println(Arrays.asList(inputArray2));
	}
	
	

	public static String[] sort(String[] inp) {
		String t;
		for(int i=0; i<inp.length; i++) {
			for(int j=1; j<inp.length; j++) {
				if(inp[j-1].compareTo(inp[j])>0)
				{
					t=inp[j-1];
					inp[j-1]=inp[j];
					inp[j]=t;
				}
			}
		}
		return inp;
	}
}