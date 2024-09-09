package day5;

public class ICICI extends AbstactGpay {
	
	private double Balance =5000;
	private int Pin = 2941;
	
	public void depositAmount(double amount) {
		Balance += amount;
		String recordTrans="Amount rs " + amount + " Deposite in ICICI";
		recordTransaction(recordTrans);
		
	}
	public void widthdrawAmount(double amount) {
		
		if(Balance>amount) 
		{
		Balance -= amount;
		String recordTrans="Amount rs " + amount + " Widthdraw in ICICI";
		recordTransaction(recordTrans);
		}
		else 
			System.out.println("inSufficient of Balance :(");
		
		
	}
	public void checkBalance(int Pin) {
		
		if(this.Pin ==Pin) {
			System.out.println("Your Account balace is "+ Balance +"in ICICI Bank");
		}
		else 
			System.out.println("Invlid Pin");
	}
	
}
