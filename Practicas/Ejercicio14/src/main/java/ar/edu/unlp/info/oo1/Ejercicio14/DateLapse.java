package ar.edu.unlp.info.oo1.Ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


//Consultar tarea 2 de como diseñar casos de prueba
public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to){
		this.from = from;
		this.to = to;
	}

	//“Retorna la fecha de inicio del rango”
	public LocalDate getFrom() {
		return this.from;
	}
	
	//“Retorna la fecha de fin del rango”
	public LocalDate getTo() {
		return this.to;
	}
	
	//“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(this.getFrom(), this.getTo());
	}
	
	
	//“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to
	//del receptor y false en caso contrario”.
	public boolean includesDate(LocalDate other) {
		if(this.getFrom().isBefore(other))
			return this.getTo().isAfter(other);
		return false;
	}
	

	
}
