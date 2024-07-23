package ar.edu.unlp.info.oo1.ParcialOO1Viviendas;

import java.time.LocalDate;

public abstract class Contrato {
	private LocalDate fecha;
	private Servicio servicio;
	private Cliente cliente;
	
	public Contrato(LocalDate fecha, Servicio servicio, Cliente cliente) {
		this.fecha = fecha;
		this.servicio = servicio;
		this.cliente = cliente;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public boolean validarFecha() {
		DayOfWeek hoy = DayOfWeek.from(LocalDate.now());
		return  hoy.equals(DayOfWeek.SATURDAY) || hoy.equals(DayOfWeek.SUNDAY);
	}
	
	public double obtenerRecargoFecha() {
		if(this.validarFecha()) {
			return this.obtenerMontoServicio() * 1.15;
		}
		return 0;
	}
	
	public double obtenerMonto() {
		return this.obtenerMontoServicio() + this.calcularAdicional() + this.obtenerRecargoFecha();
	}
	
	public abstract double calcularAdicional();
	
	public double obtenerMontoServicio() {
		return this.getServicio().obtenerMonto();
	}
}
