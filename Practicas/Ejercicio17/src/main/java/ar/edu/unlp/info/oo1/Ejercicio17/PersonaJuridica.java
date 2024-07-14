package ar.edu.unlp.info.oo1.Ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class PersonaJuridica extends Cliente {
	private String tipo;
	private String cuit;
	
	
	public PersonaJuridica(String nombre, String direccion, String numero, double descuento, String tipo, String cuit) {
		super(nombre, direccion,numero ,descuento);
		// TODO Auto-generated constructor stub
		this.cuit = cuit;
		this.tipo = tipo;
	}


	public String getTipo() {
		return tipo;
	}


	public String getCuit() {
		return cuit;
	}


	@Override
	public List<Llamada> obtenerLlamadasPeriodo(LocalDateTime inicio, LocalDateTime fin) {
		return super.getLlamadas().stream()
		.filter( llamada -> (llamada.getFecha().isAfter(inicio) && llamada.getFecha().isBefore(fin)))
		.collect(Collectors.toList());
	}
	
	
	
	
	
}
