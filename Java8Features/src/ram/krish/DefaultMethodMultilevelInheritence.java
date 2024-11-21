package ram.krish;

interface Left {
	default public void m1() {
		System.out.println("Left implementation");
	}
}

interface Right {
	default public void m1() {
		System.out.println("Right implementation");
	}
}
public class DefaultMethodMultilevelInheritence implements Left, Right {
	public void m1() {
		System.out.println("my own implementation");
		Left.super.m1();
		Right.super.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodMultilevelInheritence dmi= new DefaultMethodMultilevelInheritence();
		dmi.m1();

	}

}
