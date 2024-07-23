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

	@Override
	public double calcularAdicional() {
		if(this.validarDias()) {
			return -0.10;
		}
		return 0;
	}
	public boolean validarDias() {
		if(this.getCantDias() > 5) {
			return true;
		}
		return false;
	}
}
