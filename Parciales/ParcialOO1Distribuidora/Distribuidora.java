package ar.edu.unlp.info.oo1.ParcialOO1Distribuidora;

import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.ArrayList;

public class Distribuidora {
	private List<Pedido> pedidos;
	private List<Cliente> clientes;
	
	public Distribuidora() {
		this.pedidos = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public Cliente registrarCliente(String nombre, String email) {
		Cliente cliente = new Cliente(nombre,email);
		this.clientes.add(cliente);
		return cliente;
	}
	
	public Producto registrarProductoNacional(String nombre, double costoUnitario, String descripcion) {
		Producto producto = new ProductoNacional(nombre,costoUnitario,descripcion);
		return producto;
	}
	
	public Producto registrarProductoImportado(String nombre, double costoUnitario, String descripcion, String paisOrigen) {
		Producto producto = new ProductoImportado(nombre,costoUnitario,descripcion,paisOrigen);
		return producto;
	}
	
	public Pedido crearPedido(Cliente cliente) {
		Pedido pedido = new Pedido();
		cliente.agregarPedido(pedido);
		return pedido;
	}
	
	public Item agregarItemAPedido(Pedido pedido, Producto producto, int cantidad) {
		Item item = new Item(cantidad, producto);
		pedido.agregarItem(item);
		return item;
	}
	
	public int calcularCantidadTotalSolicitadaProducto(Producto producto) {
		return this.getPedidos().stream()
				.mapToInt(pedido -> pedido.obtenerCantidadSolicitadaProducto(producto))
				.sum();
	}

	public double calcularCostoTotalPedidosClientePeriodo(LocalDate inicio, LocalDate fin, Cliente cliente) {
		return cliente.obtenerCostoTotalPedidosPeriodo(inicio, fin);
	}
	
	public List<Cliente> obtenerTop5ClientesUltimoMes(int mes){
		return this.getClientes().stream()
				.sorted((cli1,cli2) -> Double.compare(cli1.obtenerCostoPedidosMes(mes), cli2.obtenerCostoPedidosMes(mes)))
				.limit(5).collect(Collectors.toList());
	}
}
