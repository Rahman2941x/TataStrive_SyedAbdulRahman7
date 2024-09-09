package day6;

public class Hosteller extends Student {

	private int roomNumber;
	private char blockName;
	private String roomType;
	double totalFees=0;

	public Hosteller() {

	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public char getBlockName() {
		return blockName;
	}

	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public Hosteller(int studentId, String studentName, String department, String gender, String category,
			double collegeFee,int roonNumber,char blockName,String roomType) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.blockName=blockName;
		this.roomNumber=roonNumber;
		this.roomType=roomType;
	}

	@Override
	public double calculateTotalFee() {

		
		if (blockName == 'A' && roomType == "AC") {
			totalFees = totalFees + 60000 + 8000 + getCollegeFee();
			return totalFees;
		} else if (blockName == 'A') {
			totalFees = totalFees + 60000 + getCollegeFee();
			return totalFees;
		}

		if (blockName == 'B' && roomType == "AC") {
			totalFees = totalFees + 50000 + 5000 + getCollegeFee();
			return totalFees;
		} else if (blockName == 'B') {
			totalFees = totalFees + 50000 + getCollegeFee();
			return totalFees;
		}

		if (blockName == 'C' && roomType == "AC") {
			totalFees = totalFees + 40000 + 2500 + getCollegeFee();
			return totalFees;
		} else if (blockName == 'C') {
			totalFees = totalFees + 40000 + getCollegeFee();
			return totalFees;
		}

		return 0;
	}

}
