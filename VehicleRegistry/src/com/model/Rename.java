package com.model;
//import com.service.VehicleInterface;

//import java.util.Scanner;

public class Rename {
	
	private String RegNum;
	private String ChasNum;
	private String EngNum;
	private String color;
	private int price;
	
//	Scanner s = new Scanner(System.in);
	
	public void setRegNum(String RegNum)
	{
		this.RegNum = RegNum;
	}
	
	public String getRegNum()
	{
		return RegNum;
	}
	
	public void setChasNum(String ChasNum)
	{
		this.ChasNum = ChasNum;
	}
	
	public String getChasNum()
	{
		return ChasNum;
	}
	
	public void setEngNum(String EngNum)
	{
		this.EngNum = EngNum;
	}
	
	public String getEngNum()
	{
		return EngNum;
	}
	
	public void setcolor(String color)
	{
		this.color = color;
	}
	
	public String getcolor()
	{
		return color;
	}
	
	public void setprice(int price)
	{
		this.price = price;
	}
	
	public int getprice()
	{
		return price;
	}
	
}
