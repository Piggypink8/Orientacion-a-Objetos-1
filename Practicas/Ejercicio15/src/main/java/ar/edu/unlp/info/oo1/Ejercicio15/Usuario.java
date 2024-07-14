package ar.edu.unlp.info.oo1.Ejercicio15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private int dni;
	private List<Reserva> reservas;
	private List<Propiedad> propiedades;
	
	public Usuario(String nombre, String direccion, int dni) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.dni = dni;
		this.reservas = new ArrayList<>();
		this.propiedades = new ArrayList<>();
	}
	
	public boolean agregarReserva(Reserva reserva) {
		return this.reservas.add(reserva);
	}
	
	
	//Obtener ingresos de las propiedades del propietario en un periodo de tiempo
	public int calcularIngresos(LocalDate inicio, LocalDate fin) {
		return (int) this.getPropiedades().stream().mapToDouble(propiedad -> propiedad.ingresosReservas(inicio, fin)).sum();  
	}

	public String getDireccion() {
		return direccion;
	}

	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public List<Propiedad> getPropiedades() {
		return propiedades;
	}	
	
	
}
