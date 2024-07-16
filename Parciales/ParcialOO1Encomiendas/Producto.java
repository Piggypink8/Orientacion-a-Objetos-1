package ar.edu.unlp.info.oo1.ParcialOO1Encomiendas;

public class Producto {
	private String descripcion;
	private int peso;
	private int volumen;
	
	public Producto(String descripcion, int peso, int volumen) {
		this.descripcion = descripcion;
		this.peso = peso;
		this.volumen = volumen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getPeso() {
		return peso;
	}

	public int getVolumen() {
		return volumen;
	}
	
	
}
