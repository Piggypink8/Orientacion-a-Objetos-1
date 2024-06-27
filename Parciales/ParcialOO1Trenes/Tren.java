package ar.edu.unlp.info.oo1.ParcialOO1Trenes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tren {
	private String nroSerie;
	private Modelo modelo;
	private String marca;
	private LocalDate fechaIncorporacion;
	private int kms;
	private List<Viaje> viajes;
	private List<TareaRealizada> tareasRealizadas;
	
	public Tren(String nroSerie, Modelo modelo, String marca, LocalDate fechaIncorporacion, int kms) {
		this.nroSerie = nroSerie;
		this.modelo = modelo;
		this.marca = marca;
		this.fechaIncorporacion = fechaIncorporacion;
		this.kms = kms;
		this.viajes =new ArrayList<>();
		this.tareasRealizadas = new ArrayList<>();
	}

	public String getNroSerie() {
		return nroSerie;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public LocalDate getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	public int getKms() {
		return kms;
	}

	public List<Viaje> getViajes() {
		return viajes;
	}

	public List<TareaRealizada> getTareasRealizadas() {
		return tareasRealizadas;
	}
	
	public void agregarTareaRealizada(TareaRealizada tareaRealizada) {
		this.tareasRealizadas.add(tareaRealizada);
	}
	
	public void agregarViaje(Viaje viaje) {
		this.kms = this.getKms() + viaje.getKmRodado();
		this.viajes.add(viaje);
	}
	
}
