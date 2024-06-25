package ar.edu.unlp.info.oo1.ParcialOO1Debate;

public class Respuesta {
	private String contenido;
	private Usuario usuario;
	
	public Respuesta(String contenido, Usuario usuario) {
		super();
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
