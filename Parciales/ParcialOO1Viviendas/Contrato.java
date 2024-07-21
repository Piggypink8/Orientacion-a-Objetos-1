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
	
	
}
