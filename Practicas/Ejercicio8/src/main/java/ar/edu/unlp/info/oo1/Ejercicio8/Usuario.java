package ar.edu.unlp.info.oo1.Ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String domicilio;
	private String nombre;
	private List<Factura> facturas;
	private List<Consumo> consumos;
	
	
	
	public Usuario(String nombre, String domicilio) {
		this.domicilio = domicilio;
		this.nombre = nombre;
		this.consumos = new ArrayList<Consumo>();
		this.facturas = new ArrayList<Factura>();
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void agregarFactura(Factura factura){
		this.facturas.add(factura);
	}
	
	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}
	
	public Consumo ultimoConsumo() {
		return this.consumos.stream().max((Consumo c1, Consumo c2) -> c1.getFecha().compareTo(c2.getFecha())).orElse(null);
	}
	
	public double ultimoConsumoActiva() {
		Consumo c = this.ultimoConsumo() ;
		if(!c.equals(null))
			return c.getConsumoEnergiaActiva();
		return 0;
	}
	
	private double getDescuento(Consumo ultimo) {
		double descuento = 0d;
		if (ultimo.factorDePotencia() > 0.8d) {
			descuento = 10;
		}
		return descuento;
	}
	
	public Factura facturarEnBaseA(double precioKWh) {
		Consumo ultimo = this.ultimoConsumo(); // Agarro ultimo consumo del usuario
		
		if (ultimo == null) {	
			return new Factura(0, 0, this);
		}
		
		
		Factura factura = new Factura(ultimo.costoEnBaseA(precioKWh), this.getDescuento(ultimo), this);
		this.agregarFactura(factura);
		return factura;	
	}
	
	public List<Factura> getFacturas(){
		return this.facturas;
	}

	public List<Consumo> getConsumos() {
		return consumos;
	}

	public void setConsumos(List<Consumo> consumos) {
		this.consumos = consumos;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}
}
