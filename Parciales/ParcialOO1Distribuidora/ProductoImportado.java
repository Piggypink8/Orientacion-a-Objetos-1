package ar.edu.unlp.info.oo1.ParcialOO1Distribuidora;

public class ProductoImportado extends Producto{
	private String paisOrigen;

	public ProductoImportado(String nombre, double costoUnitario, String descripcion, String paisOrigen) {
		super(nombre, costoUnitario, descripcion);
		this.paisOrigen = paisOrigen;
	}
	
	public String getPaisOrigen() {
		return paisOrigen;
	}

	public boolean validarPais() {
			return this.getPaisOrigen().equals("Brasil") || this.getPaisOrigen().equals("Paraguay") || this.getPaisOrigen().equals("Uruguay");
	}
	
	@Override
	public boolean validarCantidad(int cantidad) {
		return cantidad > 50;
	}

	@Override
	public double calcularImpuesto(int cantidad) {
		if(this.validarPais() && this.validarCantidad(cantidad)) {
			return this.getCostoUnitario() * 0.08;
		}
		return this.getCostoUnitario() * 0.21;
	}
}
