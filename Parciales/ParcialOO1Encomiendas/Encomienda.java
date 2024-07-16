package ar.edu.unlp.info.oo1.ParcialOO1Encomiendas;

import java.time.LocalDate;

public class Encomienda {
	private LocalDate fechaDespacho;
	private String destino;
	private Paquete paquete;
	
	public Encomienda(LocalDate fechaDespacho, String destino, Paquete paquete) {
		this.fechaDespacho = fechaDespacho;
		this.destino = destino;
		this.paquete = paquete;
	}

	public LocalDate getFechaDespacho() {
		return fechaDespacho;
	}

	public String getDestino() {
		return destino;
	}

	public Paquete getPaquete() {
		return paquete;
	}
	
	public void agregarProducto(Producto producto) {
		this.paquete.agregarProducto(producto);
	}
	
	public boolean validarEncomienda() {
		return this.getPaquete().validarProductos();
	}
}

