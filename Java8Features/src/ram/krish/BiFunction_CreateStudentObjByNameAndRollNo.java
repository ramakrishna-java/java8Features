package ram.krish;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Studentz {
	String name;
	int rollNo;
	public Studentz(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Studentz [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	
}

public class BiFunction_CreateStudentObjByNameAndRollNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<String, Integer, Studentz> stdBiF= (name, rollNo)->new Studentz(name, rollNo);
		
		ArrayList<Studentz> sList = new ArrayList<>();
		sList.add(stdBiF.apply("Rama", 1000));
		sList.add(stdBiF.apply("krishan", 2000));
		sList.add(stdBiF.apply("reddy", 3000));
		
		for(Studentz s:sList) {
			System.out.println("name:"+s.name);
			System.out.println("rollNO:"+s.rollNo);
		}
		
		

	}

}
