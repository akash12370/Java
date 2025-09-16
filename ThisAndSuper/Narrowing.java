package ThisAndSuper;

public class Narrowing {

	public void m1(Object obj)
	{
		System.out.println("m1---Object");
	}
	
	public void m1(String str)
	{
		System.out.println("m1---String");
	}
	
	public void m1(Narrowing n)
	{
		System.out.println("m1---Class");
	}
	public static void main(String[] args) {
		Narrowing n = new Narrowing();
		Narrowing b = new Narrowing();
		n.m1((Object)null); //giving null value as default to non-primitive object data type 
		n.m1("abc"); 
		n.m1(n); //giving object as parameter to class argument method

	}

}
