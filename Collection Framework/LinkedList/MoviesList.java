package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MoviesList {

	public static void main(String[] args) {
		Movie m1 = new Movie(101,"Batman",8.5f);
		Movie m2 = new Movie(205,"Avengers",9.4f);
		Movie m3 = new Movie(411,"Tarzan",8.2f);
		Movie m4 = new Movie(555,"Conjuring",9.1f);
		Movie m5 = new Movie(112,"Smile",7.5f);
		
		
		List<Movie> movieList = new ArrayList<>();
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		movieList.add(m4);
		movieList.add(m5);
		
//		System.out.println(movieList);
		
		Collections.sort(movieList);
		
		for(Movie m : movieList)
		{
			System.out.println(m);
		}
		

	}

}
