package Variables;

public class Rectangle {
	
	double len = 15;
	double brd = 20;
	double area = len * brd;
	
	public void areaOfRectangle()
	{
		System.out.println("Area of Rectangle: " + area);
	}
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.areaOfRectangle();
				

	}

}
