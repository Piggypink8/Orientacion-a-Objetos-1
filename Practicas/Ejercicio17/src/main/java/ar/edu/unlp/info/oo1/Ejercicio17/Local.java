package ar.edu.unlp.info.oo1.Ejercicio17;

import java.time.LocalDateTime;

public class Local extends Llamada{

	public Local(LocalDateTime fecha, int duracion, String emisor, String receptor) {
		super(fecha, duracion, emisor, receptor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularCosto() {
		return (double) super.getDuracion();
	}

}
