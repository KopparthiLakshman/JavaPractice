package learnings;

class Priniting_CMD_line_args {

	
	public static void main(String[] args) {
		
		
//		for (String string : args) {
			for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}

