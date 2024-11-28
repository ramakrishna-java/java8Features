package ram.krish;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//accept two input values and perform some action and return a boolean result.
		//accept two values and multiply it and find it even or odd
		BiPredicate<Integer, Integer> bp=(a,b) ->(a+b)%2 ==0;
		
		System.out.println(bp.test(10, 20));
		System.out.println(bp.test(10, 15));

	}

}
