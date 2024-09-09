package day1;

import java.util.*;
public class Bmi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter weight in kg: ");
		double weight = sc.nextDouble();
		if(weight <=0) {
			System.out.println("invalid input");
			return;
		}
		
		System.out.println("Enter height in cm");
		double height = sc.nextDouble();
		if(weight<=0) {
			System.out.println("invalid input");
			return;
		}
		
		double BMI = weight/((height/100)*(height/100));
		
		
		if(BMI<=18.5) {
			System.out.printf("your BMI is : %.2f \n",BMI);
			System.out.println("You are underweight");
			System.out.printf("you need to gain Atleast %.2f", (18.5-BMI));
			return;
		}
		else if(BMI>=25) {
			System.out.printf("your BMI is : %.2f \n",BMI);
			System.out.println("You are overweight");
			System.out.printf("you need to reduce Atleast %.2f", (BMI - 25));
			return;
		}
		else {
			System.out.printf("your BMI is : %.2f \n",BMI);
			System.out.println("your fit!!!!!");
		}
		
		
	}

}
