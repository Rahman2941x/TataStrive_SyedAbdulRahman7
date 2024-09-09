package day3;

public class CurrentAccount extends BankAccount {

	private int Limit;
	
	
	public CurrentAccount() {
		
	}
	
	public CurrentAccount(int AccountNumber,double Balance,int Limit) {
		super(AccountNumber,Balance);
		this.Limit=Limit;
	}
	
	@Override
	public void DisplayAccountDetails() {
		super.DisplayAccountDetails();
		System.out.println("Limit of the Account: "+Limit);
	}
}
