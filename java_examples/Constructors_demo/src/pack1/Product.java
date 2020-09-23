package pack1;

public class Product {
	private int id;
	private String name;
	private int rating;
	private double cost;
	
	
	
	public Product(int id, String name, double cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public Product(int id, String name, int rating, double cost) {
		this(id,name,cost);
		this.rating = rating;
		
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", rating=" + rating + ", cost=" + cost + "]";
	}
	
	
	
}
