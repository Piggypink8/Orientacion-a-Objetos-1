package ar.edu.unlp.info.oo1.ParcialOO1Distribuidora;

public class ProductoNacional extends Producto {

	public ProductoNacional(String nombre, double costoUnitario, String descripcion) {
		super(nombre, costoUnitario, descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularImpuesto(int cantidad) {
		if(this.validarCantidad(cantidad)) {
			return 0;
		}
		
		return this.getCostoUnitario() * 0.05;
		
	}

	@Override
	public boolean validarCantidad(int cantidad) {
		return cantidad <= 10;
	}
	
	

}
