package Encapsulation;

public class User {

	private int id;
	private String name;
	private String address;
	private String panno;
	private long aadhaar;
	private long mobile;
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAdd(String address)
	{
		this.address = address;
	}
	
	public void setPan(String panno)
	{
		this.panno = panno;
	}
	
	public void setAadhaar(long aadhaar)
	{
		this.aadhaar = aadhaar;
	}
	
	public void setMob(long mobile)
	{
		this.mobile = mobile;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAdd()
	{
		return address;
	}
	
	public String getPanno()
	{
		return panno;
	}
	
	public long getAadhaar()
	{
		return aadhaar;
	}
	
	public long getMobile()
	{
		return mobile;
	}
}
