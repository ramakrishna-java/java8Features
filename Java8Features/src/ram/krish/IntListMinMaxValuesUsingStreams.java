package ram.krish;

import java.util.ArrayList;
import java.util.List;

public class IntListMinMaxValuesUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> intlist=new ArrayList<>();
		intlist.add(10);
		intlist.add(88);
		intlist.add(11);
		intlist.add(2);
		intlist.add(45);
		Integer minVal = intlist.stream().min((i1,i2)->(i1<i2?1:(i1>i2?-1:0))).get();
		System.out.println("Min Value:"+minVal);
		
		Integer minValASO = intlist.stream().min((i2,i1)->(i1<i2?1:(i1>i2?-1:0))).get();
		System.out.println("Min Value in ASO:"+minValASO);

		
		Integer maxVal = intlist.stream().max((i1,i2)->(i1<i2?1:(i1>i2?-1:0))).get();
		System.out.println("Max Value:"+maxVal);
		
		Integer maxValASO = intlist.stream().max((i2,i1)->(i1<i2?1:(i1>i2?-1:0))).get();
		System.out.println("Max Value in ASO:"+maxValASO);
	}

}
