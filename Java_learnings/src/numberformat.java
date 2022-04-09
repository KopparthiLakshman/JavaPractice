public class numberformat {

	public static void main(String[] args) {

		java.text.NumberFormat obj = new java.text.DecimalFormat("0000");

		for(int i=0; i<10;i++) {
			System.out.println(obj.format((double).87634567*i));
		}

	}
}
