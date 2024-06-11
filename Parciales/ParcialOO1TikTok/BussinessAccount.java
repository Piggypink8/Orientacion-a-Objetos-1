package ar.edu.unlp.info.oo1.ParcialOO1TikTok;

import java.util.ArrayList;

public class BussinessAccount extends Account{

	private String contactNumber;
	private ArrayList<Product> products;
	
	public BussinessAccount(ArrayList<Sound> sounds, String contactNumber, ArrayList<Product> products) {
		super(sounds);
		this.contactNumber = contactNumber;
		this.products = products;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}
	
	public Product addProduct(double price, String description) {
		Product product = new Product(price, description);
		this.products.add(product);
		return product;
	}
	
	public double calculateProductsPriceAmount() {
		return this.products.stream()
				.mapToDouble(product -> product.getPrice())
				.sum();
	}
	
	
}
