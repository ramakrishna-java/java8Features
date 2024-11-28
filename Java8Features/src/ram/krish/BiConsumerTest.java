package ram.krish;

import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//takes two different strings as input and print the concatenated string
		
		BiConsumer<String, String>	c=(s1,s2)->System.out.println(s1+s2);
		
		c.accept("rama", "krish");
	}

}
