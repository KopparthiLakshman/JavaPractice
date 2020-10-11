package java8;

public class runInterface extends Thread{

	runInterface runInt;
	public runInterface(runInterface runInt) {
		this.runInt = runInt;
	}
	Thread t = new Thread(()-> run());
	public static void main(String[] args) {

	}
}
