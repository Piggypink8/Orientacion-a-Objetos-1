package ar.edu.unlp.info.oo1.ParcialOO1Discord;

import java.util.List;

public class Canal {
	private String nombre; 
	private Servidor servidor;
	private List<Mensaje> mensajes;
	
	public Canal(String nombre, Servidor servidor) {
		this.nombre = nombre;
		this.servidor = servidor;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Mensaje> getMensajes() {
		return mensajes;
	}

	public Servidor getServidor() {
		return servidor;
	}	
	
	public void agregarMensaje(Mensaje mensaje) {
		this.mensajes.add(mensaje);
	}
	
	public int cantidadMensajes() {
		return this.getMensajes().size();
	}
	
}
