package ar.edu.unlp.info.oo1.Ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PlazoFijoTest {
	public Inversiones pF1, pF2;

	@BeforeEach
	void setUp() {
		pF1 = new PlazoFijo(LocalDate.now(),100,10);
		pF2 = new PlazoFijo(LocalDate.now(),0,20);
	}
	
	@Test
	void testValorActual() {
		assertEquals(100,pF1.valorActual());
		assertEquals(0,pF2.valorActual());
	}
}
