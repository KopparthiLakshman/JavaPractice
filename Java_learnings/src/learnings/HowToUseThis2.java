package learnings;

 class Test2 {
	Test2() {
		System.out.println("Hello java");
	}


	Test2(int x)
	{
		this();//should be in first position
		System.out.println("Hello java this");
	}
}

class HowToUseThis2{
	public static void main(String args[]){
		new Test2(2);
	}
}


