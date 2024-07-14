package ar.edu.unlp.info.oo1.Ejercicio17;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTelefonicaTest {
	SistemaTelefonica sistema;
	Cliente cliente1,cliente3,cliente2;
	
	@BeforeEach 
	void setUp() throws Exception {
		sistema = new SistemaTelefonica();
		
		this.sistema.agregarNumero("1");
		this.sistema.agregarNumero("2");
		this.sistema.agregarNumero("3");
		
		cliente1 = this.sistema.matricularPersonaFisica("Daniela", "Calle 132", "44187234", 0.1);
		cliente2 = this.sistema.matricularPersonaFisica("Marcos", "Calle 120", "41643865", 0.1);
		cliente3 = this.sistema.matricularPersonaJuridica("Claro", "Calle 30", 0, "Organizacion", "30259658457");
		
		assertEquals(3, this.sistema.getClientes().size());
	
	}
	
	 @Test
	 public void testRegistrarLlamada() {
		 
		 this.sistema.registrarInterurbana(LocalDateTime.of(2023,12,25,16,31), 1, "1", "2", 100);
		 this.sistema.registrarInterurbana(LocalDateTime.of(2023,12,26,16,31), 1, "1", "2", 500);
		 this.sistema.registrarLocal(LocalDateTime.of(2023,12,29,16,31), 40, "1", "2");
		 
		 assertEquals(3, this.cliente1.getLlamadas().size());
		 
	 }
	 
	 
	 @Test
	 public void testFacturarCliente() {
		 this.sistema.registrarLocal(LocalDateTime.of(2023,12,29,16,31), 10, "1", "2");
		 this.sistema.registrarLocal(LocalDateTime.of(2023,12,30,16,31), 10, "1", "2");
		 Factura factura1 = this.sistema.facturarCliente(cliente1,LocalDateTime.of(2023,10,20,16,31), LocalDateTime.of(2024,01,10,16,31));
		 assertEquals(18, factura1.getMontoTotal());
		 
	 }
}
