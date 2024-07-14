package ar.edu.unlp.info.oo1.Ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Factura {
	private Cliente cliente;
	private LocalDateTime inicio;
	private LocalDateTime fin;
	private LocalDate facturacion;
	private double montoTotal;
	private List<Llamada> llamadas;
	
	
	public Factura(Cliente cliente, LocalDateTime inicio, LocalDateTime fin, double montoTotal, List<Llamada> llamadas) {
		this.cliente = cliente;
		this.inicio = inicio;
		this.fin = fin;
		this.facturacion = LocalDate.now();
		this.montoTotal = montoTotal;
		this.llamadas = llamadas;
	}


	public Cliente getCliente() {
		return this.cliente;
	}


	public LocalDateTime getInicio() {
		return this.inicio;
	}


	public LocalDateTime getFin() {
		return this.fin;
	}


	public LocalDate getFacturacion() {
		return this.facturacion;
	}


	public double getMontoTotal() {
		return this.montoTotal;
	}


	public List<Llamada> getLlamadas() {
		return this.llamadas;
	}
	
	
	
	
	
}
