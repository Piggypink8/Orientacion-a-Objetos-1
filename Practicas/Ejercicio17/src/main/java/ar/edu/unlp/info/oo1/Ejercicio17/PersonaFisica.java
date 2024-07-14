package ar.edu.unlp.info.oo1.Ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class PersonaFisica extends Cliente{
	private String dni;
	
	public PersonaFisica(String nombre, String direccion, String numero, double descuento, String dni) {
		super(nombre, direccion,numero,descuento);
		// TODO Auto-generated constructor stub
		this.dni = dni;
	}

	public String getDni() {
		return this.dni;
	}
	
	@Override
	public List<Llamada> obtenerLlamadasPeriodo(LocalDateTime inicio, LocalDateTime fin) {
		// a = inicio , c = fin, fecha = b;
		return super.getLlamadas().stream()
		.filter( llamada -> (llamada.getFecha().isAfter(inicio) && llamada.getFecha().isBefore(fin)))
		.collect(Collectors.toList());
	}
	
	
	

}
