package ar.edu.unlp.info.oo1.Ejercicio14;

import java.time.LocalDate;

public interface DateLapseInterface {
	public int sizeInDays();
	public boolean includesDate(LocalDate other);
	public LocalDate getFrom();
	
}
