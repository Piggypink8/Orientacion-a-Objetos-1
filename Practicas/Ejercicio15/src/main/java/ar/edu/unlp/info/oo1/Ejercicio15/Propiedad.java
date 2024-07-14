package ar.edu.unlp.info.oo1.Ejercicio15;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Propiedad {
	private String nombre;
	private String descripcion;
	private String direccion;
	private double precioPorNoche;
	private Politica politica;
	private List<Reserva> reservas;
	
	
	
	public Propiedad(String nombre, String descripcion,Politica politica,String direccion, double precioPorNoche) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<>();
		this.politica = politica;
	}

	public boolean agregarReserva(Reserva reserva) {
		return this.reservas.add(reserva);
	}
	
	public void eliminarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	public String getNombre() {
		return nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}
	
	public Politica getPolitica() {
		return this.politica;
	}


	public String getDireccion() {
		return direccion;
	}


	public double getPrecioPorNoche() {
		return precioPorNoche;
	}
	
	public double obtenerReembolso(Reserva reserva, LocalDate fecha) {
		return this.politica.obtenerReembolso(reserva, fecha);
	}
	
	
	// Verifica si la Propiedad esta desocupada en ese periodo de tiempo
	public boolean estaDesocupada(LocalDate inicio, LocalDate salida) {
		List<Reserva> reservasEntreFechas = this.getReservasEntre(inicio, salida);
		return reservasEntreFechas.isEmpty();
	}
	
	// Obtengo las reservas en un periodo de tiempo
	public List<Reserva> getReservasEntre(LocalDate inicio, LocalDate salida){
		return this.reservas.stream().filter( reserva -> reserva.incluyePeriodo(inicio, salida)).collect(Collectors.toList());
	}
	
	//Ingresos que obtuvo la propiedad en un periodo de tiempo
	public double ingresosReservas(LocalDate inicio, LocalDate salida) {
		return this.getReservasEntre(inicio, salida).stream().mapToDouble(reserva -> reserva.calcularPrecio()).sum();
	}


	public List<Reserva> getReservas() {
		return reservas;
	}
	
	
}
