package ar.edu.unlp.info.oo1.ParcialOO1Debate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String contrasenia;
	private LocalDateTime fechaRegistro;
	private List<Publicacion> publicaciones;
	private List<Publicacion> feed;
	private List<Usuario> seguidos;
	private List<Usuario> seguidores;
	private Recomendador recomendador;
	
	public Usuario(String nombre, String contrasenia) {
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.fechaRegistro = LocalDateTime.now();
		this.feed = new ArrayList<>();
		this.publicaciones = new ArrayList<>();
		this.seguidores = new ArrayList<>();
		this.seguidos = new ArrayList<>();
		this.recomendador = new RecomendadorSocial();
	}

	
	public void agregarSeguidor(Usuario usuario) {
		this.seguidores.add(usuario);
	}
	
	public void seguirUsuario(Usuario usuario) {
		usuario.agregarSeguidor(this);
	}
	
	public Publicacion crearPublicacion(String titulo, String contenido) {
		Publicacion publicacion = new Publicacion(titulo,contenido);
		this.publicaciones.add(publicacion);
		return publicacion;
	}
	public Respuesta crearRespuesta(Publicacion publicacion, String contenido) {
		Respuesta respuesta = new Respuesta(contenido, this);
		publicacion.agregarRespuesta(respuesta);
		return respuesta;
	}
	public void cambiarRecomendador(Recomendador recomendador) {
		this.recomendador = recomendador;
	}
	
	public void actualizarFeed(Debate debate) {
		this.feed = this.recomendador.filtro(debate, this);
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public List<Publicacion> getFeed() {
		return feed;
	}

	public List<Usuario> getSeguidores() {
		return seguidores;
	}

	public List<Usuario> getSeguidos() {
		return seguidos;
	}

	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}

}
