package ar.edu.unlp.info.oo1.ParcialOO1Viviendas;

public class Cliente {
	private String nombre;
	private String direccion;
	
	public Cliente(String nombre, String direccion) {
		this.direccion = direccion;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

}
