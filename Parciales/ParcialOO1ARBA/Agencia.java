package ar.edu.unlp.info.oo1.ParcialOO1ARBA;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agencia {
	private List<Contribuyente> contribuyentes;

	public Agencia() {
		this.contribuyentes = new ArrayList<>();
	}
	
	public Contribuyente agregarContribuyente(String nombre, String dni, String localidad) {
		Contribuyente contribuyente = new Contribuyente(nombre, dni, localidad);
		this.contribuyentes.add(contribuyente);
		return contribuyente;
	}
	
	public Bien registrarInmueble(Contribuyente contribuyente, String nroPartida, double valorLote, double valorEdificacion) {
		return contribuyente.registrarInmueble(contribuyente, nroPartida, valorLote, valorEdificacion);
	}
	
	public Bien registrarAutomotor(Contribuyente contribuyente, String patente, LocalDate fechaFabricacion, double valor, String modelo, String marca) {
		return contribuyente.registrarAutomotor(contribuyente, patente, fechaFabricacion, valor, modelo, marca);
	}
	
	public Bien registrarEmbarcacion(Contribuyente contribuyente, String patente, LocalDate fechaFabricacion, double valor,String nombre) {
		return contribuyente.registrarEmbarcacion(contribuyente, patente, fechaFabricacion, valor, nombre);
	}
	
	public double calcularImpuestosContribuyente(Contribuyente contribuyente) {
		return contribuyente.calcularImpuestos();
	}
}
