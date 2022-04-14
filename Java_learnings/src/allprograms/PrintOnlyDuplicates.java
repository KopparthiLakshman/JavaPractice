package allprograms;
public class PrintOnlyDuplicates {

    public static void main(String[] args) {
        
        String str = "po556666aedgghhaaa1111a";
        char[] charry = str.toCharArray();
        char temp;
        int count =0;
        StringBuffer seriesOfUnique = new StringBuffer();
        StringBuffer allConsecutiveRepeate = new StringBuffer();
        for (int i = 0; i < charry.length; i++) {
            count=1;
            temp = charry[i];
            for (int j = i+1; j < charry.length; j++) {
                if(charry[i]==charry[j]){
                    count++;
                    i++;
                }
                else{
                    break;
                }
            }
            if(count==1)
                seriesOfUnique.append(charry[i]).append("-").append(count).append(",");
            if(count>1)
                allConsecutiveRepeate.append(charry[i]).append("-").append(count).append(",");
        }
        System.out.println(seriesOfUnique.substring(0,seriesOfUnique.length()-1));
        System.out.println(allConsecutiveRepeate.substring(0,seriesOfUnique.length()-1));
    }
}