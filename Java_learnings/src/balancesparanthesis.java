import java.util.Arrays;
import java.util.Stack;

public class balancesparanthesis {

	public static void main(String[] args) {

		String input = "    ";
		Stack<Character> ch = new Stack<Character>();
		char last=' ', current=' ';
		
		if(input.length()%2!=0 || input.isBlank())
		{
			System.out.println("Give String is not balance since length is odd/ contains blank spaces");
		}
		else
		{
			for(int i=0; i<input.length();i++) 
			{
				current = input.charAt(i);
				if(current=='(' || current=='{' || current=='[')
				{	
					ch.push(current);
				}
				if(current==']' || current=='}' || current==')')
				{
					if(ch.isEmpty()) {
						System.out.println("String is not balance");
						break;
					}
					last = ch.peek();
					if(current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
						ch.pop();
					else
					{
						System.out.println("not balanced 3");
						break;
						}
				}
			}
			System.out.print(ch.isEmpty() ? "String is balanced" : "Not balanced");
		}
	}
}