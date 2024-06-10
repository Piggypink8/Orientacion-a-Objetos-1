package ar.edu.unlp.info.oo1.ParcialOO1ARBA;

import java.time.LocalDate;

public class BienEmbarcacion extends BienVehiculo{
	private String nombre;

	public BienEmbarcacion(Contribuyente contribuyente, String patente, LocalDate fechaFabricacion, double valor,
			String nombre) {
		super(contribuyente, patente, fechaFabricacion, valor);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

}
