package ar.edu.unlp.info.oo1.ParcialOO1Veterinaria;

public class ServicioGuarderia extends Servicio{
	private int cantDias;
	
	public ServicioGuarderia(Mascota mascota, int cantDias) {
		super(mascota);
		this.cantDias = cantDias;
	}

	public int getCantDias() {
		return cantDias;
	}

	@Override
	public double calcularMonto() {
		return (this.getCostoDiario() * this.getCantDias()) - this.calcularDescuento();
	}
	
	public double getCostoDiario() {
		return 500;
	}
	
	public double calcularDescuento() {
		if(this.validarDescuento()) {
			return this.getCostoDiario() * 0.10;
		}
		return 0;
	}
	
	public boolean validarDescuento() {
		return this.getMascota().validarDescuento(this.getFechaAtencion());
	}
	
}
