package ram.krish;

import java.util.Date;
import java.util.function.Supplier;

public class GetSystemDateUsingSupplierFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Date> s= ()->new Date();
		System.out.println(s.get());
		
		
		Supplier<String> sr=()->{
			String[] names= {"ram","krish","reddy","thamatam"};
			int x=(int)(Math.random()*4);
			return names[x];
		};
		System.out.println(sr.get());
		System.out.println(sr.get());
		System.out.println(sr.get());

	}

}
