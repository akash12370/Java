package Variables;

public class Product {

	int price = 6000;
	int discount = 600;
	int gstamt;
	int dis; 
	int amt = price + gstamt - discount;
	
	public void gst()
	{
		gstamt = (6000*18)/100;
		System.out.println("GST(18%): " + gstamt);
	}
	
	public void discount()
	{
		
		System.out.println("Discount(10%): " + discount);
	}
	
	public void amount()
	{
		
		System.out.println("Total Amount: " + amt);
	}
	
	public static void main(String[] args) {
		Product prd = new Product();
		prd.gst();
		prd.discount();
		prd.amount();
	}

}
