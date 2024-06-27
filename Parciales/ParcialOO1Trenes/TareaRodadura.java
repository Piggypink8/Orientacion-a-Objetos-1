package ar.edu.unlp.info.oo1.ParcialOO1Trenes;

public class TareaRodadura extends Tarea{
	private int cantKm;
	
	public TareaRodadura(String id, int tiempo, double costoBase, int cantKm) {
		super(id, tiempo, costoBase);
		this.cantKm = cantKm;
	}

	public int getCantKm() {
		return cantKm;
	}

	@Override
	public double calcularAdicional(Tren tren) {
		// TODO Auto-generated method stub
		return tren.getKms() * 0.05;
	}

}
