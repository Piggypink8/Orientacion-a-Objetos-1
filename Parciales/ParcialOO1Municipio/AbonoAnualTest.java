package ar.edu.unlp.info.oo1.ParcialOO1Municipio;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AbonoAnualTest {

	private Abono abono;
	private Usuario usuario;
	
	@BeforeEach
	public void setUp() {
		abono = new AbonoAnual(LocalDateTime.now(),50000);

		TarjetaCredito tarjeta = new TarjetaCredito("tarjeta1","123");
		usuario = new Usuario("Id1","Usuario1","Apellido1",tarjeta);
		usuario.setAbono(abono);
	}
	
	@Test
	public void testAbonoAnualValido() {
		//Completar
		
	}
	
	@Test
	public void testAbonoAnualVencido() {
		//Completar
	}
	

}
