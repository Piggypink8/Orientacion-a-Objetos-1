package ar.edu.unlp.info.oo1.Ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SistemaTelefonica {
	private List<Llamada> llamadas;
	private List<String> numeros;
	private List<Cliente> clientes;
	
	public SistemaTelefonica() {
		this.llamadas = new ArrayList<>();
		this.numeros = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public List<Llamada> getLlamadas() {
		return this.llamadas;
	}
	
	public boolean agregarCliente(Cliente cliente) {
		return this.clientes.add(cliente);
	}
	
	public boolean agregarNumero(String numero) {
		return this.numeros.add(numero);
	}
	
	public void eliminarNumero(){
		this.numeros.removeFirst();
	}
	
	public String obtenerNumero() {
		return this.numeros.getFirst();
	}
	

	public List<String> getNumeros() {
		return this.numeros;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}
	
	public Llamada registrarLocal(LocalDateTime fecha, int duracion, String emisor, String receptor) {

		Llamada llamada = new Local(fecha, duracion, emisor, receptor);

		agregarLlamada(llamada);  
		
		Cliente clienteEmisor = this.buscarEmisor(emisor);
		clienteEmisor.agregarLlamada(llamada);
		
		return llamada;
		
	}
	
	// Como convertir una llamada interurbana, local... a un solo metodo que unifique los 3?
	// CREO LA LLAMADA U EL REGISTRAR LLAMADA LA ESTABLECE
	public Llamada registrarInterurbana(LocalDateTime fecha, int duracion, String emisor, String receptor, int km) {

		Llamada llamada = new Interurbana(fecha, duracion, emisor, receptor, km);

		agregarLlamada(llamada); 
		
		Cliente clienteEmisor = this.buscarEmisor(emisor);
		clienteEmisor.agregarLlamada(llamada);
		
		return llamada;
		
	}
	
	private Cliente buscarEmisor(String emisor) {
		return this.clientes.stream()
				.filter( cliente -> cliente.getNumero().startsWith(emisor))
				.findFirst().orElse(null);
	}
	
	
	public boolean agregarLlamada(Llamada llamada) {
		return this.llamadas.add(llamada);
	}

	
	public Cliente matricularPersonaFisica(String nombre, String direccion, String dni, double descuento){
		Cliente cliente = new PersonaFisica(nombre, direccion,this.obtenerNumero(), descuento, dni);
		this.eliminarNumero();
		this.agregarCliente(cliente);
		return cliente;
	}
	
	public Cliente matricularPersonaJuridica(String nombre, String direccion, double descuento, String tipo, String cuit){
		Cliente cliente = new PersonaJuridica(nombre, direccion, this.obtenerNumero(), descuento, tipo, cuit);
		this.eliminarNumero();
		this.agregarCliente(cliente);
		return cliente;
	}
	
	public Factura facturarCliente(Cliente cliente, LocalDateTime inicio, LocalDateTime fin) {
		List<Llamada> llamadasPeriodo = cliente.obtenerLlamadasPeriodo(inicio, fin);
		Factura factura = null;
		double monto = 0;
	
		if(llamadasPeriodo != null) {
			monto = llamadasPeriodo.stream().mapToDouble(llamada -> llamada.calcularCosto()).sum();
			monto -= monto * cliente.getDescuento();
			factura = new Factura(cliente, inicio, fin, monto, llamadasPeriodo);
		}
		return factura;
	}
	
	
}
