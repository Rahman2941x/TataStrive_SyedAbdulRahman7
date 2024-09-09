package day2;

public class Student {

	
	private String Name;
	private double Grade;
	
	Student(){
		
	}
	
	Student(String Name,double Grade){
		this.Grade= Grade;
		this.Name= Name;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double Grade) {
		this.Grade = Grade;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	
	public String toString() {
		return "Name: "+Name+"\nGrade: "+Grade;
	}
	
	
}
