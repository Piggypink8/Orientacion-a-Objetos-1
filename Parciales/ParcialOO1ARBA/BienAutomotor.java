package ar.edu.unlp.info.oo1.ParcialOO1ARBA;

import java.time.LocalDate;

public class BienAutomotor extends BienVehiculo{
	private String modelo;
	private String marca;
	
	public BienAutomotor(Contribuyente contribuyente, String patente, LocalDate fechaFabricacion, double valor,
			String modelo, String marca) {
		super(contribuyente, patente, fechaFabricacion, valor);
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}
	
}
