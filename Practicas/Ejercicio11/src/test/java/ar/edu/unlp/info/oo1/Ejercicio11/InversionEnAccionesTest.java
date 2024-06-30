package ar.edu.unlp.info.oo1.Ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionEnAccionesTest {
	public Inversiones iEA1, iEA2;
	
	@BeforeEach
	void setUp() {
		iEA1 = new InversionEnAcciones("Terrenos", 3, 100.00);
		iEA2 = new InversionEnAcciones("Casas", 2, 100.00);
	}
	
	@Test
	public void testValorActual() {
		assertEquals(300.00, this.iEA1.valorActual());
		assertEquals(200.00, this.iEA2.valorActual());
	}
	
}
