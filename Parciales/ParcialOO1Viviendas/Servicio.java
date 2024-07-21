package ar.edu.unlp.info.oo1.ParcialOO1Viviendas;

public abstract class Servicio {
	private double precioPorHora;
	private int cantHoras;
	
	public Servicio(double precioPorHora, int cantHoras) {
		this.precioPorHora = precioPorHora;
		this.cantHoras = cantHoras;
	}

	public double getPrecioPorHora() {
		return precioPorHora;
	}


	public int getCantHoras() {
		return cantHoras;
	}
	
	
	
}
