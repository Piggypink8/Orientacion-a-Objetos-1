package ar.edu.unlp.info.oo1.ParcialOO1Viviendas;

import java.time.LocalDate;

public class ContratoProlongado extends Contrato {
	private int cantDias;
	
	public ContratoProlongado(LocalDate fecha, Servicio servicio, Cliente cliente, int cantDias) {
		super(fecha, servicio, cliente);
		this.cantDias = cantDias;
	}

	public int getCantDias() {
		return cantDias;
	}

}
