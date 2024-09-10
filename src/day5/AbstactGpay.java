package src.day5;

import java.util.ArrayList;

public abstract class AbstactGpay {
	
	private static ArrayList<String> Transation = new ArrayList<String>();	
	
	public abstract void depositAmount(double amount);
	public abstract void widthdrawAmount(double amount);
	public abstract void checkBalance(int Pin);
	//public abstract void ShowHistory();
	
	
	public void recordTransaction(String amount) {
		Transation.add(amount);	
	}
	
	public  void ShowHistory() {
		Transation.forEach(s->System.out.println(s));
	}

}
