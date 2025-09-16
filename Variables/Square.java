package Variables;

public class Square {
	
	int side = 5;
	int area = side * side;
	
	public void areaOfSquare()
	{
		System.out.println("Area of Square: " + area);
	}
	public static void main(String[] args) {
		Square sqr = new Square();
		sqr.areaOfSquare();

	}

}


