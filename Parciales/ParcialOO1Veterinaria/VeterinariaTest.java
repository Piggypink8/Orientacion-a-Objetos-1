package ar.edu.unlp.info.oo1.ParcialOO1Veterinaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VeterinariaTest {
	private Veterinaria veterinaria;
	
	@BeforeEach
	public void setUp() {
		veterinaria = new Veterinaria();
	}
	
	@Test
	public void testObtenerRecaudacionMascotaFechaExistente() {
		MedicoVeterinario medico = new MedicoVeterinario("medico1",LocalDate.now(),100);
		Mascota mascota = veterinaria.registrarMascota("Mascota1", LocalDate.now().minusYears(3), "Perro");
		veterinaria.registrarServicioConsulta(medico, mascota);
		
		assertEquals(400,veterinaria.pbtenerRecaudacionMascotaFecha(mascota, LocalDate.now()));
	}
	
	public void testObtenerRecaudacionMascotaFechaMpExistente() {
		MedicoVeterinario medico = new MedicoVeterinario("medico1",LocalDate.now(),100);
		Mascota mascota = veterinaria.registrarMascota("Mascota1", LocalDate.now().minusYears(3), "Perro");
		veterinaria.registrarServicioConsulta(medico, mascota);
		
		assertEquals(400,veterinaria.pbtenerRecaudacionMascotaFecha(mascota, LocalDate.now().plusDays(1)));
	}

}
