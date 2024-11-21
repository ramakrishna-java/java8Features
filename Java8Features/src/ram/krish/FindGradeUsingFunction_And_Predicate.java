package ram.krish;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;
	String grade;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}

public class FindGradeUsingFunction_And_Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Students> sList= new ArrayList<>();
		sList.add(new Students("ram90",90));
		sList.add(new Students("ram80",80));
		sList.add(new Students("ram60",60));
		sList.add(new Students("ram50",50));
		sList.add(new Students("ram30",30));
		
		Predicate< Students> p= s->s.marks>=60;
		
		Function<Students, String> f=s->{
			int marks=s.marks;
			
			if(marks>=80)
				return "A[Distinction]";
			else if (marks>=60) 
				return "B[First Class]";
			else if (marks>=50)
				return "C[Second Class]";
			else if(marks>=35)
				return "D[Third Class]";
			else 
				return "E[Failed]";
				
		};

	for(Students st:sList) {
		if(p.test(st)) {
		System.out.println("Name:"+st.getName());
		System.out.println("Marks:"+st.getMarks());
		System.out.println("Grade:"+f.apply(st));
		}
	}
	}

}
