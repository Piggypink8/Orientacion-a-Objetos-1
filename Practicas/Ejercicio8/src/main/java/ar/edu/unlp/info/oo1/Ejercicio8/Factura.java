package ar.edu.unlp.info.oo1.Ejercicio8;

import java.time.LocalDate;

public class Factura {
	private Usuario usuario;
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	
	public Factura(double montoEnergiaActiva, double descuento, Usuario usuario) {
		// TODO Auto-generated constructor stub
		this.usuario = usuario;
		this.fecha = LocalDate.now();
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.descuento = descuento;
	}

	public double montoTotal() {
		return  this.montoEnergiaActiva * (1 - this.descuento / 100);
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	public double getMontoEnergiaActiva() {
		return this.montoEnergiaActiva;
	}
	public LocalDate getFecha() {
		return this.fecha;
	}
	public double getDescuento() {
		return this.descuento;
	}
}
