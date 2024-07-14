package ar.edu.unlp.info.oo1.Ejercicio8;

import java.time.LocalDate;

public class Consumo {
	private LocalDate fecha = LocalDate.now();
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo(LocalDate fecha, double consumoEnergiaActiva, double consumoEnergiaReactiva) {
		// TODO Auto-generated constructor stub
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	public double costoEnBaseA(double precioKWh) {
		double monto = this.consumoEnergiaActiva * precioKWh;
		
		if(this.factorDePotencia() > 0.8) {
			monto += monto * 0.10;
		}
		return monto;
	}
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public double factorDePotencia() {
		return this.consumoEnergiaActiva/(Math.sqrt(
				  Math.pow(this.consumoEnergiaActiva,2)
				+ Math.pow(this.consumoEnergiaReactiva,2)
				));
	
	}

	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}

	public void setConsumoEnergiaActiva(double consumoEnergiaActiva) {
		this.consumoEnergiaActiva = consumoEnergiaActiva;
	}

	public double getConsumoEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}

	public void setConsumoEnergiaReactiva(double consumoEnergiaReactiva) {
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
	
}
