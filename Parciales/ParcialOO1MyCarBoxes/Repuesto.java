package ar.edu.unlp.info.oo1.ParcialOO1MyCarBoxes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Repuesto {
	private String nombre;
	private LocalDate fechaFabricacion;
	private double costo;
	
	public Repuesto(String nombre, LocalDate fechaFabricacion, double costo) {
		super();
		this.nombre = nombre;
		this.fechaFabricacion = fechaFabricacion;
		this.costo = costo;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public double getCosto() {
		return costo;
	}
	
	public int obtenerAnios() {
		return (int) ChronoUnit.YEARS.between(this.getFechaFabricacion(), LocalDate.now()); 
	}
	
	public double obtenerCostoConGanancia() {
		
		if(this.obtenerAnios() > 5) {
			return this.getCosto() * 1.08;
		}
		
		return this.getCosto() * 1.15;
	}
		
}
