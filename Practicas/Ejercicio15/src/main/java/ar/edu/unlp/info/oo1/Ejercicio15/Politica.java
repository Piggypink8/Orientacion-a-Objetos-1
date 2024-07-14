package ar.edu.unlp.info.oo1.Ejercicio15;

import java.time.LocalDate;

public interface Politica {
	public double obtenerReembolso(Reserva reserva,LocalDate fecha);
}
