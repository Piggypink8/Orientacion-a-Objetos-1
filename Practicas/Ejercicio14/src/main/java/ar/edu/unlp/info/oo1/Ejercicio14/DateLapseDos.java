package ar.edu.unlp.info.oo1.Ejercicio14;

import java.time.LocalDate;
public class DateLapseDos implements DateLapseInterface {
	
    	private LocalDate from;
		private int sizeInDays;
		
		public DateLapseDos(LocalDate from, int sizeInDays){
			this.from = from;
			this.sizeInDays = sizeInDays;
		}
		
		public LocalDate getTo(){
			return this.from.plusDays(this.sizeInDays);
		}

		//“Retorna la fecha de inicio del rango”
		public LocalDate getFrom() {
			return this.from;
		}
		
		//“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
		public int sizeInDays() {
			return this.sizeInDays; 
		}
		
		
		//“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to
		//del receptor y false en caso contrario”.
		public boolean includesDate(LocalDate other) {
			if(this.getFrom().isBefore(other))
				return this.getTo().isAfter(other);
			return false;
		}

}
