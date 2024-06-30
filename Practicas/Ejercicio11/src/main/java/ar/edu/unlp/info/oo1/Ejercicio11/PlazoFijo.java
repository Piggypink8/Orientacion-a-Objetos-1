package ar.edu.unlp.info.oo1.Ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversiones{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		super();
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	
	

	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}



	public void setFechaDeConstitucion(LocalDate fechaDeConstitucion) {
		this.fechaDeConstitucion = fechaDeConstitucion;
	}



	public double getMontoDepositado() {
		return montoDepositado;
	}



	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}



	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}



	public void setPorcentajeDeInteresDiario(double porcentajeDeInteresDiario) {
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}



	@Override
	public double valorActual() {
		return this.montoDepositado + this.porcentajeDeInteresDiario *
				ChronoUnit.DAYS.between(LocalDate.now(), this.fechaDeConstitucion); 
	}
}
