package day2;

public class Car {
	
	private String model;
	private String make;
	private int year;

	
	public Car() {
		
	}
	public Car(String model,String make,int year) {
		this.make=make;
		this.model= model;
		this.year= year;
	}
	
	public String getModel() {
		return model;
	}
	public String getMake() {
		return make;
	}
	public int getYear() {
		return year;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	public void setMake(String make) {
		this.make=make;
	}
	public void setYear(int year) {
		this.year=year;
	}
	
	public void displayDetails() {
		
		System.out.println("Model: " +model);
		System.out.println("Year: " +year);
		System.out.println("Make: " +make);
	}
	
	
	
}
