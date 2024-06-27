package ar.edu.unlp.info.oo1.ParcialOO1Trenes;

import java.time.LocalDate;

public class TareaRealizada {
	private Tarea tarea;
	private String descripcion;
	private LocalDate fecha;
	private Tren tren;
	
	public TareaRealizada(Tarea tarea, String descripcion, LocalDate fecha, Tren tren) {
		this.tarea = tarea;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.tren = tren;
	}

	public Tarea getTarea() {
		return tarea;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Tren getTren() {
		return tren;
	}
	
	public double obtenerCostoTarea() {
		return this.getTarea().obtenerCostoTarea(this.getTren());
	}
	
	public String obtenerMes() {
		return this.getFecha().getMonth().toString();
	}
	
}
