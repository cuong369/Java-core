package system_manage_products;

public class Products {

	private String name;
	private String description;
	private float sales;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getSales() {
		return sales;
	}

	public void setSales(float sales) {
		this.sales = sales;
	}

	void wathProducts() {
		System.out.println("Name: " + name);
		System.out.println("Description: " + description);
		System.out.println("Sales: " + sales);
	}

}
