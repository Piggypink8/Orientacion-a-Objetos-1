package ar.edu.unlp.info.oo1.ParcialOO1Veterinaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Veterinaria {
	private List<Servicio> visitas;

	public Veterinaria() {
		this.visitas = new ArrayList<>();
	}

	public List<Servicio> getVisitas() {
		return visitas;
	}
	
	public MedicoVeterinario registrarMedico(String nombre, LocalDate ingreso, double honorarios) {
		MedicoVeterinario medico = new MedicoVeterinario(nombre, ingreso, honorarios);
		return medico;
	}
	
	public Mascota registrarMascota(String nombre, LocalDate fechaNacimiento, String especie) {
		Mascota mascota = new Mascota(nombre, fechaNacimiento, especie);
		return mascota;
	}
	
	public Servicio registrarServicioConsulta(MedicoVeterinario medico, Mascota mascota) {
		Servicio consulta = new ServicioConsulta(mascota,medico);
		return consulta;
	}
	
	public Servicio registrarServicioGuarderia(int cantDias, Mascota mascota) {
		Servicio guarderia = new ServicioGuarderia(mascota,cantDias);
		return guarderia;
	}
	
	public Servicio registrarServicioVacunacion(MedicoVeterinario medico, Mascota mascota,Vacuna vacuna) {
		Servicio vacunacion = new ServicioVacunacion(mascota,medico,vacuna);
		return vacunacion;
	}
	
	public double pbtenerRecaudacionMascotaFecha(Mascota mascota, LocalDate fecha) {
		return mascota.obtenerCostoServiciosRecibidosFecha(fecha);
	}
	
	public double obtenerRecaudacionCachorrosFecha(LocalDate fecha) {
		return this.obtenerVisitasCachorrosFecha(fecha).stream()
				.mapToDouble(servicio -> servicio.obtenerCosto())
				.sum();
	}
	
	private List<Servicio> obtenerVisitasCachorrosFecha(LocalDate fecha){
		return this.obtenerVisitasCachorros().stream()
				.filter(servicio -> servicio.getFechaAtencion().equals(fecha))
				.collect(Collectors.toList());
	}
	
	private List<Servicio> obtenerVisitasCachorros(){
		return this.getVisitas().stream()
			.filter(servicio -> servicio.getMascota().esCachorro())
			.collect(Collectors.toList());
	}
}
