package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieList {

	public static void main(String[] args) {
		Movie m1 = new Movie(101,"Batman",8.9f);
		Movie m2 = new Movie(90,"Conjuring",7.8f);
		Movie m3 = new Movie(98,"Tarzan",9.6f);
		Movie m4 = new Movie(95,"Avengers",8.9f);
		Movie m5 = new Movie(102,"Life of pie",7.9f);
		
		List<Movie> movieList = new ArrayList<>(); //giving class movie as datatype
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		movieList.add(m4);
		movieList.add(m5);
		

		
		Collections.sort(movieList);
		
		for(Movie m : movieList)
		{
			System.out.println(m); //printing objects
		}
		
		
	}

}
