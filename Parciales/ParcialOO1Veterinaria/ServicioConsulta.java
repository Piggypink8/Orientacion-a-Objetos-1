package ar.edu.unlp.info.oo1.ParcialOO1Veterinaria;

public class ServicioConsulta extends ServicioMedico {

	public ServicioConsulta(Mascota mascota, MedicoVeterinario medico) {
		super(mascota, medico);
	}

	@Override
	public double obtenerCostoMaterialDescartable() {
		return 300;
	}

	@Override
	public double calcularMonto() {
		return this.obtenerHonorariosMedico() + 
			   this.obtenerAdicionalDomingo() +
			   this.obtenerCostoMaterialDescartable();
	}
	
}
