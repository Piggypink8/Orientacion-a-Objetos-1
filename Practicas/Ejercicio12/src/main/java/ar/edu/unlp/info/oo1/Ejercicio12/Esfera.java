package ar.edu.unlp.info.oo1.Ejercicio12;

public class Esfera extends Pieza {
	private Integer radio;

	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return (4/3) * Math.PI * Math.pow(this.radio, 3);
	}

	@Override
	public double getSuperficie() {
		// TODO Auto-generated method stub
		return 4 * Math.PI * Math.pow(this.radio, 2);
	}
}
