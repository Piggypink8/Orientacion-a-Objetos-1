package ar.edu.unlp.info.oo1.ParcialOO1Distribuidora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DistribuidoraTest {
	private Distribuidora distribuidora;
	
	@BeforeEach
	public void setUp() {
		distribuidora = new Distribuidora();
	}
	
	@Test
	public void testcalcularCostoTotalPedidosClientePeriodoSinItem(){
		Cliente cliente = distribuidora.registrarCliente("cliente1", "cli1@gmail.com");
		distribuidora.crearPedido(cliente);
		
		assertEquals(0,distribuidora.calcularCostoTotalPedidosClientePeriodo(LocalDate.now().minusDays(1), LocalDate.now(), cliente),"No hay Items en el pedido");
	}
	
	
	@Test
	public void testcalcularCostoTotalPedidosClientePeriodoConUnItemConProductoNacionalConImpuesto(){
		Cliente cliente = distribuidora.registrarCliente("cliente1", "cli1@gmail.com");
		Pedido pedido = distribuidora.crearPedido(cliente);

		Producto prod1 = new ProductoNacional("Leche",100,"LaSerenisima");
		
		distribuidora.agregarItemAPedido(pedido, prod1, 11);
		
		assertEquals(105,distribuidora.calcularCostoTotalPedidosClientePeriodo(LocalDate.now().minusDays(1), LocalDate.now(), cliente),"Con impuestos, 1 pedido con 1 item");
	}
	
	@Test
	public void testcalcularCostoTotalPedidosClientePeriodoConUnItemConProductoNacionalSinImpuesto(){
		Cliente cliente = distribuidora.registrarCliente("cliente1", "cli1@gmail.com");
		Pedido pedido = distribuidora.crearPedido(cliente);

		Producto prod1 = new ProductoNacional("Leche",100,"LaSerenisima");
		
		distribuidora.agregarItemAPedido(pedido, prod1, 1);
		
		assertEquals(100,distribuidora.calcularCostoTotalPedidosClientePeriodo(LocalDate.now().minusDays(1), LocalDate.now(), cliente),"Sin impuestos, 1 pedido con 1 item");
	}
	
	@Test
	public void testcalcularCostoTotalPedidosClientePeriodoConUnItemConProductoImportadoConImpuestoAlto(){
		Cliente cliente = distribuidora.registrarCliente("cliente1", "cli1@gmail.com");
		Pedido pedido = distribuidora.crearPedido(cliente);

		Producto prod1 = new ProductoImportado("Leite",100,"Leite de vaca","Brasil");
		
		distribuidora.agregarItemAPedido(pedido, prod1, 1);
		
		assertEquals(121,distribuidora.calcularCostoTotalPedidosClientePeriodo(LocalDate.now().minusDays(1), LocalDate.now(), cliente),"Impuesto alto, 1 pedido con 1 item");
	}
	
	@Test
	public void testcalcularCostoTotalPedidosClientePeriodoConUnItemConProductoImportadoConImpuestoBajo(){
		Cliente cliente = distribuidora.registrarCliente("cliente1", "cli1@gmail.com");
		Pedido pedido = distribuidora.crearPedido(cliente);

		Producto prod1 = new ProductoImportado("Leite",100,"Leite de vaca","Brasil");
		
		distribuidora.agregarItemAPedido(pedido, prod1, 51);
		
		assertEquals(108,distribuidora.calcularCostoTotalPedidosClientePeriodo(LocalDate.now().minusDays(1), LocalDate.now(), cliente),"Impuesto bajo, 1 pedido con 1 item");
	}
}
