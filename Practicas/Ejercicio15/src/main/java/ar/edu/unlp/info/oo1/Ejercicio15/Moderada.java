package ar.edu.unlp.info.oo1.Ejercicio15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements Politica {

	@Override
	public double obtenerReembolso(Reserva reserva,LocalDate fecha) {
		int dias = (int) ChronoUnit.DAYS.between(reserva.getEntrada(), fecha);
		double monto = reserva.calcularPrecio();
		
		if(dias >= 7) { 
			return monto;
		} else {
			if(dias < 7)
				monto = reserva.calcularPrecio() * 0.5;
		}
		return monto;
	
	}

}
