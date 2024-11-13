package ram.krish;

@FunctionalInterface
interface FI{
	public void m1();
	//public void m2();  //Invalid '@FunctionalInterface' annotation; FI is not a functional interface
}

class Demo implements FI {
	public void m1() {
		System.out.println("Normal Implementation");
	}
}

public class LambdaExpressionTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FI fi= new Demo();
		fi.m1();
		
		//using Lambda Expression
		FI lambda = ()->System.out.println("Lambad Expression implementation");
		lambda.m1();

	}

}
