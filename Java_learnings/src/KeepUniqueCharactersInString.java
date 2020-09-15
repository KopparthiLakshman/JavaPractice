public class KeepUniqueCharactersInString {

    public static void main(String[] args) {
    	
//    	input = sssssffffaaaa3435aa
//    	output1 = s5 ,f4 ,a6 ,32 ,41 ,51
//    	output2 = sfa345 **Which are the unique characters in the provided string 
      String str = "sssssffffaaaa3435aa";
//        char[] arr =  str.toCharArray();
        int count=0;
        StringBuffer sb = new StringBuffer(str);
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < sb.length();i++) {
             count=1;
            for (int j = i+1; j < sb.length(); j++) {
                if(sb.charAt(i) == sb.charAt(j)){
                	sb.deleteCharAt(j);
                	j--;
                    count++;
                }
            }
            if(count>=1 & sb.charAt(i) != ' ')
            {
            	sb1.append(sb.charAt(i)).append(count).append(" ,").toString().trim();
            	sb.deleteCharAt(i);
            	i--;
            }
        }
        System.out.println(sb1.deleteCharAt(sb1.length()-1));
    }
}