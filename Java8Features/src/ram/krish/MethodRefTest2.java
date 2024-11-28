package ram.krish;

public class MethodRefTest2 {
	
	public void m1() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodRefTest2 mrt= new MethodRefTest2();
		
		Runnable r= mrt::m1;
		Thread t= new Thread(r);
		t.start();
		

	}

}
