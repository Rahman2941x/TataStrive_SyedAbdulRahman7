package day9;

import java.util.Comparator;

public class Products  implements Comparable<Products>{
	private int productId;
	private String productName;
	private double price;

	public Products() {

	}

	public Products(int peoductId, String productName, double price) {
		this.productId = peoductId;
		this.price = price;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	
	
	
	
	public static Comparator<Products> SortByName = new  Comparator<Products>(){

		@Override
		public int compare(Products o1, Products o2) {
		if (o1.getProductName().compareTo(o2.getProductName()) != 0) {
			return o1.getProductName().compareTo(o2.getProductName());
		} else
			return o1.getProductId() -o2.getProductId();}
	};

	@Override
	public String toString() {
		return "Products [ productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Products p) {
	 return Integer.compare(this.productId, p.productId);
}
	
	}	

	
	


