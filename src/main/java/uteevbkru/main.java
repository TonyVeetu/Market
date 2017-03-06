package uteevbkru;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class main {
	
	public static void main(String []args){	
		Comparator<Product> comp = new NameComparator().thenComparing(new CostComparator());
		
		List<Product> list = new ArrayList<>();		
		list.add(new Product("Milk", 1.25));
		list.add(new Product("Tea", 2.3));
		list.add(new Product("Sugar", 0.25));
		list.add(new Product("Chocolate", 6.25));
		list.add(new Product("Milk", 1.25));
		list.add(new Product("Tea", 2.3));
		list.add(new Product("Milk", 1.25));

		System.out.println("1 - Comparable");		
		Collections.sort(list);
		for(Product pr: list){
			System.out.println("name: "+pr.getName()+"; "+"cost: "+pr.getCost());
		}
//		System.out.println("2 - Comparator");
//		Set<Product> sortcol = new TreeSet<>(comp);
//		sortcol.addAll(list);		
//		for(Product pr: sortcol){
//			System.out.println("name: "+pr.getName()+"; "+"cost: "+pr.getCost());
//		}
		//
		Map<Product, Integer> map = new HashMap<>();
		for(Product pr : list){		
			if(map.containsKey(pr)){
				Integer count = map.get(pr);
				count++;
				map.put(pr, count);				
			}
			else
				map.put(pr,1);							
		}
		for(Entry<Product, Integer> pair : map.entrySet()){
			System.out.println("Name :"+pair.getKey().getName()+" ; "+"count "+pair.getValue());
		}
		
	}
}
