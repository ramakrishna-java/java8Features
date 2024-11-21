package ram.krish;


interface Interf {
	public void m1(int i);
	//public void m2(int a, int b); //The target type of this expression must be a functional interface
}
public class FI_Lambda_summery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interf interf = i->System.out.println(i*i);
		interf.m1(10);
	}

}
