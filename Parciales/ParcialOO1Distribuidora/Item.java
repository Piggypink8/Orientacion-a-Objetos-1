package ar.edu.unlp.info.oo1.ParcialOO1Distribuidora;

public class Item {
	private int cantidad;
	private Producto producto;
	
	public Item(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	
	public double obtenerCosto() {
		return this.getCantidad() * this.obtenerPrecioProducto();
	}
	
	private double obtenerPrecioProducto() {
		return this.getProducto().obtenerCostoConImpuesto(this.getCantidad());
	}

}
