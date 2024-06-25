package ar.edu.unlp.info.oo1.ParcialOO1Debate;

import java.util.List;

public interface Recomendador {
	
	public abstract List<Publicacion> filtro(Debate debate, Usuario usuario);
}
