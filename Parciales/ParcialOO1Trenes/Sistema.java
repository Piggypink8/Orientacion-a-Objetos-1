package ar.edu.unlp.info.oo1.ParcialOO1Trenes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	
	private List<Tren> trenes;
	private List<PlanMantenimiento> planes;
	private List<TareaRealizada> tareasRealizadas;
	
	public Sistema() {
		this.trenes = new ArrayList<>();
		this.planes = new ArrayList<>();
		this.tareasRealizadas = new ArrayList<>();
	}

	public List<Tren> getTrenes() {
		return trenes;
	}

	public List<PlanMantenimiento> getPlanes() {
		return planes;
	}

	public List<TareaRealizada> getTareasRealizadas() {
		return tareasRealizadas;
	}
	
	public Tren registrarTren(String nroSerie, Modelo modelo, String marca, LocalDate fechaIncorporacion, int kmInicial) {
		Tren tren = new Tren(nroSerie,modelo,marca,fechaIncorporacion,kmInicial);
		modelo.agregarTren(tren);
		this.trenes.add(tren);
		return tren;
	}
	
	public PlanMantenimiento registrarPlanMantenimiento(String version) {
		PlanMantenimiento planMantenimiento = new PlanMantenimiento(version);
		this.planes.add(planMantenimiento);
		return planMantenimiento;
	}
	
	public TareaRealizada registrarTareaRealizada(Tarea tarea, String descripcion, LocalDate fecha, Tren tren) {
		TareaRealizada tareaRealizada = new TareaRealizada(tarea,descripcion,fecha,tren);
		tren.agregarTareaRealizada(tareaRealizada);
		this.tareasRealizadas.add(tareaRealizada);
		return tareaRealizada;
	}
	
	public double obtenerCostoTareasRealizadasEnMes(String mes) {
		return this.getTareasRealizadas().stream()
				.filter(tareaRealizada -> tareaRealizada.obtenerMes().equals(mes))
				.collect(Collectors.toList())
				.stream().mapToDouble(tareaRealizada -> tareaRealizada.obtenerCostoTarea())
				.sum();
	}
	
	// ANALIZAR POSIBLE SOLUCION
	/*
	public List<PlanMantenimiento> obtener5PlanesMantenimientoMasCostosos(){
		return this.planes.stream()
				.max((plan1,plan2) -> Double.compare(plan1.obtenerCostoPlan(), plan2.obtenerCostoPlan()))
				.
	}
	*/
}
