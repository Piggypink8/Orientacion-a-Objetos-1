package ar.edu.unlp.info.oo1.ParcialOO1Trenes;

import java.util.ArrayList;
import java.util.List;

public class PlanMantenimiento {
	private String version;
	private List<Modelo> modelos;
	private List<Tarea> tareas;
	
	public PlanMantenimiento(String version) {
		super();
		this.version = version;
		this.modelos = new ArrayList<>();
		this.tareas = new ArrayList<>();
	}

	public String getVersion() {
		return version;
	}

	public List<Modelo> getModelos() {
		return modelos;
	}

	public List<Tarea> getTareas() {
		return tareas;
	}
	
	public void agregarTarea(Tarea tarea) {
		this.tareas.add(tarea);
	}
	
	public double obtenerCostoPlanMantenimiento() {
		return this.modelos.stream()
			.mapToDouble(modelo -> modelo.calcularCostoPlanMantenimiento())
			.sum();
	}
	
	public double calcularCostoTareasPlanMantenimiento(Tren tren) {
		return this.tareas.stream()
			.mapToDouble(tarea -> tarea.obtenerCostoTarea(tren))
			.sum();
	}
}
