package ar.edu.unlp.info.oo1.Ejercicio12;

public abstract class Pieza {
	private String material;
	private String color;
	
	public String getMaterial() {
		return this.material;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public abstract double getVolumen();
	public abstract double getSuperficie();
}
