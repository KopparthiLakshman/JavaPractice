import java.util.Arrays;

public class swapprogram {
	public static void main(String[] args) {
//not completed
		int a = 10, b=20;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a +" , "+b);
		String str = "Learn Java Code";
		char[] cs = str.toCharArray();

		StringBuffer sbinp = new StringBuffer(str);
		StringBuffer sbout = new StringBuffer();
		
		String str1[] = str.split(" ");
		System.out.println(Arrays.toString(str1));

		for (int i=str1.length-1; i>=0; i--) {
			sbout.append(str1[i]).append(" ").toString(); 
		}
		System.out.println(sbout);
		
		for (int i=str1.length-1; i>=0; i--) {
			
		}
		
/*		for (int i=0; i< cs.length; i++) {
			car = str.charAt(i);
			if(car.isUpperCase(str.charAt(i))) {
				for (int j=i+1; j< cs.length; j++) {
					if(car.isUpperCase(str.charAt(i))) {
						System.out.println(str.substring(temp,j-1));
						break;
					}
					else
						System.out.println(str.substring(temp,j-1));
				}
					if(i>1)
					temp=i;
			}
		}
*/	}
}
