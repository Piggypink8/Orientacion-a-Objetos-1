package ar.edu.unlp.info.oo1.ParcialOO1Veterinaria;

import java.time.LocalDate;

public abstract class Servicio {
	private Mascota mascota;
	private LocalDate fechaAtencion;

	public Servicio(Mascota mascota) {
		this.mascota = mascota;
		this.fechaAtencion = LocalDate.now();
	}

	public Mascota getMascota() {
		return mascota;
	}

	public LocalDate getFechaAtencion() {
		return fechaAtencion;
	}
	
	public double obtenerCosto() {
		return this.calcularMonto();
	}
	
	protected abstract double calcularMonto();
}
