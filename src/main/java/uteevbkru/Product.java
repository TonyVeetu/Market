package uteevbkru;

public class Product implements Comparable<Product>{
	private String name;
	private double cost;
	private double prec = 1.10e-6;
	
	public Product(String name, double cost){
		this.name = name;
		this.cost = cost;
	}	
	public String getName(){
		return name;
	}
	public double getCost(){
		return cost;
	}
	@Override
	public int compareTo(Product a){
		
//		int rezult = name.compareTo(a.getName());
//		if(rezult != 0)
//			return rezult;
//		
//		double rez = (cost - a.getCost());
//		if(Math.abs(rez) >= prec)
//			return (int)(rez/Math.abs(rez));
//		
//		return 0;
		
		if(this.getCost() > a.getCost()){
			return 1;
		}
		else{
			if(this.getCost() == a.getCost()){
				return 0;
			}
			else{
				return -1;
			}
		}
	}
	
}
