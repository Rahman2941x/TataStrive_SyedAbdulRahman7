package day7;

import java.util.Scanner;

public class Method1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		String[] words ={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

		String st = "";

		while (num != 0) {
			int digit = num % 10;
			num /= 10;
			st = " " + words[digit] + st;
		}
		System.out.println(st.trim());
		sc.close();
	}
}
