package ar.edu.unlp.info.oo1.ParcialOO1ARBA;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class BienVehiculo extends Bien{
	private String patente;
	private LocalDate fechaFabricacion;
	private double valor;
	
	public BienVehiculo(Contribuyente contribuyente, String patente, LocalDate fechaFabricacion, double valor) {
		super(contribuyente);
		this.patente = patente;
		this.fechaFabricacion = fechaFabricacion;
		this.valor = valor;
	}

	public String getPatente() {
		return patente;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public double obtenerCosto() {
		return this.getValor();
	}
	
	public int obtenerAnios() {
		return (int) ChronoUnit.YEARS.between(this.getFechaFabricacion(), LocalDate.now());

	}
	
	public boolean validarAntiguedad() {
		return this.obtenerAnios() > 10;
	}
	
	@Override
	public double obtenerImpuestos() {
		if(this.validarAntiguedad()) {
			return 0;
		}
		return 0.05;
	}
}
