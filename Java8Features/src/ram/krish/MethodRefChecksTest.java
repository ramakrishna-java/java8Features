package ram.krish;

public class MethodRefChecksTest {
	
	//here it wont care about return type or access modifier at all
	//we are changing return type to int, instead of void
	//we are changing the access modifier to private, instead of public
	//still it will work, bcoz  in Method Referenc it wont consider those
	//it will consider only method arguments & its type
	private int m1() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodRefChecksTest mrt=new MethodRefChecksTest();
		Runnable r=mrt::m1;
		Thread t=new Thread(r);
		t.start();
	}

}
