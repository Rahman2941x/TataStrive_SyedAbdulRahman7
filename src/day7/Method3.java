package day7;

import java.util.*;

public class Method3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");

		String wod = sc.nextLine();

		String[] words = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

		int num = wod.length();

		String st = "";

		for (int i = 0; i < num; i++) {

			char ch = wod.charAt(i);

			if (ch == '0') {

				System.out.print(words[0] + " ");

			} else if (ch == '1') {

				System.out.print(words[1] + " ");

			} else if (ch == '2') {

				System.out.print(words[2] + " ");

			} else if (ch == '3') {

				System.out.print(words[3] + " ");

			} else if (ch == '4') {

				System.out.print(words[4] + " ");

			} else if (ch == '5') {

				System.out.print(words[5] + " ");

			} else if (ch == '6') {

				System.out.print(words[6] + " ");

			} else if (ch == '7') {

				System.out.print(words[7] + " ");

			} else if (ch == '8') {

				System.out.print(words[8] + " ");

			} else if (ch == '9') {

				System.out.print(words[9] + " ");

			}

			System.out.print(st);

		}

	}
}
