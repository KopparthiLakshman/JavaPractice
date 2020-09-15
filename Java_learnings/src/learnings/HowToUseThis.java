package learnings;

class HowToUseThis {
	public static void main(String args[]){
		//		new Test1().getA().msg();
		new Test1().getA().msg1();
	}
}

class Test1 {
	
	Test1 getA(){
		System.out.println("Hello java in getA method() ");
		return this;
	}

	void msg0(Test1 t){
		System.out.println("Hello java in msg 0");
	}

	void msg1(){
		msg0(this);
	}

	void msg(){
		System.out.println("Hello java in msg() ");
	}
}
