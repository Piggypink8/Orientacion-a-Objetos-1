package ar.edu.unlp.info.oo1.ParcialOO1Trenes;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
	private PlanMantenimiento plan;
	private String nombre;
	private List<Tren> trenes;
	
	public Modelo(PlanMantenimiento plan, String nombre) {
		super();
		this.plan = plan;
		this.nombre = nombre;
		this.trenes = new ArrayList<>();
	}

	public PlanMantenimiento getPlan() {
		return plan;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void agregarTren(Tren tren) {
		this.trenes.add(tren);
	}
	
}
