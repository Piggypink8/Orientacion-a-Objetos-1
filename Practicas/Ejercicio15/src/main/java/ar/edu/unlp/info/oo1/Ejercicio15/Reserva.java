package ar.edu.unlp.info.oo1.Ejercicio15;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
	private Propiedad propiedad;
	private LocalDate entrada;
	private LocalDate salida;
	private Usuario inquilino;
	
	public Reserva(Propiedad propiedad, LocalDate entrada, LocalDate salida, Usuario inquilino) {
		this.propiedad = propiedad;
		this.entrada = entrada;
		this.salida = salida;
		this.inquilino = inquilino;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}
	
	// ingresos de la reserva
	public double calcularPrecio() {
		return this.getCantidadDias() * this.getPropiedad().getPrecioPorNoche();
	}
	
	
	public int getCantidadDias() {
		return (int) ChronoUnit.DAYS.between(this.getEntrada(), this.getSalida());
	}
	
	public boolean incluyePeriodo(LocalDate inicio, LocalDate fin) {
		return this.getEntrada().isAfter(inicio) && this.getSalida().isBefore(salida);
	}

	public LocalDate getEntrada() {
		return entrada;
	}

	public LocalDate getSalida() {
		return salida;
	}

	public Usuario getInquilino() {
		return inquilino;
	}
	
}
