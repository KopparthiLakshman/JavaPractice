
public class CountInString {


    public static void main(String[] args) {
        String str = "po556666aedgghhaaa1111a";
        char[] charry = str.toCharArray();
        char temp = 0;
        int count =0;
//        StringBuffer seriesOfUnique = new StringBuffer();
        StringBuffer allConsecutiveRepeate = new StringBuffer();
        int len =charry.length;
        for (int i = 0; i < len; i++) {
            count=1;
            for (int j = i+1; j < len; j++) {
                if(charry[i]==charry[j]){
                    count++;
//                    i++;
                    
                    len--;
                }
            }
//            if(count==1)
//                seriesOfUnique.append(charry[i]);
            if(count>1)
                allConsecutiveRepeate.append(charry[i]);
        }
//        System.out.println(seriesOfUnique);
        System.out.println(allConsecutiveRepeate);
    }
//}

	
	
}
