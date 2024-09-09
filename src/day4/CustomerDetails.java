package day4;

public class CustomerDetails implements BonusPoints, DoorDelivery {

	private String customerName;
	private String phoneNumber;
	private String streetName;
	private double billAmount;
	private int distance;
	

	public CustomerDetails() {

	}

	public CustomerDetails(String customerName, String phoneNumber, String streetName, double billAmount,
			int distance) {
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.streetName = streetName;
		this.billAmount = billAmount;
		this.distance = distance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public double deliveryCharge() {
		
		if(distance>=25) {
			 return distance*8;
		}
		else if(distance>=15 && distance <25) {
			return distance*5;
		}
		else if (distance <15) {
			return distance*2;
		}

		return 0;
	}

	public double calculateBonusPoints() {
		if(billAmount>=250) {
			 return  billAmount/10;	
		}
		return 0;
		
	}
	
	public void DisplayDetails() {
		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer Phone  number: " +phoneNumber);
		System.out.println("Customer Street: "+ streetName);
		System.out.println("Bill Details: "+billAmount);
		System.out.println("Distance to delivery: "+distance + " km");
		System.out.println("Your delivery Charge : "+deliveryCharge());
		System.out.println("Your Bonus point: " + calculateBonusPoints());
	}
	
}
