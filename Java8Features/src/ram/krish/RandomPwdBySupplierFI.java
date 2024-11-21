package ram.krish;

import java.util.function.Supplier;

public class RandomPwdBySupplierFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// pwd should contain 8 char length
		// 2,4,6,8 should be digits
		// 1,3,5,7 should be upper case chars & symbols
		
		Supplier<Integer> d=()-> (int)(Math.random()*10);
		
		Supplier<Character> c=()->{
			String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			
			return s.charAt((int)(Math.random()*29));
			
		};

		String pwd="";
		for(int i=0;i<8;i++) {
			if(i %2 ==0)
				pwd=pwd+d.get();
			else
				pwd=pwd+c.get();
		}
		System.out.println("Password is:"+pwd);
	}

}
