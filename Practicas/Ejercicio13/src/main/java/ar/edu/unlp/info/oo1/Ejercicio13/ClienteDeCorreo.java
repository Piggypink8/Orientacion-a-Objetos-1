package ar.edu.unlp.info.oo1.Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private List<Carpeta> carpetas;
	private Carpeta inbox;
	
	public ClienteDeCorreo(Carpeta inbox) {
		this.inbox = inbox;
		this.carpetas = new ArrayList<>();
	}
	
	public boolean recibir(Email email) {
		return this.inbox.agregarEmail(email);
	}
	
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		origen.eliminarEmail(email);
		destino.agregarEmail(email);
	}
	
	public Email buscar(String texto) {
		// Falta que este stream retorne desde la primer carpeta que este
		Email aux = this.inbox.buscar(texto);
		if(aux != null) {
			return aux;
		} else {
			// pedir profe explicar este stream 
			return this.carpetas.stream().map(c -> c.buscar(texto)).filter(e -> e != null).findFirst().orElse(null);
		}
	}
	
	public int espacioOcupado() {
		return this.inbox.espacioOcupado() + this.carpetas.stream().mapToInt(c -> c.espacioOcupado()).sum();
	}
}
