package ar.edu.unlp.info.oo1.ParcialOO1MyCarBoxes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reparacion extends Orden {

	private String descripcion;
	private ArrayList<Empleado> empleados;
	private int cantHoras;
	
	public Reparacion(String patente, ArrayList<Repuesto> repuestos, LocalDate fecha, String descripcion,
			ArrayList<Empleado> empleados, int cantHoras) {
		super(patente, repuestos, fecha);
		this.descripcion = descripcion;
		this.empleados = empleados;
		this.cantHoras = cantHoras;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public int getCantHoras() {
		return cantHoras;
	}

	public double calcularCostoEmpleados() {
		return this.getCantHoras() * this.empleados.stream()
				.mapToDouble(empleado -> empleado.getValorPorHora())
				.sum();
	}
	
	@Override
	public double calcularAdicional() {
		// TODO Auto-generated method stub
		return this.calcularCostoEmpleados();
	}
	
	
	
}
