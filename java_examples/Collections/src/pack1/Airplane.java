package pack1;

public class Airplane {
	private int id;
	private String airline;
	private double cost;
	private float rating;
	
	
	public Airplane(int id, String airline, double cost, float rating) {
		super();
		this.id = id;
		this.airline = airline;
		this.cost = cost;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Airplane [id=" + id + ", airline=" + airline + ", cost=" + cost + ", rating=" + rating + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getairline() {
		return airline;
	}
	public void setairline(String airline) {
		this.airline = airline;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
