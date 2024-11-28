package ram.krish;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class IntUnaryOperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function< Integer, Integer> f=i->i*i;
		System.out.println(f.apply(9));
		
		//if both input and output are always of same type then we can go for UnaryOperator Interfaces.
		
		UnaryOperator<Integer> unaryF=i->i*i;
		System.out.println(unaryF.apply(7));
		
		//thhis above we can write as below also using directly IntUnaryOperator interface
		
		IntUnaryOperator intUnaryFun=i->i*i;
		System.out.println(intUnaryFun.applyAsInt(8));
		

	}

}
