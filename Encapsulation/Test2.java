package Encapsulation;
import java.util.Scanner;

class Student3{
	  private int rollNo;
	  //set method
	  public void setrollNo(int rollNo){
	    this.rollNo = rollNo;
	  }
	  
	  //get method
	  public int getrollNo(){
	    return rollNo;
	  }
	}

	public class Test2 {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			Student3 std = new Student3();
	        
	        System.out.println("Enter Roll no.:");
			std.setrollNo(s.nextInt());
	      
	        System.out.println("Roll no.:" + std.getrollNo());
	    }
	}

