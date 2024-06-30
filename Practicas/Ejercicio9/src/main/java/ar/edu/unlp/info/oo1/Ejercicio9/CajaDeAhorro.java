package ar.edu.unlp.info.oo1.Ejercicio9;

public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro() {}
	
	public boolean extraer(double monto){
		return super.extraer(monto * 1.02);
	}
	
	public void depositar(double monto) {
		super.depositar(monto * .98);
	}

	@Override
	protected boolean puedeExtraer(double monto) {
		// TODO Auto-generated method stub
		return (monto <= this.getSaldo());
	}
}
