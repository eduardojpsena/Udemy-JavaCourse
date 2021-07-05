package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return "Product: "
				+ name
				+ " - $ "
				+ String.format("%.2f", price) 
				+ ", "
				+ quantity
				+ " units, Total in stock: $ "
				+ String.format("%.2f", totalValueInStock());
	}
	
}
