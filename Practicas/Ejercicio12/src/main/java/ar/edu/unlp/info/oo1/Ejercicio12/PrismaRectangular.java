package ar.edu.unlp.info.oo1.Ejercicio12;

public class PrismaRectangular extends Pieza {
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	@Override
	public double getSuperficie() {
		// TODO Auto-generated method stub
		return 2*(this.ladoMayor * this.ladoMenor + 
				this.ladoMayor * this.altura + 
				this.ladoMenor * this.altura);
	}
	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return this.ladoMayor * this.ladoMenor * this.altura;
	}
	
}
