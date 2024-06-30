package ar.edu.unlp.info.oo1.Ejercicio12;

public class Cilindro extends Pieza {
	private int radio;
	private int altura;
	@Override
	
	public double getVolumen() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.radio, 2) * this.altura; 
	}
	@Override
	public double getSuperficie() {
		// TODO Auto-generated method stub
		return 2* Math.PI * this.radio * this.altura + 2 * Math.PI * Math.pow(this.radio, 2);
	}

}
