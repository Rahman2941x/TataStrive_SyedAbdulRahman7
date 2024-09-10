package day7_1;

import java.util.*;

public class GooseEggCal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = 1;
		long b = 2;
		long c = 5;
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();

		if (num < 31 && num > 1) {
			for (int i = 2; i < num; i++) {
				a = b;
				b = c;
				c = (c * 2) + a;
			}
		} else if (num == 1) {
			System.out.println("The Egg in the day: " + a);
			return;
		} else {
			System.out.println("Invalid Input: " + num);
			return;
		}
		
		System.out.println("The Egg in the day: " + b);
	}
}
