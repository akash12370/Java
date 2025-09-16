package Encapsulation;

public class Student {

	private int rollno;
	private String name;
	private String address;
	private long mobile;
	private int fees;
	
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAdd(String address)
	{
		this.address = address;
	}
	
	public void setMob(long mobile)
	{
		this.mobile = mobile;
	}
	
	public void setFees(int fees)
	{
		this.fees = fees;
	}
	
	
	public int getRoll()
	{
		return rollno;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAdd()
	{
		return address;
	}
	
	public long getMob()
	{
		return mobile;
	}
	
	public int getFees()
	{
		return fees;
	}
	
	
}
