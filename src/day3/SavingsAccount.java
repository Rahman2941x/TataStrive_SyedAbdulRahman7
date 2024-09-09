package day3;

public class SavingsAccount extends BankAccount{
	
	private double IntrestRate;
	
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(double IntrestRate,double Balance,int AccountNumber) {
		super(AccountNumber,Balance);
		this.IntrestRate=IntrestRate;
	}

    public void DisplayAccountDetails() {
    	super.DisplayAccountDetails();
		System.out.println("Intrest Rate: "+IntrestRate);
	}
}
