package ram.krish;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie {
	String movie;
	String result;
	public Movie(String movie, String result) {
		super();
		this.movie = movie;
		this.result = result;
	}
	
	
}

public class ConsumerChainingFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> movieList =new ArrayList<>();
		movieList.add(new Movie("bahubali","hit"));
		movieList.add(new Movie("RRR","hit"));
		movieList.add(new Movie("acharya","flop"));
		
		Consumer<Movie> c1=m->System.out.println("Movie:"+m.movie);
		Consumer<Movie> c2=m->System.out.println("result:"+m.result);
		Consumer<Movie> c3=m->System.out.println("Movie info storing in db");
		
		Consumer<Movie> chainedConsumer=c1.andThen(c2).andThen(c3);
		
		for(Movie mm:movieList) {
			chainedConsumer.accept(mm);
		}

	}

}
