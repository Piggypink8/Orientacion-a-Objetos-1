package ar.edu.unlp.info.oo1.ParcialOO1Viviendas;

public class ServicioLimpieza extends Servicio {
	private double tarifaMinima;
	
	public ServicioLimpieza(double precioPorHora, int cantHoras, double tarifaMinima) {
		super(precioPorHora, cantHoras);
		this.tarifaMinima = tarifaMinima;
	}

	public double getTarifaMinima() {
		return tarifaMinima;
	}
	
	@Override
	public double calcularMonto() {
		double monto = this.getPrecioPorHora() * this.getCantHoras();
		if(monto < this.getTarifaMinima()) {
			return this.getTarifaMinima();
		}
		return monto;
	}
	
	
}
