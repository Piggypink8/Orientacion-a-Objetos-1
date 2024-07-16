package ar.edu.unlp.info.oo1.ParcialOO1Encomiendas;

import java.util.ArrayList;
import java.util.List;

public class Camion {
	private int gramosMax;
	private int volumenMax;
	private List<Encomienda> encomiendas;
	
	public Camion(int gramosMax, int volumenMax) {
		this.gramosMax = gramosMax;
		this.volumenMax = volumenMax;
		this.encomiendas = new ArrayList<>();
	}

	public int getGramosMax() {
		return gramosMax;
	}

	public int getVolumenMax() {
		return volumenMax;
	}

	public List<Encomienda> getEncomiendas() {
		return encomiendas;
	}
	
	
	
}
