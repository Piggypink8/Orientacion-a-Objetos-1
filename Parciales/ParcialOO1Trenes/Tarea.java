package ar.edu.unlp.info.oo1.ParcialOO1Trenes;

import java.util.ArrayList;
import java.util.List;

public abstract class Tarea {
	private String id;
	private int tiempo;
	private double costoBase;
	private List<Repuesto> repuestos;
	
	public Tarea(String id, int tiempo, double costoBase) {
		super();
		this.id = id;
		this.tiempo = tiempo;
		this.costoBase = costoBase;
		this.repuestos = new ArrayList<>();
	}

	public String getId() {
		return id;
	}

	public int getTiempo() {
		return tiempo;
	}

	public double getCostoBase() {
		return costoBase;
	}

	public List<Repuesto> getRepuestos() {
		return repuestos;
	}
	
	public void agregarRepuesto(Repuesto repuesto) {
		this.repuestos.add(repuesto);
	}
	
	public double obtenerCostoTarea(Tren tren) {
		return this.obtenerCostoRepuestos() + this.calcularAdicional(tren) + this.getCostoBase();
	}
	
	protected double obtenerCostoRepuestos() {
		return this.getRepuestos().stream()
			.mapToDouble(repuesto -> repuesto.getCosto())
			.sum();
	}
	
	protected abstract double calcularAdicional(Tren tren);
	
	
	
}
