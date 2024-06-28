package ar.edu.unlp.info.oo1.ParcialOO1Trenes;

public class TareaPeriodica extends Tarea {
	private int cantDias;
	
	public TareaPeriodica(String id, double costoBase, int cantDias) {
		super(id, costoBase);
		this.cantDias = cantDias;
		// TODO Auto-generated constructor stub
	}

	public int getCantDias() {
		return cantDias;
	}

	@Override
	public double calcularAdicional(Tren tren) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
