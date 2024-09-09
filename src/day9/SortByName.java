package day9;

import java.util.Comparator;

public class SortByName implements Comparator<Products> {

	@Override
	public int compare(Products o1, Products o2) {

		if (o1.getProductName().compareTo(o2.getProductName()) != 0) {
			return o1.getProductName().compareTo(o2.getProductName());
		} else
			return o1.getProductId() -o2.getProductId();

	}

}