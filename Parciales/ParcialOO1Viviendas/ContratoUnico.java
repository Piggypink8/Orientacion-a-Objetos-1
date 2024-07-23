package ar.edu.unlp.info.oo1.ParcialOO1Viviendas;

import java.time.LocalDate;

public class ContratoUnico extends Contrato {

	public ContratoUnico(LocalDate fecha, Servicio servicio, Cliente cliente) {
		super(fecha, servicio, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularAdicional() {
		// TODO Auto-generated method stub
		return 0;
	}


}
