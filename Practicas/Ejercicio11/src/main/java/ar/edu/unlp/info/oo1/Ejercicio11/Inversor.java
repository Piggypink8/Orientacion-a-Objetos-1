package ar.edu.unlp.info.oo1.Ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversiones> inversiones;	
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		inversiones = new ArrayList<>();
	}
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(i -> i.valorActual()).sum();
	}
}
