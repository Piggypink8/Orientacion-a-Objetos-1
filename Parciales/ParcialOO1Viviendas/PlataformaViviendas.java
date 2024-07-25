package ar.edu.unlp.info.oo1.ParcialOO1Viviendas;

import java.util.ArrayList;
import java.util.List;

public class PlataformaViviendas {
  private List<Servicio> servicios;

  public PlataformaViviendas() {
		this.servicios = new ArrayList<>();
	}
  
	public Cliente registrarCliente(String nombre, String direccion) {
		Cliente cliente = new Cliente(nombre,direccion);
		return cliente;
	}
	
	public Servicio registrarServicioParquizacion(double precioPorHora, int cantHoras, int cantMaquinas, double costoMantenimiento) {
		Servicio servicioParquizacion = new ServicioParquizacion(precioPorHora, cantHoras, cantMaquinas, costoMantenimiento);
		this.servicios.add(servicioParquizacion);
		return servicioParquizacion;
	}
	
	public Servicio registrarServicioLimpieza(double precioPorHora, int cantHoras, double tarifaMinima) {
		Servicio servicioLimpieza = new ServicioLimpieza(precioPorHora, cantHoras, tarifaMinima);
		this.servicios.add(servicioLimpieza);
		return servicioLimpieza;
	}

	public Contrato registrarContratoUnico(LocalDate fecha, Servicio servicio, Cliente cliente) {
		Contrato contratoUnico = new ContratoUnico(fecha, servicio, cliente);
		return contratoUnico;
	}
	
	public Contrato registrarContratoProlongado(LocalDate fecha, Servicio servicio, Cliente cliente, int cantDias) {
		Contrato contratoProlongado = new ContratoProlongado(fecha, servicio, cliente, cantDias);
		return contratoProlongado;
	}
	
	public List<Servicio> getServicios() {
		return servicios;
	}
	
	public double obtenerMontoAPagarCliente(Cliente cliente) {
		return cliente.obtenerMontoServiciosContratados();
	}
	
	private List<Servicio> obtenerServiciosConMontoMayorA(double valor) {
		return this.getServicios().stream()
				.filter(servicio -> servicio.obtenerMonto() > valor)
				.collect(Collectors.toList());
	}
	
	public int obtenerCantidadServiciosConMontoMayorA(double valor) {
		return this.obtenerServiciosConMontoMayorA(valor).size();
	}
}
