package day4;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		
		CustomerDetails customer = new CustomerDetails();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Customer Name: ");
		customer.setCustomerName(sc.nextLine());
		
		System.out.println("Enter the Customer Phone Number: ");
		customer.setPhoneNumber(sc.nextLine());
		
		System.out.println("Enter the Street Name: ");
		customer.setStreetName(sc.nextLine());
		
		System.out.println("Enter the Bill  Amount: ");
		customer.setBillAmount(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("Enter the Delivery Distance: ");
		customer.setDistance(sc.nextInt());
		
		customer.DisplayDetails();
		
sc.close();
	}

}
