package ar.edu.unlp.info.oo1.ParcialOO1Encomiendas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Empresa {
	
	private List<Encomienda> encomiendas;
	
	public Empresa() {
		this.encomiendas = new ArrayList<>();
	}
	
	public List<Encomienda> getEncomiendas() {
		return encomiendas;
	}
	
	public Encomienda crearEncomiendaMini(LocalDate fechaDespacho,String destino,List<Producto> productos) {
		Paquete paquete = new PaqueteMini(1200,1300,750.00,productos);
		Encomienda mini = new Encomienda(fechaDespacho, destino, paquete);
		return mini;
	}
	public Encomienda crearEncomiendaNormal(LocalDate fechaDespacho,String destino,List<Producto> productos) {
		Paquete paquete = new PaqueteNormal(5000,10000,1800.00,productos);
		Encomienda normal = new Encomienda(fechaDespacho, destino, paquete);
		return normal;
	}
	public Encomienda crearEncomiendaMax(LocalDate fechaDespacho,String destino,List<Producto> productos) {
		Paquete paquete = new PaqueteMax(15000,25000,0.00,productos);
		Encomienda max = new Encomienda(fechaDespacho, destino, paquete);
		return max;
	}

	public List<Encomienda> validarEncomiendas(List<Encomienda> encomiendas){
		return encomiendas.stream()
				.filter(encomienda -> encomienda.validarEncomienda())
				.collect(Collectors.toList());
	}
	
	// --> Implementar metodo validarEncomiendasCamion()

}
