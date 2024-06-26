package ar.edu.unlp.info.oo1.ParcialOO1Discord;

public class Mensaje {
	private String contenido;
	private Usuario usuario;
	
	public Mensaje(String contenido, Usuario usuario) {
		this.contenido = contenido;
		this.usuario = usuario;
	}

	public String getContenido() {
		return contenido;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	
}
