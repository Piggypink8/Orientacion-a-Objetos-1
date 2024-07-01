package ar.edu.unlp.info.oo1.ParcialOO1Distribuidora;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
public class Cliente {
	private String nombre;
	private String email;
	private LocalDate fechaAlta;
	private List<Pedido> pedidos;
	
	public Cliente(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.fechaAlta = LocalDate.now();
		this.pedidos = new ArrayList<>(); 
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void agregarPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}
	
	public double obtenerCostoTotalPedidosPeriodo(LocalDate inicio,LocalDate fin) {
		return this.obtenerPedidosPeriodo(inicio, fin).stream()
				.mapToDouble(pedido -> pedido.obtenerCostoTotalPedido())
				.sum();
	}
	
	public double obtenerCostoPedidosMes(int mes) {
		return this.obtenerPedidosMes(mes).stream()
				.mapToDouble(pedido -> pedido.obtenerCostoTotalPedido())
				.sum();
	}
	
	private List<Pedido> obtenerPedidosPeriodo(LocalDate inicio,LocalDate fin){
		return this.getPedidos().stream()
				.filter(pedido -> pedido.validarPeriodo(inicio, fin))
				.collect(Collectors.toList());
	}
	
	private List<Pedido> obtenerPedidosMes(int mes){
		return this.getPedidos().stream()
				.filter(pedido -> pedido.validarMes(mes))
				.collect(Collectors.toList());
	}
}
