package day2;

public class CarMain {
	public static void main(String[] args) {
		Car c = new Car();
		c.setYear(2003);
		c.setModel("yamaha");
		c.setMake("Yamaha Company");
		c.displayDetails();
		
		System.out.println();
		
		 c = new Car();
		c.setYear(2016);
		c.setModel("Hornet");
		c.setMake("Honda Company");
		c.displayDetails();
	}

}
