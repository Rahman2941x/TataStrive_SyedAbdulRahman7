package day7;

import java.util.Scanner;

public class Method2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		String wod = sc.nextLine();

		String[] words = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

		int num = wod.length();

		String st = "";
		for (int i = 0; i < num; i++) {
			char ch = wod.charAt(i);
			st = (ch == '1') ? (words[1] + " ")
					: (ch == '2') ? (words[2] + " ")
							: (ch == '3') ? (words[3] + " ")
									: (ch == '4') ? (words[4] + " ")
											: (ch == '5') ? (words[5] + " ")
													: (ch == '6') ? (words[6] + " ")
															: (ch == '7') ? (words[7] + " ")
																	: (ch == '8') ? (words[9] + " ")
																			: (ch == '0') ? (words[0] + " ") : "Invalid input";

			System.out.print(st);

		}

	}

}
