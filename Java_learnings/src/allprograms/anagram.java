package allprograms;


public class anagram {
    public static void main(String[] args) {

        String input1 = " LISTnEN";
        String input2 = "SInLENT";

        char[] c1 = input1.trim().toCharArray();
        char[] c2 = input2.trim().toCharArray();
        
        if(c1.length==c2.length){
            for (char c : c1) {
                for (int i = 0; i < c2.length; i++) {
                    if(Character.toString(c).equals(Character.toString(c2[i])))
                    {
                        input2 = input2.replace(c2[i], ' ').trim().toString().trim();
                        break;
                    }
                }
            }
            if(input2.equals(""))
            	System.out.println("Given strings are anagrams");
            else {
            	System.out.println("given string is not anagram");
            }
        }
        else {
        	System.out.println("given string is not anagram");
        }
    }
}
