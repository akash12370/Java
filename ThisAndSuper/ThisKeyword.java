package ThisAndSuper;

public class ThisKeyword {
	int num = 900;
	
	public void m1()
	{
		System.out.println(this.num);
	}
	
	public void m2()
	{
		this.m1();
		System.out.println("Method 2");
	}
	
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();
		obj.m2();
	}

}
