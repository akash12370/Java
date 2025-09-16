package Variables;

public class Bank {

	String accountHolderName;
	long aadhaarNumber;
	long accountNumber;
	int age;
	long mobileNumber;
	long accountBalance;
	
	public void createAccount()
	{
		accountHolderName = "Akash Varade";
		aadhaarNumber = 461096999440l;
		accountNumber = 9874563210l;
		age = 23;
		mobileNumber = 9511993301l;
		accountBalance = 10000;	
	}
	
	public void displayDetails()
	{
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Aadhaar Number: " + aadhaarNumber);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Age: " + age);
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Account Balance: " + accountBalance);
	}
	
	public void deposit()
	{
		long amountDeposit = 2500;
		accountBalance = accountBalance + amountDeposit;
		System.out.println("Rs.2500 is Deposited Sucessfully");
	}
	
	public void withdraw()
	{
		long amountWithdraw = 3500;
		accountBalance = accountBalance - amountWithdraw;
		System.out.println("Rs.3500 is Withdrawal Sucessfully");
	}
	
	public void checkBalance()
	{
		System.out.println("Available Balance: " + accountBalance);
	}
	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.createAccount();
		b.displayDetails();
		b.deposit();
		b.withdraw();
		b.checkBalance();
	}

}
