package ar.edu.unlp.info.oo1.ParcialOO1MyCarBoxes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Sistema {
	private ArrayList<Empleado> empleados;
	private ArrayList<Orden> ordenes;
	private ArrayList<Factura> facturas;
	private ArrayList<Repuesto> repuestos;

	public Sistema() {
		this.empleados = new ArrayList<>();
		this.ordenes = new ArrayList<>();
		this.facturas = new ArrayList<>();
		this.repuestos = new ArrayList<>();
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public ArrayList<Orden> getOrdenes() {
		return ordenes;
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public ArrayList<Repuesto> getRepuestos() {
		return repuestos;
	}
	
	public Orden registrarOrdenReparacion(String patente, ArrayList<Repuesto> repuestos, String descripcion, ArrayList<Empleado> empleados, int cantHoras){
		Orden reparacion = new Reparacion(patente,repuestos,LocalDate.now(), descripcion, empleados, cantHoras);
		this.ordenes.add(reparacion);
		return reparacion;
	} 
	
	public Orden registrarOrdenCompra(String patente, ArrayList<Repuesto> repuestos){
		Orden compra = new Compra(patente,repuestos,LocalDate.now());
		this.ordenes.add(compra);
		return compra;
	}
	
	public Empleado registrarEmpleado(String nombre, double valorPorHora) {
		Empleado empleado = new Empleado(nombre, valorPorHora);
		this.empleados.add(empleado);
		return empleado;
	}
	
	public Repuesto registrarRepuesto(String nombre, LocalDate fechaFabricacion, double costo) {
		Repuesto repuesto = new Repuesto(nombre, fechaFabricacion, costo);
		this.repuestos.add(repuesto);
		return repuesto;
	}
	
	public double validarDescuento(String patente) {
		boolean ok = this.ordenes.stream()
		.filter(orden -> orden.obtenerAntiguedad() <= 1)
		.collect(Collectors.toList())
		.stream().anyMatch(orden -> orden.getPatente().equals(patente));
		
		if(ok) {
			return 0.95;
		}
		
		return 0;
	}
	
	public ArrayList<Factura> facturarOrdenes(ArrayList<Orden> ordenes){
		return (ArrayList<Factura>) ordenes.stream()
				.map(orden -> orden.facturarOrden(orden.calcularCosto(), this.validarDescuento(orden.getPatente())))
				.collect(Collectors.toList());
	}
}
