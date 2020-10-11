package enumInJava;

public class Beer {

	public static void main(String[] args) {
		Whisky kf = Whisky.KF;
		System.out.println(kf);
	}
	
}


class Whisky{ 
	
	public static final Whisky KF = new Whisky();
	public static final Whisky RC = new Whisky();
	
	
}