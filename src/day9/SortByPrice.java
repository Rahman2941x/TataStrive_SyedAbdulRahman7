package day9;

import java.util.Comparator;

public class SortByPrice implements Comparator<Products> {

	@Override
	public int compare(Products o1, Products o2) {
		return Double.compare(o1.getPrice(), o2.getPrice());

	}

}
