package collection;

public class Product implements Comparable<Product> {// tree set

	private int pid;
	private String name;
	private double price;
	private String category;

	public Product() {
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Product(int pid, String name, double price, String category) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.category = category;
	}

//	@Override
//	public int compareTo(Object obj) {
//		Product p = (Product) obj; // down cast needed 
//		if (this.pid > p.pid) {
//			return 1;
//		} else if (this.pid < p.pid) {
//			return -1;
//
//		}
//		return 0;
//		return this.name.compareTo(p.name);
//	}
	public int compareTo(Product p) {
		return this.name.compareTo(p.name);// no down cast needed 
	}

}
