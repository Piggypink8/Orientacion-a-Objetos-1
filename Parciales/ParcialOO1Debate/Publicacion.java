package ar.edu.unlp.info.oo1.ParcialOO1Debate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Publicacion {
	private String titulo;
	private String contenido;
	private List<Respuesta> respuestas;
	private List<Usuario> likes;
	private List<Usuario> dislikes;
	private LocalDateTime fecha;
	
	public Publicacion(String titulo, String contenido) {
		this.titulo = titulo;
		this.contenido = contenido;
		this.respuestas = new ArrayList<>();
		this.likes = new ArrayList<>();
		this.dislikes = new ArrayList<>();
		this.fecha = LocalDateTime.now();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public List<Respuesta> getRespuestas() {
		return respuestas;
	}

	public List<Usuario> getLikes() {
		return likes;
	}

	public List<Usuario> getDislikes() {
		return dislikes;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void agregarRespuesta(Respuesta respuesta) {
		this.respuestas.add(respuesta);
		
	}
	
	public int cantidadDislikes() {
		return this.getDislikes().size();
	}
	
	public int cantidadLikes() {
		return this.getLikes().size();
	}
	
	
	
	
}
