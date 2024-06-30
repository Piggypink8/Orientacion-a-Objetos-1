package ar.edu.unlp.info.oo1.Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.adjuntos = new ArrayList<>();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}
	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}
	
	public void agregarAdjunto(Archivo a) {
		this.adjuntos.add(a);
	}
	
	public List<Archivo> getAdjuntos() {
		return adjuntos;
	}
	
	public int espacioOcupado() {
		return this.titulo.length() + this.cuerpo.length() + this.getTamAdj();
	}
	
	private int getTamAdj() {
		return (int) this.adjuntos.stream().mapToDouble(a -> a.getTamanio()).sum();
	}
	
}
