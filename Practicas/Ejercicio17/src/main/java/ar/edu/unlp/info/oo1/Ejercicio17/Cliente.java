package ar.edu.unlp.info.oo1.Ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {

	private String nombre;
	private String direccion;
	private String numero;
	private List<Llamada> llamadas;
	private double descuento;

	public Cliente(String nombre, String direccion, String numero, double descuento) {
		// TODO Auto-generated constructor stub
		this.descuento = descuento;
		this.nombre = nombre;
		this.direccion = direccion;
		this.numero = numero;
		this.llamadas = new ArrayList<>();
	}
	
	public abstract List<Llamada> obtenerLlamadasPeriodo(LocalDateTime inicio, LocalDateTime fin);
	
	public String getNombre() {
		return this.nombre;
	}

	public String getNumero() {
		return this.numero;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public List<Llamada> getLlamadas() {
		return this.llamadas;
	}
	
	public boolean agregarLlamada(Llamada llamada) {
		return this.llamadas.add(llamada);
	}

	public double getDescuento() {
		return this.descuento;
	}
	
}
