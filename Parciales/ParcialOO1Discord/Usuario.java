package ar.edu.unlp.info.oo1.ParcialOO1Discord;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private Membresia membresia;
	private Modo modo;
	private List<Usuario> amigos;
	private List<Canal> canalesMiembro;
	private List<Servidor> servidoresCreados;
	private List<Servidor> servidoresMiembro;
	private List<Mensaje> mensajesEnviados;
	
	public Usuario(String nombre) {
		this.membresia = new CuentaNormal();
		this.nombre = nombre;
		this.modo = new ModoNormal();
		this.amigos = new ArrayList<>();
		this.canalesMiembro = new ArrayList<>();
		this.servidoresCreados = new ArrayList<>();
		this.servidoresMiembro = new ArrayList<>();
	}

	public Membresia getMembresia() {
		return membresia;
	}

	public Modo getModo() {
		return modo;
	}

	public List<Usuario> getAmigos() {
		return amigos;
	}

	public List<Canal> getCanalesMiembro() {
		return canalesMiembro;
	}

	public List<Servidor> getServidoresCreados() {
		return servidoresCreados;
	}

	public String getNombre() {
		return nombre;
	}
	
	public List<Mensaje> getMensajesEnviados() {
		return mensajesEnviados;
	}

	public void agregarServidor(Servidor servidor) {
		this.servidoresCreados.add(servidor);
	}
	
	public Mensaje enviarMensajeCanal(Canal canal,String contenido) {
		Mensaje mensaje = new Mensaje(contenido,this);
		canal.agregarMensaje(mensaje);
		this.mensajesEnviados.add(mensaje);
		return mensaje;
	}
	
	public void unirseCanal(Canal canal) {
		this.getCanalesMiembro().add(canal);
	}
	
	public void unirseServidor(Servidor servidor) {
		this.getServidoresMiembro().add(servidor);
	}
	
	public void cambiarMembresia(Membresia membresia) {
		this.membresia = membresia;
	}
	
	public void agregarAmigo(Usuario usuario) {
		this.amigos.add(usuario);
	}
	
	public void cambiarModo(Modo modo) {
		this.modo = modo;
	}
	
	public void activarModo() {
		this.getModo().activarModo();
	}
	
	public int cantidadMensajesEnviados() {
		return this.getMensajesEnviados().size();
	}

	public List<Servidor> getServidoresMiembro() {
		return servidoresMiembro;
	}
	
}
