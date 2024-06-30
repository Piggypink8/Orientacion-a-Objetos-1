package ar.edu.unlp.info.oo1.Ejercicio12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


// ANALIZAR Y DISCUTIR DIFERENCIAS CON EJERCICIO FIGURAS Y CUERPOS.

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<>();
	}
	
	public boolean agregarPieza(Pieza pieza) {
		return this.piezas.add(pieza);
	}
	
	public void eliminarPieza() {
		this.piezas.removeLast();
	}
	
	public double getVolumenDeMaterial(String material) {
		return this.piezas.stream().filter(p -> p.getMaterial() == material)
		.collect(Collectors.toList())
		.stream().mapToDouble(p -> p.getVolumen()).sum();
	}
	public double superficieDeColor(String color) {
		return this.piezas.stream().filter(p -> p.getColor() == color)
				.collect(Collectors.toList())
				.stream().mapToDouble(p -> p.getSuperficie())
				.sum();
	}
}
