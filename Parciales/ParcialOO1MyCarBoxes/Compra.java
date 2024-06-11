package ar.edu.unlp.info.oo1.ParcialOO1MyCarBoxes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compra extends Orden{

	public Compra(String patente, ArrayList<Repuesto> repuestos, LocalDate fecha) {
		super(patente, repuestos, fecha);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularAdicional() {
		// TODO Auto-generated method stub
		return 0;
	}

}
