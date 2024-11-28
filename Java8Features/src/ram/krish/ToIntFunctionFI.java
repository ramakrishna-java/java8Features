package ram.krish;

import java.util.function.ToIntFunction;

public class ToIntFunctionFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//return type is int and input type can be anything
		
		ToIntFunction<Integer> tif=i->i*i;
		System.out.println(tif.applyAsInt(88));
		

	}

}
