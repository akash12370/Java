package BankApplication;

import java.util.Scanner;

interface RBI {
    int getData();
    void createAccount(int i);
    void deposit();
    void withdraw();
    void balanceCheck();
}

class Boi implements RBI {
    Scanner s = new Scanner(System.in);
    long bal;

    public int getData() {
        System.out.println("Enter Name:");
        String name = s.next() + s.nextLine();

        System.out.println("Mobile number:");
        long mob = s.nextLong();

        System.out.println("Aadhaar Number:");
        long Adn = s.nextLong();

        System.out.println("Initial Balance:");
        bal = s.nextLong();

        return 1;
    }

    public void createAccount(int i) {
        if (i == 1) {
            System.out.println("Account Created Successfully");
        } else {
            System.out.println("Give Correct Data");
        }
    }

    public void deposit() {
        System.out.println("Enter amount to deposit:");
        long dep = s.nextLong();
        bal = dep + bal;
        System.out.println("Amount Deposited Successfully.");
    }

    public void withdraw() {
        System.out.println("Enter amount to withdraw:");
        long wd = s.nextLong();
        if (wd <= bal) {
            bal = bal - wd;
            System.out.println("Amount Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void balanceCheck() {
        System.out.println("Available Balance: " + bal);
    }
}

public class Bank extends Boi {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Scanner s1 = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose your service:\n1.Create Account\n2.Deposit Money\n3.Withdraw Money\n4.Check Balance\n5.Exit");
            int ch = s1.nextInt();

            switch (ch) {
                case 1:
                    int i = b1.getData();
                    b1.createAccount(i);
                    break;
                case 2:
                    b1.deposit();
                    break;
                case 3:
                    b1.withdraw();
                    break;
                case 4:
                    b1.balanceCheck();
                    break;
                case 5:
                    System.out.println("Thank you for banking with us!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice! Please try again.");
                    break;
            }
        }
    }
}
