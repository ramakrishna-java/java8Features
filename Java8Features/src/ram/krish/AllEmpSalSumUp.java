package ram.krish;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Emp {
	String name;
	double salary;
	public Emp(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class AllEmpSalSumUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp("ram1", 1000);
		Emp e2=new Emp("ram2", 2000);
		Emp e3=new Emp("ram3", 30000);
		ArrayList<Emp> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		System.out.println(empList);
		
		Function<List<Emp>, Double> f=l->{
			double totalSal=0;
			for(Emp e:l) {
				totalSal=totalSal+e.salary;
			}
			return totalSal;
		};
		
		System.out.println(f.apply(empList));
		
		Predicate<Emp> salPredicate = e->e.salary<2500;
		Function<Emp, Emp> salFunction =e->{
			 e.salary = e.salary + 477.00;
			 return e;
		};
		
		for(Emp ev:empList) {
			if(salPredicate.test(ev)) {
				salFunction.apply(ev);
				System.out.println("updated salary is :"+ev);
				
			}
		}
			
	}

}
