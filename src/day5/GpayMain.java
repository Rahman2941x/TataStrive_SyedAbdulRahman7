package day5;

import java.util.Scanner;

import javax.swing.Icon;

public class GpayMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ICICI icici = new ICICI();
		IOB iob = new IOB();
		
		AbstactGpay gpay = icici; 
		
		
		int ch = 0;
		System.err.println(" User Interface \n--------------------");
		
		do{
			System.out.println("1. Widthdraw Monwy");
			System.out.println("2. Deposite Monwy");
			System.out.println("3. Chech the balance");
			System.out.println("4. see History");
			System.out.println("5. Switch account");
			System.out.println("6. Exit");
			ch =sc.nextInt();
			
			if(ch==1) {
				System.out.println("Enter the Amount to Width Draw");
				double amount = sc.nextDouble();
				gpay.widthdrawAmount(amount);
			}
			
			else if(ch ==2) {
				System.out.println("Enter the Amount to Deposite");
				double amount = sc.nextDouble();
				gpay.depositAmount(amount);
			}
			
			else if(ch ==3) {
				System.out.println("Enter the Pin");
				int Pin = sc.nextInt();
				System.out.println("Your Account Balance ");
				gpay.checkBalance(Pin);
			}
			
			else if(ch==4) {
				System.out.println("your Transaction History");
				gpay.ShowHistory();
					
			}
			
			else if(ch==5) {
				System.out.println("Choose your bank Account \n1.ICICI \n2.IOB");
				int cho =sc.nextInt();
				if(cho==1) {
					 gpay = icici;
				}
				else if(cho==2) {
					gpay =iob;
				}
			}
			else if (ch==6) {
				System.out.println("Thank You for Using the Gpay...");
				return;
			}
			else
				System.out.println("ENter Valid number");
			}while(ch!=6);
	
	
	sc.close();
	}

}
