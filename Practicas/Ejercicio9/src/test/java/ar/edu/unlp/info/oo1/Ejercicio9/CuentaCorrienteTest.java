package ar.edu.unlp.info.oo1.Ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	private CuentaCorriente cc1,cc2,cc5;
	private Cuenta cc3,c4;

	@BeforeEach
	public void setUp() {
		
		cc1 = new CuentaCorriente(100);
		cc2 = new CuentaCorriente();
		cc3 = new CuentaCorriente();
		c4 = new CajaDeAhorro();
		cc5 = new CuentaCorriente();
		cc1.depositar(50);
		
		
		cc3.depositar(100);
		
		c4.depositar(100);
	}
	
	@Test
	public void testDescubierto() {
		assertEquals(100, this.cc1.getDescubierto());
		assertEquals(0, this.cc2.getDescubierto());
	}
	
	@Test
	public void testTransferirACuenta() {
		assertEquals(50, cc1.getSaldo());
		assertEquals(100, cc3.getSaldo());
		assertTrue(this.cc1.transferirACuenta(10, cc3));
		assertEquals(110, this.cc3.getSaldo());
		assertEquals(40, this.cc1.getSaldo());
		assertTrue(this.cc1.transferirACuenta(10, cc3));
		assertTrue(this.cc3.transferirACuenta(10, c4));
		
	}
	
	

}

