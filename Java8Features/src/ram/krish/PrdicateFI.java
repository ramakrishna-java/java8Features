package ram.krish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PrdicateFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> pfi = i->i>10;
		System.out.println(pfi.test(100));
		System.out.println(pfi.test(9));
		//System.out.println(pfi.test("aa"));
		
		Predicate<String> pfi2=s->s.length()>5;
		pfi2.test("raaam");
		pfi2.test("9kkkkkk");
		
		Predicate<Collection> pc=c->c.isEmpty();
		ArrayList<String> l1=new ArrayList<>();
		l1.add("abc");
		
		ArrayList l2=new ArrayList();
		
		System.out.println("is list empty:"+pc.test(l1));
		System.out.println("is list empty:"+pc.test(l2));

	}

}
