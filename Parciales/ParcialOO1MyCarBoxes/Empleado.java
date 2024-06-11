package ar.edu.unlp.info.oo1.ParcialOO1MyCarBoxes;

public class Empleado {
	private String nombre;
	private double valorPorHora;
	
	public Empleado(String nombre, double valorPorHora) {
		super();
		this.nombre = nombre;
		this.valorPorHora = valorPorHora;
	}

	public String getNombre() {
		return nombre;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}
	
}
