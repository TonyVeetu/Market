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
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(prec) != Double.doubleToLongBits(other.prec))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(prec);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
}
