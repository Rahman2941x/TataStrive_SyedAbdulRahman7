package day6;

public class Dayscholler extends Student {
	private int busNumber;
	private float distance;
	double totalFees = 0;

	
	public Dayscholler() {
		
	}
	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public double getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(double totalFees) {
		this.totalFees = totalFees;
	}
	
	public Dayscholler(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int busNumber, float distance) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.busNumber = busNumber;
		this.distance = distance;
		
	}

	@Override
	public double calculateTotalFee() {

		if (distance > 30 && distance <= 40) {
			totalFees = totalFees + 28000 + getCollegeFee();
			return totalFees;
		} else if (distance > 20 && distance <= 30) {
			totalFees = totalFees + 20000 + getCollegeFee();
			return totalFees;
		} else if (distance > 10 && distance <= 20) {
			totalFees = totalFees + 12000 + getCollegeFee();
			return totalFees;
		} else if (distance <= 10) {
			totalFees = totalFees + 6000 + getCollegeFee();
			return totalFees;
		}
		return 0;
	}

}
