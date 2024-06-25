package ar.edu.unlp.info.oo1.ParcialOO1Debate;

import java.util.List;
import java.util.stream.Collectors;

public class RecomendadorSocial implements Recomendador {

	@Override
	public List<Publicacion> filtro(Debate debate, Usuario usuario) {
		return usuario.getSeguidos().stream()
				.flatMap(seguidos -> seguidos.getPublicaciones().stream())
				.sorted((p1,p2) -> p2.getFecha().compareTo(p1.getFecha()))
				.collect(Collectors.toList());
	}

}
