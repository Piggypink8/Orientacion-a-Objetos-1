package ar.edu.unlp.info.oo1.Ejercicio15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaAlquileres {
	List<Propiedad> propiedades;
	//List<Reserva> reservas;
	List<Usuario> usuarios;
	
	public SistemaAlquileres() {
		this.propiedades = new ArrayList<>();
		//this.reservas = new ArrayList<>();
		this.usuarios = new ArrayList<>();
	}
	// Creo un usuario y lo agrego a la lista de usuarios.
	public Usuario registrarUsuario(String nombre, String direccion, int dni) {
		Usuario usuario = new Usuario(nombre, direccion, dni);
		this.usuarios.add(usuario);
		return usuario;
	}
	
	// Retorna las propiedades que esten disponibles en el periodo dado
	public List<Propiedad> buscarPropiedades(LocalDate inicio, LocalDate fin){
		return this.getPropiedades().stream().filter(p -> p.estaDesocupada(inicio, fin)).collect(Collectors.toList());
	}
	
	// Si la propiedad esta disponible, creo y retorno una reserva
	public Reserva hacerReserva(Propiedad propiedad, Usuario usuario, LocalDate inicio, LocalDate fin) {
		Reserva reserva = null;
		if(propiedad.estaDesocupada(inicio, fin)) {
			reserva = new Reserva(propiedad,inicio,fin,usuario);
			usuario.agregarReserva(reserva);
			propiedad.agregarReserva(reserva);
		}
		return reserva;
	}
	
	public void eliminarReserva(Reserva reserva) {
		Propiedad prop = reserva.getPropiedad();
		//this.reservas.remove(reserva);
		prop.eliminarReserva(reserva);
	}
	
	public int calcularIngresos(Usuario usuario, LocalDate inicio, LocalDate fin) {
		return usuario.calcularIngresos(inicio, fin);
	}
	
	public List<Reserva> obtenerReservasDe(Usuario usuarioInquilino){
		return usuarioInquilino.getReservas();
	}
	
	public double obtenerReembolso(Reserva reserva, LocalDate fecha){
		return reserva.getPropiedad().obtenerReembolso(reserva, fecha);
	}

	public List<Propiedad> getPropiedades() {
		return propiedades;
	}
/*
	public List<Reserva> getReservas() {
		return reservas;
	}
*/
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	
}
