package day5;

public class IOB  extends AbstactGpay{
	private double Balance =50000;
	private int Pin = 294107;
	
	public void depositAmount(double amount) {
		Balance += amount;
		String recordTrans="Amount rs " + amount + " Deposite in IOB";
		recordTransaction(recordTrans);
		
	}
	public void widthdrawAmount(double amount) {
		
		if(Balance>amount) {
		Balance -= amount;
		String recordTrans="Amount rs " + amount + " Widthdraw in IOB";
		recordTransaction(recordTrans);
		}
		else 
			System.out.println("inSufficient of Balance :(");
		
		
	}
	public void checkBalance(int Pin) {

		if(this.Pin ==Pin) {
			System.out.println("Your Account balace is "+ Balance +"in IOB Bank");
		}
		else 
			System.out.println("Invlid Pin");
	}
	
	

}
