package ar.edu.unlp.info.oo1.ParcialOO1ARBA;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BienInmuebleTest {
	
	private Bien inmueble;
	private Contribuyente contribuyente;
	
	@BeforeEach
	public void setUp() {
		this.contribuyente = new Contribuyente("Juan","24758994","San Isidro");
		this.inmueble = new BienInmueble(contribuyente,"001",10000.00,25000.00);
		
	}
	@Test
	public void testCalcularImpuesto() {
		assertEquals(350.00, this.inmueble.calcularImpuestos());
		assertTrue(this.inmueble.calcularImpuestos() > 0);
		assertFalse(this.inmueble.calcularImpuestos() < 0);
	}
}
