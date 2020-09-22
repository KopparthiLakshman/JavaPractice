package raghavan2;
import java.util.Arrays;
import java.util.List;
public class Main {

	public static void main(String[] args)  {
		
		List<Cargo> cargo = Arrays.asList(
				new Cargo(1,2,3,4)
				,new Cargo(1,2,3,4)
				,new Cargo(1,2,3,4)
				,new Cargo(1,2,3,4)
				);
		
		
		System.out.println(cargo);
	}
}