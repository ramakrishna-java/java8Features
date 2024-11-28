package ram.krish;

public class MethodRefTest {
	
	static void m1() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		/*
		 * Runnable rr= ()->{ for(int i=0;i<10;i++) {
		 * System.out.println("child thread"); } };
		 */
		
		//instead of writing the code in lambda expression as above, we can write it in to a method && refer it as below
		
		Runnable r= MethodRefTest::m1;
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main THread");
		}

	}

}
