package day8;

import java.util.Scanner;

public class ConsecutivePallindrome {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the len of Array: ");
		int len = sc.nextInt();
		if (len < 1 || len > 5) {
			System.out.println("Invalid input: ");
			return;
		}

		int[] arr = new int[len];
		
		String st = "";
		System.out.println("Enter the Element in Array");
		for (int i = 0; i <= len; i++) {
			int a = sc.nextInt();
			if (a > 0 && a < 99) {
				arr[i] = a;
			} else {
				System.out.println("Invalide input");
				return;
			}
			if (isPrime(arr[i])) {
				int total = 0;
				for (int j = 2; j < arr[i]; j++) {
					if (isPrime(j)) {
						System.out.println("J" + j);
						total = total + j;
						if (total == arr[i]) {
							st += total + " ";
						}
					}
				}
			}

		}
		System.out.println(st);
		

	}

	private static boolean isPrime(int len) {

		if (len <= 1) {
			return false;
		}

		int count = 0;
		for (int i = 2; i < len; i++) {
			if (len % i == 0) {
				count++;
			}
		}

		if (count == 1) {
			return true;
		}
		return false;
	}

}
