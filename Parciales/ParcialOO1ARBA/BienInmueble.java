package ar.edu.unlp.info.oo1.ParcialOO1ARBA;

public class BienInmueble extends Bien{
	private String nroPartida;
	private double valorLote;
	private double valorEdificacion;
	
	public BienInmueble(Contribuyente contribuyente, String nroPartida, double valorLote, double valorEdificacion) {
		super(contribuyente);
		this.nroPartida = nroPartida;
		this.valorLote = valorLote;
		this.valorEdificacion = valorEdificacion;
	}

	public String getNroPartida() {
		return nroPartida;
	}

	public double getValorLote() {
		return valorLote;
	}
	public void setValorLote(double valorLote) {
		this.valorLote = valorLote;
	}
	public double getValorEdificacion() {
		return valorEdificacion;
	}
	public void setValorEdificacion(double valorEdificacion) {
		this.valorEdificacion = valorEdificacion;
	}
	
	@Override
	public double obtenerCosto() {
		return this.getValorEdificacion() + this.getValorLote();
	}
	
	@Override
	public double obtenerImpuestos() {
		return 0.01;
	}


	
	
	
}
