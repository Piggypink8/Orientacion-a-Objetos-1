package ar.edu.unlp.info.oo1.Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean agregarEmail(Email email) {
		return this.emails.add(email);
	}
	
	public boolean eliminarEmail(Email email) {
		return this.emails.remove(email);
	}
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<>();
	}
	
	public Email buscar(String texto) {
		// buscamos por titulos primero
		Email aux = this.emails.stream().filter( e -> e.getTitulo().startsWith(texto)).findFirst().orElse(null); 
		if(aux.equals(null))
			//si no lo encontramos, buscamos por el cuerpo
			aux = this.emails.stream().filter( e -> e.getCuerpo().startsWith(texto)).findFirst().orElse(null);
		return aux;
	}
	
	public int espacioOcupado() {
		return this.emails.stream().mapToInt(e -> e.espacioOcupado()).sum();
	}
	
	public List<Email> getEmails(){
		return this.emails;
	}
}
