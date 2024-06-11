package ar.edu.unlp.info.oo1.ParcialOO1MyCarBoxes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public abstract class Orden {
	private String patente;
	private ArrayList<Repuesto> repuestos;
	private LocalDate fecha;
	
	public Orden(String patente, ArrayList<Repuesto> repuestos, LocalDate fecha) {
		super();
		this.patente = patente;
		this.repuestos = repuestos;
		this.fecha = fecha;
	}

	public String getPatente() {
		return patente;
	}
	public ArrayList<Repuesto> getRepuestos() {
		return repuestos;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	
	public int obtenerAntiguedad() {
		return (int) ChronoUnit.YEARS.between(this.getFecha(), LocalDate.now()); 
	}
	
	public double obtenerCostoRepuestos() {
		return this.repuestos.stream()
				.mapToDouble(repuesto -> repuesto.obtenerCostoConGanancia())
				.sum();
	}
	
	public double calcularCosto(){
		return (this.obtenerCostoRepuestos() + this.calcularAdicional()) * 1.10;
	}
	
	public abstract double calcularAdicional();
	
	public Factura facturarOrden(double montoFinal, double descuento) {
		Factura factura = new Factura(LocalDate.now(),this.getPatente(), montoFinal, descuento);
		return factura;
	}
}
