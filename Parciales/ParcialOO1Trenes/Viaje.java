package ar.edu.unlp.info.oo1.ParcialOO1Trenes;

import java.time.LocalDate;

public class Viaje {
	private LocalDate fechaViaje;
	private int kmRodado;
	
	public Viaje(LocalDate fechaViaje, int kmRodado) {
		super();
		this.fechaViaje = fechaViaje;
		this.kmRodado = kmRodado;
	}

	public LocalDate getFechaViaje() {
		return fechaViaje;
	}

	public int getKmRodado() {
		return kmRodado;
	}
	
	
}
