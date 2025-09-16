package Abstraction;

abstract class Bank
{
	int dep = 500;
	int wd = 200;
	int bal = 2000;
	
	public abstract void createAccount();
	public abstract void deposit();
	public abstract void withdraw();
	public abstract void display();
}

public class BankImpl extends Bank{

	public void createAccount()
	{
		System.out.println("Account has created");
	}
	
	public void deposit()
	{
		System.out.print("Deposit Money:");
	}
	public void withdraw()
	{
		System.out.print("Withdraw money:");
	}
	public void display()
	{
		System.out.print("Balance:");
	}
	public static void main(String[] args) {
		Bank b1 = new BankImpl();
		b1.createAccount();
		b1.deposit();
		System.out.println(b1.dep);
		b1.withdraw();
		System.out.println(b1.wd);
		b1.display();
		System.out.println(b1.bal);

	}

}
