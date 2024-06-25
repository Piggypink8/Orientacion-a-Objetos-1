package ar.edu.unlp.info.oo1.ParcialOO1Debate;

import java.util.List;
import java.util.stream.Collectors;

public class RecomendadorPopular implements Recomendador{

	@Override
	public List<Publicacion> filtro(Debate debate, Usuario usuario) {
		return debate.getUsuarios().stream()
				.filter(usuarioDebate -> !usuarioDebate.getNombre().equals(usuario.getNombre()) )
				.flatMap(usuarioDebate -> usuarioDebate.getPublicaciones().stream())
				.sorted((p1,p2) -> Integer.compare(p2.cantidadLikes(), p1.cantidadLikes()))
				.collect(Collectors.toList());
	}

}
