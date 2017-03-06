package uteevbkru;


import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class main {
	
	public static void main(String []args){	
		
		List<Product> col = new ArrayList<>();		
		col.add(new Product("Milk", 1.25));
		col.add(new Product("Tea", 2.3));
		col.add(new Product("Sugar", 0.25));
		col.add(new Product("Chocolate", 6.25));
		col.add(new Product("Milk", 1.25));
		col.add(new Product("Tea", 2.3));
		col.add(new Product("Milk", 1.25));
		
		Set<Product> sortcol = new TreeSet<>(new Comparator<Product>(){
			public int compare(Product a, Product b){
				return a.toString().compareTo(b.toString());
			}
		});
		sortcol.addAll(col);
		
		for(Product pr: sortcol){
			System.out.println("name: "+pr.getName()+"; "+"cost: "+pr.getCost());
		}
	}
}
