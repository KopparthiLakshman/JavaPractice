package allprograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftingPositions {

	public static void main(String[] args) {

		Integer inputarr[]= {2,8,1,8,546,3,9,-8};
		int num= 5;
//		Scanner sc = new Scanner(System.in);
//		num = sc.nextInt();
		calculate(inputarr, num);
	}

	private static void calculate(Integer[] inputarr, int num) {
		Integer output[] = new Integer[inputarr.length];
		List<Integer> list = new ArrayList<Integer>();
		int count=0;
		if(num < inputarr.length && num > 0) {
			int temp = num;
			for (int i = 0 ; i < inputarr.length-num; i++ ) {
					output[i] = inputarr[temp];
					temp++;
			}
			for (int j = inputarr.length-num ; j < inputarr.length; j++ ) {
				output[j] = inputarr[count];
				count++;
			}
			list = Arrays.asList(output);
			System.out.println(list);
		}
		else
		{
			System.out.println("No Change");
		}
	}

}
