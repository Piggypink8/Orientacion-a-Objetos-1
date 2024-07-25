package ar.edu.unlp.info.oo1.ParcialOO1Viviendas;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String direccion;
	private List<Contrato> serviciosContratados;

	public Cliente(String nombre, String direccion) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.serviciosContratados = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public List<Contrato> getServiciosContratados() {
		return serviciosContratados;
	}

	public double obtenerMontoServiciosContratados() {
		return this.getServiciosContratados().stream()
				.mapToDouble(contrato -> contrato.obtenerMonto())
				.sum();
	}
}
