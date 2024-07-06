package ar.edu.unlp.info.oo1.ParcialOO1Veterinaria;

public class Vacuna {
	private String nombre;
	private double costo;
	
	public Vacuna(String nombre, double costo) {
		this.nombre = nombre;
		this.costo = costo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getCosto() {
		return costo;
	}
	
}
