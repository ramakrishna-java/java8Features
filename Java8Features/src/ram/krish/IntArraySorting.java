package ram.krish;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> intList=new ArrayList<>();
		intList.add(89);intList.add(44);intList.add(66);intList.add(34);
		intList.add(97);
		System.out.println("before sorting::"+intList);
		
		List<Integer> naturalSortedList = intList.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Natural Sorting Order::"+naturalSortedList);
		
		List<Integer> descendSortUsingComparator = intList.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2?-1:0)).collect(Collectors.toList());
		System.out.println("customized descending sorting order::"+descendSortUsingComparator);
		
		List<Integer> ascendSortUsingComparator = intList.stream().sorted((i2,i1)->(i1<i2?1:(i1>i2?-1:0))).collect(Collectors.toList());
		System.out.println("customized descending sorting order::"+ascendSortUsingComparator);
		

		intList.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		
	}

}
