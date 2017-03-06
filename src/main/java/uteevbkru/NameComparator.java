package uteevbkru;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {
	public int compare(Product a, Product b){
		return a.getName().compareTo(b.getName());
	}

	public Comparator<Product> thenComparing(CostComparator costComparator) {
		// TODO Auto-generated method stub
		return null;
	}
}

