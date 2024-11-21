package ram.krish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(1);
		list.add(6);
		list.add(98);
		System.out.println("before sorting:"+list);
		Collections.sort(list, (o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
		System.out.println("after sorting:"+list);

	}

}
