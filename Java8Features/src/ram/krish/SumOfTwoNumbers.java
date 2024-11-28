package ram.krish;

interface Interfcee {
	public void add(int a, int b);
}

public class SumOfTwoNumbers {
	
	public static void sum(int x,int y) {
		System.out.println("The sum is :"+(x+y));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interfcee i=(a,b)->System.out.println("The Sum is::"+(a+b));
		i.add(10, 20);
		
		Interfcee i2= SumOfTwoNumbers::sum;
		i2.add(100, 200);

	}

}
