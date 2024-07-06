package ar.edu.unlp.info.oo1.ParcialOO1Veterinaria;

import java.time.DayOfWeek;

public abstract class ServicioMedico extends Servicio{
	private MedicoVeterinario medico;
	
	public ServicioMedico(Mascota mascota, MedicoVeterinario medico) {
		super(mascota);
		this.medico = medico;
	}

	public MedicoVeterinario getMedico() {
		return medico;
	}
	
	public double obtenerHonorariosMedico() {
		return this.medico.obtenerHonorarios();
	}
	
	public double obtenerAdicionalDomingo() {
		if(this.getFechaAtencion().getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			return 200;
		}
		return 0;
	}
	
	public abstract double obtenerCostoMaterialDescartable();

}
