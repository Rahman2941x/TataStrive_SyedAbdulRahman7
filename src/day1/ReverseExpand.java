package day1;


import java.util.*;

public class ReverseExpand {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the number");
		int num = sc.nextInt();
		int reverse =0;
		int count=3;
		
		
		
		if(num>999 && num<9999) {
			while(num!=0){
			int rem =num%10;
			
			System.out.print(rem);
			for(int i =1;i<=count;i++) {
				System.out.print("0");
				}
			
			if(num>=10) {
			System.out.print("+");
			}
			count--;
			reverse =reverse*10 +rem;
			num /=10;
			
			}
		}
		else 
			System.out.println("please enter the valid 4 digit number");
		
	}

}
