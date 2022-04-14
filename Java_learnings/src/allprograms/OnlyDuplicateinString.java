package allprograms;
public class OnlyDuplicateinString {
        public static void main(String[] args) {
            String str = "po556666aedgghhaaa1111a";
            char[] charry = str.toCharArray();
            char temp = 0;
            int count =0;
//            StringBuffer seriesOfUnique = new StringBuffer();
            StringBuffer allConsecutiveRepeate = new StringBuffer();
            for (int i = 0; i < charry.length; i++) {
                count=1;
                temp = charry[i];
                for (int j = 0; j < charry.length; j++) {
                    if(charry[i]==charry[j]){
                        count++;
//                        i++;
                    }
                }
//                if(count==1)
//                    seriesOfUnique.append(charry[i]);
                if(count>2)
                    allConsecutiveRepeate.append(charry[i]);
            }
//            System.out.println(seriesOfUnique);
            System.out.println(allConsecutiveRepeate);
        }
//    }
}
