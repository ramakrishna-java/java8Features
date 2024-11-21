package ram.krish;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Students {
	String name;
	int marks;
	public Students(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	
}

public class StudenInfoUsingConsumerFuctionPredicateFIs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> list=new ArrayList<>();
		Student s1=new Student("ram80", 80);
		Student s2=new Student("ram70", 70);
		Student s3=new Student("ram60", 60);
		Student s4=new Student("ram50", 50);
		Student s5=new Student("ram40", 40);
		Student s6=new Student("ram30", 30);
		list.add(s1); list.add(s2); list.add(s3); list.add(s4); list.add(s5); list.add(s6);
		
		Predicate<Student> p=s->s.marks>=60;
		
		Function<Student, String> f= s->{
			int marks=s.marks;
			if(marks >80)
				return "A";
			else if(marks >=60)
				return "B";
			else if(marks >=50)
				return "C";
			else if (marks>=40)
				return "D";
			else 
				return "E";
			
			
		};
		
		Consumer< Student> c=s->{
			System.out.println("Name::"+s.name);
			System.out.println("marks::"+s.marks);
			System.out.println("Grade:"+f.apply(s));
		};
		
		for(Student ss:list) {
			if(p.test(ss))
				c.accept(ss);
		}

	}

}
