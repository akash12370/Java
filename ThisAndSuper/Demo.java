package ThisAndSuper;

class main
{
	public main()
	{
		System.out.println("Addition:");
	}
	
	public main(int a,int b)
	{
		System.out.println("Subtraction:");
	}
	
	public main(float a,float b)
	{
		System.out.println("Multiplication:");
	}
	
	public main(long a,long b)
	{
		System.out.println("Division:");
	}
}

public class Demo extends main{
	
	public Demo()
	{
		
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	public Demo(int a,int b)
	{
		super(10,20);
		System.out.println(a-b);
	}
	
	public Demo(float a,float b)
	{
		super(3.2f,2.5f);
		System.out.println(a*b);
	}
	
	public Demo(long a,long b)
	{
		super(369852147l,147852369l);
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo d2=new Demo(12,24);
		Demo d3=new Demo(3.2f,2.5f);
		Demo d4=new Demo(36l,12l);
		

	}

}
