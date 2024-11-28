package ram.krish;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BiFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<String, String, String> bif= (s1,s2)->s1+s2;
		System.out.println(bif.apply("ram", " krishn"));
		
		BinaryOperator<String> bo=(s1,s2)->s1+s2;
		System.out.println(bif.apply("ram", "reddy"));

	}

}
