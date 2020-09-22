package java8;

interface Drawable {
	public void draw();
}

public class LamdaExpression1 {
	public static void main(String[] args) {  
		int width=10;  

		//with lambda  
		Drawable d2=()-> System.out.println("Drawing "+width);  
	}
}