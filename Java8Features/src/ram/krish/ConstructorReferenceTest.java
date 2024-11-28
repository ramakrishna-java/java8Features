package ram.krish;

class Sample {
	public Sample() {
		// TODO Auto-generated constructor stub
		System.out.println("executed through the constructor reference............");
	}
}

interface Interff {
	Sample get();
}

public class ConstructorReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interff i=Sample::new;
		Sample sample1 = i.get();
		Sample sample2 = i.get();
		Sample sample3 = i.get();
		Sample sample4 = i.get();

	}

}
