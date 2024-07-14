package ar.edu.unlp.info.oo1.Ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Llamada {
	private LocalDateTime fecha;
	private int duracion;
	private String emisor;
	private String receptor;
	
	
	public Llamada(LocalDateTime fecha, int duracion, String emisor, String receptor) {
		this.fecha = fecha;
		this.duracion = duracion;
		this.emisor = emisor;
		this.receptor = receptor;
	}


	public LocalDateTime getFecha() {
		return this.fecha;
	}


	public int getDuracion() {
		return this.duracion;
	}


	public String getEmisor() {
		return this.emisor;
	}


	public String getReceptor() {
		return this.receptor;
	}
	
	public abstract double calcularCosto();
	
}
