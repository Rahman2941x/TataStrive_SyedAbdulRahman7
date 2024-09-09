package day2;

import java.lang.classfile.constantpool.DoubleEntry;

public class Rectangle {

	
	private double length;
	private double breath;
	
	public Rectangle() {
		
	}
	
	Rectangle(double length,double breath){
		this.length= length;
		this.breath= breath;
	}
	
	Rectangle(double length){
		this.length= length;
		breath = 1.0;
	}
	
	
	public double area() {
		return length*breath;
	}
	public String toString() {
		return "Lentth: "+ length + "\nBreath " + breath + "\nArea: "+area();
	}
	
	
	
}
