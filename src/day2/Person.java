package day2;

public class Person {
	
	private String Name;
	private int Age;
	
	
	public Person() {
		
	}
	
	public Person(String Name,int Age) {
		this.Age=Age;
		this.Name=Name;
		
		if(Age<=0) {
			System.out.println("Invalid Input");
			this.Age=0;
			return;
		}
	}
	
	public boolean isAdult() {
		if(Age>=18) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		if(isAdult()==true) {
			return "Name: "+Name +"\nAge: "+Age +"\nis Adult";
		}
		return "Name: "+Name +"\nAge: "+Age +"\nis not Adult";
	}
	
	

}
