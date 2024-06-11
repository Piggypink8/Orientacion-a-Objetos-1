package ar.edu.unlp.info.oo1.ParcialOO1MyCarBoxes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AgenciaTest {
	Sistema sistema;
	ArrayList<Repuesto> repuestos;
	Repuesto repuesto1,repuesto2;
	ArrayList<Factura> facturas;
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = new Sistema();
		repuesto2 = new Repuesto("Bulon",LocalDate.now().minusYears(6),100);
		repuesto1 = new Repuesto("Batería",LocalDate.now(),100);
		
		repuestos = new ArrayList<>();
		repuestos.add(repuesto1);
		sistema.registrarOrdenCompra("AF12360", repuestos);

	}
	
	//Error -> Modificar valores assertEquals sumando el 10% al total de la orden
	
	@Test
    public void testFacturarOrdenRepuestoMenor5AniosSinDescuento() {
        facturas = this.sistema.facturarOrdenes(this.sistema.getOrdenes());
        
        assertEquals(1, this.sistema.getOrdenes().size());
        assertEquals(1, this.sistema.getFacturas().size());
        assertEquals(115, this.sistema.getFacturas().get(1).getMontoFinal());
        assertTrue(0 == this.sistema.getFacturas().get(1).getDescuento());
       
    }
	
	@Test
    public void testFacturarOrdenRepuestoMayor5AniosSinDescuento() {
		repuestos.add(repuesto2);
		sistema.registrarOrdenCompra("AA54304", repuestos);
        facturas = this.sistema.facturarOrdenes(this.sistema.getOrdenes());

        assertEquals(2, this.sistema.getOrdenes().size());
        assertEquals(2, this.sistema.getFacturas().size());
        assertEquals(108, this.sistema.getFacturas().get(2).getMontoFinal());
        assertTrue(0 == this.sistema.getFacturas().get(1).getDescuento());
       
    }
	
	@Test
    public void testFacturarOrdenRepuestoMenor5AniosConDescuento() {
		sistema.registrarOrdenCompra("AA54304", repuestos);
		sistema.registrarOrdenCompra("AA54304", repuestos);
        facturas = this.sistema.facturarOrdenes(this.sistema.getOrdenes());
        
        assertEquals(4, this.sistema.getOrdenes().size());
        assertEquals(4, this.sistema.getFacturas().size());
        assertEquals(109.25, this.sistema.getFacturas().get(4).getMontoFinal());
        assertTrue(0.95 == this.sistema.getFacturas().get(4).getDescuento());
       
    }
	
    public void testFacturarOrdenRepuestoMayor5AniosConDescuento() {
    	ArrayList<Repuesto> repuestos2 = new ArrayList<>();
    	Repuesto r = new Repuesto("Bulon",LocalDate.now().minusYears(6),100);
    	repuestos2.add(r);
    	sistema.registrarOrdenCompra("AF12360", repuestos2);
        facturas = this.sistema.facturarOrdenes(this.sistema.getOrdenes());
        
        assertEquals(5, this.sistema.getOrdenes().size());
        assertEquals(5, this.sistema.getFacturas().size());
        assertEquals(102.6, this.sistema.getFacturas().get(5).getMontoFinal());
        assertTrue(0.95 == this.sistema.getFacturas().get(5).getDescuento());
       
    }
	
	
	@Test
    public void testFacturarOrdenes() {
        facturas = this.sistema.facturarOrdenes(this.sistema.getOrdenes());
        
        assertEquals(2, this.sistema.getOrdenes().size());
        assertEquals(2, this.sistema.getFacturas().size());
        assertTrue(facturas.get(1).getMontoFinal() > 0);
        assertTrue(facturas.get(1).getDescuento() > 0);

    }
	
}
