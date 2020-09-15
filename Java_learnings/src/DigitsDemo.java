import java.util.regex.Pattern;

public class DigitsDemo
{
    public static void main ( String[] args )
    {

        java.text.NumberFormat nf = new java.text.DecimalFormat("0000");

//        for(int i=1; i<=9999; i++)
//            System.out.println(nf.format(i));
        String str = "aaa ihtss a qwerty trewq";
        String[] out  = str.split(" ");
        for (String string : out) {
//            System.out.println(string);
//            System.out.println(string.equals("aaa"));
        }

        String result = new String("aaa developed asdfg software").replaceAll(" ", "-");
        System.out.println(result);
        str.equals(" ");
        int n = 3;
        do
        {
        	System.out.println(n);
        	n--;
        }while(n>=0);
        
        String numstr = "srg9 4h90asd6dfh0jdsdjryjs rnss gw0 aaaa6s5asd2";
        char[] carr = numstr.toCharArray();
        StringBuffer sb = new StringBuffer();
        
        for (char c : carr) {
            if(Pattern.matches("\\d", Character.toString(c)))
                sb.append(c).toString();
        }
        System.out.println(sb.toString());
    }
}