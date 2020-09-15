package learnings;
class HowToUsetThis4 {
	public HowToUsetThis4() {
		this(786);	//should be in first position
		System.out.println("Hello java");
	}


	HowToUsetThis4(int x)
	{
		System.out.println("Hello java this"+x);
	}
}

class HowToThis4{
	public static void main(String args[]){
		new Test2();
	}
}