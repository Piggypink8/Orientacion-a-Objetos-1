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

	@Override
	public double calcularMonto() {
		return this.getPrecioPorHora() * this.getCantHoras() + this.calcularCostoMaquinas();
	}
	
	private double calcularCostoMaquinas() {
		return this.getCostoMantenimiento() * this.getCantMaquinas();
	}
}
