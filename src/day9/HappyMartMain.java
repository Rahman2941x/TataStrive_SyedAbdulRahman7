package day9;

import java.util.Arrays;

public class HappyMartMain {
	public static void main(String[] args) {
		Products[] product = { new Products(723, "IPhone", 50000.0), new Products(221, "IPhone", 40000.0),
				new Products(223, "Oppo", 35000), new Products(332, "Poco", 45000), new Products(7721, "IQ", 20000) };

		// Implement anonymous class in the
		System.out.println("By Name using Anonymous class");
		Arrays.sort(product, Products.SortByName);
		for (Products p : product) {
			System.out.println(p);
		}

		// Using Lamda Expression
		System.out.println("By Price using Lamda Function");
		Arrays.sort(product, (o1, o2) -> Integer.compare(o1.getProductId(), o2.getProductId()));
		for (Products p : product) {
			System.out.println(p);
		}

		System.out.println("By Id overriding the seprate interface");
		Arrays.sort(product, new SortById());
		for (Products p : product) {
			System.out.println(p);
		}

		System.out.println("----------------------");
		System.out.println("By Comparable by Natural Sorting");
		Arrays.sort(product);
		for (Products p : product) {
			System.out.println(p);
		}
	}

}
