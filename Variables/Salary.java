package Variables;

public class Salary {

	double pay = 15230.20;
	double homeall = 6090.95;
	double travelall = 3090.66;
	double sal = pay + homeall + travelall;
	
	double pf = 840.30;
	double pt = 305.20;
	
	double reduction = pf + pt;
	
	public void salcal()
	{
		System.out.println("Basic Pay: " + pay);
		System.out.println("Home Allowance: " + homeall);
		System.out.println("Travel Allowence " + travelall);
		System.out.println("Provident Fund: " + pf);
		System.out.println("Professional Tax: " + pt);
		
		System.out.println("Payable Amount: " + sal);
		System.out.println("Reduction: " + reduction);
		
		System.out.println("Total Salary: " + (sal-reduction));
	}
	

	public static void main(String[] args) {
		Salary s = new Salary();
		s.salcal();

	}

}
