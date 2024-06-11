package ar.edu.unlp.info.oo1.ParcialOO1TikTok;

public class Product {
	private double price;
	private String description;
	
	public Product(double price, String description) {
		this.price = price;
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public String getDescription() {
		return description;
	}
	
}
