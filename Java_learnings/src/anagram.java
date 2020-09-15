

public class anagram {
    public static void main(String[] args) {

    	String s = "a" + "bc";
        String t = "ab" + "c";
        System.out.println( s == t);
    	
    	StringBuilder s2 = new StringBuilder("Geeks for geeks"); 
        String s5 =  s2.toString();
        System.out.println(s2.toString() == s5);  

        String input1 = "two Eleven plus one";
        String input2 = "Twelve plus one";

        char[] c1 = input1.toCharArray();
        char[] c2 = input2.toCharArray();
        
        if(c1.length==c2.length){
            for (char c : c1) {
                for (int i = 0; i < c2.length; i++) {
                    if(Character.toString(c).equalsIgnoreCase(Character.toString(c2[i])))
                    {
                        input2 = input2.replace(c2[i], ' ').trim().toString();
                        break;
                    }
                }
            } 
        }
        else {
        	System.out.println("given string is not anagram");
        }
        System.out.println("Print string 2 : "+input2);
    }
}
