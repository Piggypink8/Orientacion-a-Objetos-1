package ar.edu.unlp.info.oo1.ParcialOO1Debate;

import java.util.ArrayList;
import java.util.List;

public class Debate {
	private List<Usuario> usuarios;
	
	public Debate() {
		this.usuarios = new ArrayList<>();
	}
	
	public Usuario crearUsuario(String nombre, String contrasenia) {
		Usuario usuario = new Usuario(nombre, contrasenia);
		this.usuarios.add(usuario);
		return usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
}
