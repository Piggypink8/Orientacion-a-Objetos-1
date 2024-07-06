package ar.edu.unlp.info.oo1.ParcialOO1Veterinaria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mascota {
	private String nombre;
	private LocalDate fechaNacimiento;
	private String especie;
	private List<Servicio> serviciosRecibidos;
	
	public Mascota(String nombre, LocalDate fechaNacimiento, String especie) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.especie = especie;
		this.serviciosRecibidos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getEspecie() {
		return especie;
	}

	public List<Servicio> getServiciosRecibidos() {
		return serviciosRecibidos;
	}
	private int obtenerTamanioServiciosRecibidosPrevios(LocalDate fecha) {
		return this.getServiciosRecibidos().stream()
				.filter(servicio -> servicio.getFechaAtencion().isBefore(fecha))
				.collect(Collectors.toList()).size();
	}
	
	public boolean validarDescuento(LocalDate fecha) {
		return  this.obtenerTamanioServiciosRecibidosPrevios(fecha) > 5;
	}
	
	public boolean esCachorro() {
		return ChronoUnit.YEARS.between(this.getFechaNacimiento(), LocalDate.now()) < 2;
	}
	
	public double obtenerCostoServiciosRecibidosFecha(LocalDate Fecha) {
		return this.obtenerServiciosFecha(Fecha).stream()
				.mapToDouble(servicio -> servicio.obtenerCosto())
				.sum();
	}
	
	private List<Servicio> obtenerServiciosFecha(LocalDate fecha) {
		return this.getServiciosRecibidos().stream()
				.filter(servicio -> servicio.getFechaAtencion().equals(fecha))
				.collect(Collectors.toList());
	}
}
