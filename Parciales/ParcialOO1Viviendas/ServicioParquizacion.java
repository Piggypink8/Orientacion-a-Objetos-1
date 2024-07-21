package ar.edu.unlp.info.oo1.ParcialOO1Viviendas;

public class ServicioParquizacion extends Servicio {

	private int cantMaquinas;
	private double costoMantenimiento;
	
	public ServicioParquizacion(double precioPorHora, int cantHoras, int cantMaquinas, double costoMantenimiento) {
		super(precioPorHora, cantHoras);
		this.cantMaquinas = cantMaquinas;
		this.costoMantenimiento = costoMantenimiento;
	}

	public int getCantMaquinas() {
		return cantMaquinas;
	}

	public double getCostoMantenimiento() {
		return costoMantenimiento;
	}
	
}
