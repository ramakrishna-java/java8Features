package ram.krish;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryOperator<Integer> boi=(i1,i2)->i1*i2;
		
		System.out.println(boi.apply(10, 20));
		
		IntBinaryOperator ibo=(i1,i2)->i1*i2;
		System.out.println(ibo.applyAsInt(10, 20));
		

	}

}
