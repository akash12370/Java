package Comparable;

public class Movie implements Comparable<Movie>{
	private int id;
	private String name;
	private float rating;
	
	public Movie(int id, String name, float rating) 
	{
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "movie [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	
	@Override
	public int compareTo(Movie o)
	{
		//this is logic for comparision
//		if(this.id > o.id)
//		{
//			return 1;
//		}
//		else if(this.id < o.id)
//		{
//			return -1;
//		}
//		else
//		{
//			return 0;
//		}
		
		//return Integer.compare(this.id, o.id); this is using wrapper integer class
		//return Float.compare(this.rating, o.rating); this is using wrapper float class
		
	
		return this.name.compareTo(o.name); //using string name
	}

}
