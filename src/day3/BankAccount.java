package day3;

public class BankAccount {
	
	private int AccountNumber;
	private double Balance;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int AccountNumber,double Balance) {
		this.AccountNumber=AccountNumber;
		this.Balance=Balance;
	}
	
	public void Deposit(double Money) {
		Balance =  Balance+Money;
	}
	
	public void WidthDram(double Money) {
		Balance= Balance-Money;
	}

	
	public double DepositeAmmount(double Money) {
		return Balance+Money;
	}
	
	
	public double WidthdrawAmmount(double Money) {
		return Balance-Money;
	}
	public void DisplayAccountDetails() {
		System.out.println("Account Number: "+ AccountNumber);
		System.out.println("Account balance: "+Balance);
		
	}
}
