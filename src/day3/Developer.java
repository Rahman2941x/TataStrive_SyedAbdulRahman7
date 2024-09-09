package day3;

public class Developer extends Employee {
	
	private String Proglang;
	private int Experience;
	
	
	public Developer() {
		
	}
	
	public Developer(String ProgLang,int Experience,String name,int Id,double Salary) {
		super(name, Salary, Id);
		this.Experience=Experience;
		this.Proglang=ProgLang;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Programing Language: "+Proglang);
		System.out.println("Experien of the Employee: " + Experience);
		
	}

}
