package ar.edu.unlp.info.oo1.Ejercicio9;

public class CuentaCorriente extends Cuenta {
	private double descubierto;
	
	public CuentaCorriente(double descubierto) {
		this.descubierto = descubierto;
	}
	
	public CuentaCorriente() {
		this.descubierto = 0;
	}
	public double getDescubierto() {
		return this.descubierto;
	}
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	@Override
	protected boolean puedeExtraer(double monto) {
		// TODO Auto-generated method stub
		return (monto <= (this.getSaldo() + this.descubierto));
	}
}
