package ar.edu.unlp.info.oo1.ParcialOO1Distribuidora;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pedido {
	private LocalDate fecha;
	private List<Item> items;
	
	public Pedido() {
		this.items = new ArrayList<>();
		this.fecha = LocalDate.now();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public List<Item> getItems() {
		return items;
	}

	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public boolean validarPeriodo(LocalDate inicio, LocalDate fin) {
		return inicio.isBefore(this.getFecha()) && fin.isAfter(this.getFecha());
	}
	
	public boolean validarMes(int mes) {
		return this.getFecha().getMonthValue() == mes;
	}
	
	public double obtenerCostoTotalPedido() {
		return this.getItems().stream()
				.mapToDouble(item -> item.obtenerCosto())
				.sum();
	}

	public int obtenerCantidadSolicitadaProducto(Producto producto) {
		return this.obtenerItemsConProductoIgualA(producto).stream()
				.mapToInt(item -> item.getCantidad())
				.sum();
	}
	
	private List<Item> obtenerItemsConProductoIgualA(Producto producto){
		return this.getItems().stream()
				.filter(item -> item.equals(producto))
				.collect(Collectors.toList());
	}

}
