package ar.edu.unlp.info.oo1.Ejercicio15;

import java.time.LocalDate;

public class Flexible {

	public double obtenerReembolso(Reserva reserva,LocalDate fecha) {
		double monto = reserva.calcularPrecio();
		
		if(fecha.isBefore(reserva.getEntrada())) 
			return monto;
		return 0;
	
	}
}
