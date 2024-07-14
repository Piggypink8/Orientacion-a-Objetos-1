package ar.edu.unlp.info.oo1.Ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Interurbana extends Llamada {
	private int km;
/*
	public Interurbana(LocalDateTime fecha, int duracion, String emisor, String receptor) {
		super(fecha, duracion, emisor, receptor);
	}
*/	
	public Interurbana(LocalDateTime fecha, int duracion, String emisor, String receptor, int km) {
		super(fecha, duracion, emisor, receptor);
		// TODO Auto-generated constructor stub
		this.km = km;
	}
	
	public int getKm() {
		return this.km;
	}

	@Override
	public double calcularCosto() {
		// TODO Auto-generated method stub
		int costo = 5;
		
		if(this.getKm() < 100) {
			return costo + this.getDuracion() * 2;
		}
		
		if(this.getKm() > 100 && this.getKm() < 500) {
			return costo + this.getDuracion() * 2.5;
		}
		
		return costo + this.getDuracion() * 3;
	}
	

}
