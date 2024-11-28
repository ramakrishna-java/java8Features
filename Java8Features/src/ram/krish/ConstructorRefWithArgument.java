package ram.krish;

class Samplee {
	public Samplee(String s) {
		System.out.println("Constructor Ref with Arguments:"+s);
	}
	
	public Samplee() {
		System.out.println("Construcor Ref without arguments:");
	}
}

interface Interfache{
	Samplee get(String s);
}

public class ConstructorRefWithArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interfache i=Samplee::new;
		i.get("Rama");
		i.get("Krish");
		//i.get();

	}

}
