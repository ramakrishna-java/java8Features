package ram.krish;

class MyRunnable implements Runnable  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("child thread: "+i);
		}
		
	}
	
}
public class SampleThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r= new MyRunnable();
		Thread t= new Thread(r);
		t.start();

		//using lambda expression
		Runnable rr= ()->{
			for(int i=0;i<10;i++) {
				System.out.println("lambda child thread: "+i);
			}
		};
		Thread t2=new Thread(rr);
		t2.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("main thread ::"+i);
		}

	}

}
