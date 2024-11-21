package ram.krish;

import java.util.Scanner;
import java.util.function.Function;

public class UserAuthenticationByFunctionFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, String> f1=s->s.toLowerCase();
		Function<String, String> f2=s->s.substring(0,5);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter userName:");
		String userName=sc.next();
		
		System.out.println("enter pwd::");
		String pwd=sc.next();
		
		if(f1.andThen(f2).apply(userName).equals("durga") && pwd.equals("java"))
			System.out.println("valid user");
		else
			System.out.println("invalida user");

	}

}
