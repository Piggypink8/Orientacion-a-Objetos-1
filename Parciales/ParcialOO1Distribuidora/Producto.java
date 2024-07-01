package ar.edu.unlp.info.oo1.ParcialOO1Distribuidora;

public abstract class Producto {
	private String nombre;
	private double costoUnitario;
	private String descripcion;
	
	public Producto(String nombre, double costoUnitario, String descripcion) {
		this.nombre = nombre;
		this.costoUnitario = costoUnitario;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double obtenerCostoConImpuesto(int cantidad) {
		return this.getCostoUnitario() + this.calcularImpuesto(cantidad);
	}
	
	public abstract boolean validarCantidad(int cantidad);
	
	public abstract double calcularImpuesto(int cantidad);
}
