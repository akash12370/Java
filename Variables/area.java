package Variables;

public class area {

	float pi = 3.14f;
	float radius = 15.60f;
	float aoc = pi * radius * radius;
	
	public void area()
	{
		System.out.println("Area of Circle: " + aoc);
	}
	public static void main(String[] args) {
		area ar = new area();
		ar.area();
	}

}
