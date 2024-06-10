package ar.edu.unlp.info.oo1.ParcialOO1ARBA;

public abstract class Bien {
	private Contribuyente contribuyente;
	
	public Bien(Contribuyente contribuyente) {
		this.contribuyente = contribuyente;
	}

	public Contribuyente getContribuyente() {
		return contribuyente;
	}
	
	public double calcularImpuestos(){
		return this.obtenerImpuestos() * this.obtenerCosto();
	}
	
	public abstract double obtenerCosto();
	public abstract double obtenerImpuestos();
	
}
