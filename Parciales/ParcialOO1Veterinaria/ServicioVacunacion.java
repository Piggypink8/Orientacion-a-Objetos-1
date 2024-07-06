package ar.edu.unlp.info.oo1.ParcialOO1Veterinaria;

public class ServicioVacunacion extends ServicioMedico {
	private Vacuna vacuna;
	
	public ServicioVacunacion(Mascota mascota, MedicoVeterinario medico, Vacuna vacuna) {
		super(mascota, medico);
		this.vacuna = vacuna;
	}

	public Vacuna getVacuna() {
		return vacuna;
	}
	
	private double obtenerCostoVacuna() {
		return this.getVacuna().getCosto();
	}

	@Override
	public double calcularMonto() {
		return this.obtenerCostoVacuna() + 
			   this.obtenerHonorariosMedico() + 
			   this.obtenerAdicionalDomingo() +
			   this.obtenerCostoMaterialDescartable();
	}

	@Override
	public double obtenerCostoMaterialDescartable() {
		return 500;
	}

}
