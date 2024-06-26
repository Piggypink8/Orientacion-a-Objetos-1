package ar.edu.unlp.info.oo1.ParcialOO1Discord;

import java.util.ArrayList;
import java.util.List;

public class Servidor {
	private String linkRecursos;
	private String mensajeBienvenida;
	private String tareasComoUsuario;
	private List<Usuario> miembros;
	private List<Canal> canales;
	private Usuario creador;
	
	public Servidor(String linkRecursos, String mensajeBienvenida, String tareasComoUsuario, Usuario creador) {
		this.linkRecursos = linkRecursos;
		this.mensajeBienvenida = mensajeBienvenida;
		this.tareasComoUsuario = tareasComoUsuario;
		this.creador = creador;
		this.canales = new ArrayList<>();
		this.miembros = new ArrayList<>();
		this.miembros.add(creador);
	}
	
	public String getLinkRecursos() {
		return linkRecursos;
	}
	public String getMensajeBienvenida() {
		return mensajeBienvenida;
	}
	public String getTareasComoUsuario() {
		return tareasComoUsuario;
	}
	public List<Usuario> getMiembros() {
		return miembros;
	}
	public List<Canal> getCanales() {
		return canales;
	}
	public Usuario getCreador() {
		return creador;
	}
	
	public int cantidadMiembros() {
		return this.getMiembros().size();
	}
	
}
