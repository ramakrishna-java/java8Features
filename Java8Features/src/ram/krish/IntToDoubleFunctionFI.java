package ram.krish;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input as type int && return result in the form of double
		IntToDoubleFunction idf=i->Math.sqrt(i);
		
		System.out.println(idf.applyAsDouble(9));

	}

}
