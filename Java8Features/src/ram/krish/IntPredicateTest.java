package ram.krish;

import java.util.function.IntPredicate;

public class IntPredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get the the value type even or odd by using IntPredicate.
		int[] x= {10,12,15,20,22,43,45};
		
		IntPredicate ip=i->i%2==0;
		for(int x1:x) {
			if(ip.test(x1))
			System.out.println(x1);
		}

	}

}
