package day7;

import java.util.*;

public class Method4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		String ones[] = { "", "One", "Two", "Three", "Four", "Five", 
				"Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", 
				"Seventeen", "Eighteen", "Nineteen" };
		String tens[] = { "", "Ten", "Twenty", "Thirty", "Forty",
				"Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
		String hun = "Hundred";
		String thow = "Thowsand";
		String lak = "Lakh";
		int a = num % 10;
		int bb = num / 10;
		int b = bb % 10;
		int c = num / 100;
		int cc = c % 10;
		int d = num / 1000;
		int dd = num % 1100;
		
		if (num <= 19) {
			System.out.println(ones[num]);
		} else if (num > 20 && num < 100) {
			System.out.println(tens[b] + " " + ones[a]);
		} else if (num >= 100 && num < 1000) {
			System.out.println(ones[c] + " " + hun + " " + tens[b] +
					" " + ones[a]);
		} else if (num >= 1000 && num < 1100) {
			System.out.println(ones[d] + " " + thow + " " + tens[b] + 
					" " + ones[a]);
		} else if (num >= 1100 && num < 1200) {
			System.out.println(ones[d] + " " + thow + " " + ones[cc] + 
					" " + hun + " " + ones[dd]);
		} else if (num >= 1200 && num < 10000) {
			System.out.println(ones[d] + " " + thow + " " + ones[cc] + 
					" " + hun + " " + tens[b] + " " + ones[a]);
		}}}
