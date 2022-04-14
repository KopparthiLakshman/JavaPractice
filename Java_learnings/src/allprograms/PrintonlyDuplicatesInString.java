package allprograms;
public class PrintonlyDuplicatesInString {

    public static void main(String[] args) {
        
        String str = "123456lkaaabbbcdefggghhh111222kaaaaa";
        char[] charry = str.toCharArray();
        char temp=0;
        int count=0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < charry.length; i++) {
            count=0;
            temp = charry[i];
            for (int j = i+1; j < charry.length; j++) {
                if(charry[i]==charry[j]){
                    count++;
                    sb.append(temp);
                    if(count>1)
                        sb.append(charry[i]);
                    i++;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
