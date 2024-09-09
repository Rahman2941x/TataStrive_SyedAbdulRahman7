package day3;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount B1 = new SavingsAccount(10.5, 54000, 733949965);
		
        B1.Deposit(2000);
		
		B1.WidthDram(10000);
		
		B1.DisplayAccountDetails();
	
		System.out.println(B1.DepositeAmmount(4000));
		System.out.println(B1.WidthdrawAmmount(5000));
		
	}

}
