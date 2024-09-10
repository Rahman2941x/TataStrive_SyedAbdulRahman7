package day10;

import java.util.Scanner;

public class StarPatters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length: ");
		int len = sc.nextInt();
		
		
		System.out.println("Right half pyramid ");
		for(int i =0;i<len;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			}
		
		System.out.println("Reverse Right half pyramid ");
		for(int i =len-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			}
		
		System.out.println("K Pattern");
		for(int i =len-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			}
		
		for(int i =0;i<len;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			}
	}

}
