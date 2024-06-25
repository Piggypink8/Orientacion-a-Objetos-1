package ar.edu.unlp.info.oo1.ParcialOO1Debate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecomendadorSocialTest {
	
	private Debate debate;
	private Usuario usuario;
	private Recomendador recomendador;
	
	@BeforeEach
	public void setUp() {
		debate = new Debate();
		usuario = new Usuario("Daniela","123");
		recomendador = new RecomendadorSocial();
	}
	
	@Test
	public void testFeedUsuarioSinSeguidos() {
		usuario.cambiarRecomendador(recomendador);
		assertEquals(0,usuario.getFeed().size());
	}
	
	@Test
	public void testFeedUsuarioConSeguidosSinPublicaciones() {
		Usuario seguido1 = debate.crearUsuario("Seguido1", "123");
		Usuario seguido2 = debate.crearUsuario("Seguido2", "123");
		
		seguido1.seguirUsuario(usuario);
		seguido2.seguirUsuario(usuario);
		
		usuario.cambiarRecomendador(recomendador);
		usuario.actualizarFeed(debate);
		
		assertTrue(usuario.getFeed().isEmpty());
		
	}
	
	@Test
	public void testFeedUsuarioConSeguidosConUnaPublicacion() {
		Usuario seguido1 = debate.crearUsuario("Seguido1", "123");
		Usuario seguido2 = debate.crearUsuario("Seguido2", "123");
		
		seguido1.seguirUsuario(usuario);
		seguido2.seguirUsuario(usuario);
		
		seguido1.crearPublicacion("publicacion1", "contenido1");
		seguido2.crearPublicacion("publicacion2", "contenido2");
		
		usuario.cambiarRecomendador(recomendador);
		usuario.actualizarFeed(debate);
		
		assertEquals(2,usuario.getFeed().size());
		
	}
	
	@Test
	public void testFeedUsuarioConSeguidosConMultiplesPublicaciones() {
		Usuario seguido1 = debate.crearUsuario("Seguido1", "123");
		Usuario seguido2 = debate.crearUsuario("Seguido2", "123");
		
		seguido1.seguirUsuario(usuario);
		seguido2.seguirUsuario(usuario);
		
		Publicacion publicacion1 = seguido1.crearPublicacion("publicacion1", "contenido1");
		Publicacion publicacion2 = seguido1.crearPublicacion("publicacion2", "contenido2");
		Publicacion publicacion3 = seguido2.crearPublicacion("publicacion3", "contenido3");
		
		usuario.cambiarRecomendador(recomendador);
		usuario.actualizarFeed(debate);
		
		assertEquals(4,usuario.getFeed().size());
		
		assertEquals(publicacion3,usuario.getFeed().get(0),"La ultima publicacion es la mas reciente");
		assertEquals(publicacion2,usuario.getFeed().get(1),"La segunda publicacion debe estar segunda");
		assertEquals(publicacion1,usuario.getFeed().get(2),"La primera publicacion creada es la mas antigua");
	}
}
