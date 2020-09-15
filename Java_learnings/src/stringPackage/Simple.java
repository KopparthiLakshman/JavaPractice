package stringPackage;

import java.util.StringTokenizer;

public class Simple{  

	public static void main(String args[]){  
		
		String str = "Java is written in Program";
		String[] split = str.split(" ");
//		String temp = null;
//		temp = split[split.length-1].toString();
//		split[split.length-1]= split[0].toString();
//		split[0] = temp.toString();
//		StringBuffer sbb = new StringBuffer();
//		for (String string : split) {
//			sbb.append(string).append(" ");
//		}
//		System.out.println(" Reverese of a string ::  "+ sbb.toString().trim());
		
		StringBuffer sb = new StringBuffer();
		sb.append(split[split.length-1]).append(" ");
		if(split.length>1) {
			for (int i = 1; i < split.length-1; i++) {
				sb.append(split[i]).append(" ");
			}
			sb.append(split[0]);
			System.out.println(sb.toString());
		}  
		
		else 
			System.out.println(str);
	}

		public static void mainMethod(){  
			StringTokenizer st = new StringTokenizer("my name is khan"," ");  
			while (st.hasMoreTokens()) {  
				System.out.println(st.nextToken());  
			}
		}
	}  