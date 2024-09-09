package day6;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student Ht = new Hosteller();
		Student Ds = new Dayscholler();
		Student st = Ht;

		System.out.println("Enter the Student Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the student Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the Student Department: ");
		String dept = sc.nextLine();
		
		System.out.println("ENter the Student Gander: ");
		String gander = sc.nextLine();
		
		System.out.println("Student College Fees: ");
		double collgeFees = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Select the Student Category: ");
		String cat = sc.nextLine();
		
		if (cat.equals("Hosteller")) {
			System.out.println("Enter the Room number");
			int roomNo = sc.nextInt();
			System.out.println("Enter the block Name");
			char blockName = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Enter the Room Type");
			String roomtype = sc.nextLine();

			st = new Hosteller(id, name, dept, gander, "Hosteller", collgeFees, roomNo, blockName, roomtype);
			
			System.out.println("total fees" + st.calculateTotalFee());
		}
		
		else if (cat.equals("DaysScholler")) {
			System.out.println("Enter the Bus Number");
			int busNum =sc.nextInt();
			System.out.println("Enter the KM");
			float km = sc.nextFloat();
			
			st = new Dayscholler(id, name, dept, gander,"Days Scholler",collgeFees, busNum, km);
			System.out.println("total fees" + st.calculateTotalFee());
		}
		else
			System.out.println("Wrong");
		
	}

}
