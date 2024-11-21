package ram.krish;

import java.util.ArrayList;
import java.util.Collections;

public class EmpSortLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em1 = new Employee(100, "durga");
		Employee em2 = new Employee(900, "sunny");
		Employee em3 = new Employee(400, "bunny");
		Employee em4 = new Employee(200, "chunny");
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(em1);
		empList.add(em2);
		empList.add(em3);
		empList.add(em4);
		System.out.println(empList);
		Collections.sort(empList, (e1,e2)->(e1.getEno()>e2.getEno()?-1:(e1.getEno()<e2.getEno()?1:0)));
		System.out.println("after sorting:");
		System.out.println(empList);
		

	}

}
