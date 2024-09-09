package day3;

public class Employee {
	
	private String Name;
	private double Salary;
	private int Id;
	
	public Employee()
	{
		
	}
	
	public Employee(String Name,double Salary,int Id) {
		this.Id =Id;
		this.Name = Name;
		this.Salary=Salary;
	}
	
	
	public void displayInfo() {
		System.out.println("Name: "+Name);
		System.out.println("Id: "+Id);
		System.out.println("Salary: "+ Salary);
		
	}

}
