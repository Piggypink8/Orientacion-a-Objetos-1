package ar.edu.unlp.info.oo1.ParcialOO1Discord;

import java.util.ArrayList;
import java.util.List;

public class DiscOOrd {
	private List<Canal> canales;
	private List<Servidor> servidores;
	private List<Usuario> usuarios;
	
	public DiscOOrd() {
		this.canales = new ArrayList<>();
		this.servidores = new ArrayList<>();
		this.usuarios = new ArrayList<>();
	}
	
	public Servidor crearServidor(String linkRecursos, String mensaje,String tareas, Usuario creador) {
		Servidor servidor = new Servidor(linkRecursos,mensaje,tareas,creador);
		creador.agregarServidor(servidor);
		this.servidores.add(servidor);
		return servidor;
	}
	
	public Canal crearCanal(String nombre,Servidor servidor) {
		Canal canal = new Canal(nombre,servidor);
		this.canales.add(canal);
		return canal;
	}
	
	public Usuario crearUsuario(String nombre) {
		Usuario usuario = new Usuario(nombre);
		this.usuarios.add(usuario);
		return usuario;
	}
	
	public Canal obtenerCanalConMasMensajes() {
		return this.canales.stream()
				.max((canal1,canal2) -> Integer.compare(canal1.cantidadMensajes(),canal2.cantidadMensajes()))
				.orElse(null);
	}
	
	public Servidor obtenerServidorConMasMiembros() {
		return this.servidores.stream()
				.max((servidor1,servidor2) -> Integer.compare(servidor1.cantidadMiembros(),servidor2.cantidadMiembros()))
				.orElse(null);
	}
	
	public Usuario obtenerUsuarioConMasMensajesEnviados() {
		return this.usuarios.stream()
				.max((usuario1,usuario2) -> Integer.compare(usuario1.cantidadMensajesEnviados(),usuario2.cantidadMensajesEnviados()))
				.orElse(null);
	}
	
}
