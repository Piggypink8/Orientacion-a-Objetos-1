package ar.edu.unlp.info.oo1.ParcialOO1ARBA;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contribuyente {
	private String nombre;
	private String dni;
	private String localidad;
	private List<Bien> bienes;
	
	
	
	public Contribuyente(String nombre, String dni, String localidad) {
		this.nombre = nombre;
		this.dni = dni;
		this.localidad = localidad;
		this.bienes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public String getLocalidad() {
		return localidad;
	}

	public List<Bien> getBienes() {
		return bienes;
	}
	
	public Bien registrarInmueble(Contribuyente contribuyente, String nroPartida, double valorLote, double valorEdificacion) {
		Bien inmueble = new BienInmueble(contribuyente, nroPartida, valorLote, valorEdificacion);
		this.bienes.add(inmueble);
		return inmueble;
	}
	
	public Bien registrarAutomotor(Contribuyente contribuyente, String patente, LocalDate fechaFabricacion, double valor, String modelo, String marca) {
		Bien automotor = new BienAutomotor(contribuyente, patente, fechaFabricacion, valor, modelo, marca);
		this.bienes.add(automotor);
		return automotor;
	}
	
	public Bien registrarEmbarcacion(Contribuyente contribuyente, String patente, LocalDate fechaFabricacion, double valor,String nombre) {
		Bien embarcacion = new BienEmbarcacion(contribuyente, patente, fechaFabricacion, valor, nombre);
		this.bienes.add(embarcacion);
		return embarcacion;
	}
	
	public double calcularImpuestos() {
		return this.getBienes().stream()
				.mapToDouble(bien -> bien.calcularImpuestos())
				.sum();
	}
	
}
