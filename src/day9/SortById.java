package day9;

import java.util.Comparator;

public class SortById implements Comparator<Products> {
	
	@Override
	public int compare(Products o1,Products o2) {
		return o1.getProductId()-o2.getProductId();
	}

}
