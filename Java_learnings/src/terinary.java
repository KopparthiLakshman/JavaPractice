import java.io.FileNotFoundException;

public final class terinary {

	public final static void main(String[] args) throws FileNotFoundException {
//		int[] arr = new int[5];
//		Arrays.sort(arr);
//
//		int N = scanner.nextInt();
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//		String out =  N%2==1 ? "Weird" : (N%2==0) && (N>2 && N<5) ? "Not Weird" : (N%2==0) && (N>6 && N<=20) ? "Weird" : "Not Weird" ; 
//		scanner.close();
//		System.out.println(out);

		int num = 9;
		System.out.println(num%2);
		System.out.println(String.valueOf("123"));
		
		
		int fnum = 12345;
		int temp=0;
		int rnum = 0;
		
		while(fnum!=0) {
			
			temp = fnum%10;
			rnum = rnum*10+temp;
			fnum = fnum/10;
		}
		
		System.out.println(rnum);
		
	}
}
