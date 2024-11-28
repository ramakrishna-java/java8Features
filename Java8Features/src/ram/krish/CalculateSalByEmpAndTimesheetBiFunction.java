package ram.krish;

import java.util.function.BiFunction;

class Emps {
	int eno;
	String name;
	int dailywage;
	public Emps(int eno, String name, int dailywage) {
		super();
		this.eno = eno;
		this.name = name;
		this.dailywage = dailywage;
	}
}

class Timesheet{
	int eno;
	int noOfDays;
	public Timesheet(int eno, int noOfDays) {
		super();
		this.eno = eno;
		this.noOfDays = noOfDays;
	}
}

public class CalculateSalByEmpAndTimesheetBiFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emps e= new Emps(1, "ram", 1001);
		Timesheet t=new Timesheet(1, 25);
		
		BiFunction<Emps, Timesheet, Integer> salaryBiF =(e1,t1)->e1.dailywage*t1.noOfDays;
		System.out.println(salaryBiF.apply(e, t));

	}

}
