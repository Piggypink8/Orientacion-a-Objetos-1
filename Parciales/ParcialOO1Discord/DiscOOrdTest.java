package ar.edu.unlp.info.oo1.ParcialOO1Discord;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiscOOrdTest {
	
	private DiscOOrd discord;
	
	@BeforeEach
	public void setUp() {
		discord = new DiscOOrd();
	}
	
	@Test
	public void testObtenerCanalConMasMensajes() {
		Usuario usuario = discord.crearUsuario("usuario1");
		Servidor servidor = discord.crearServidor("link", "bienvenidos", "tareas", usuario);
		Canal canal1 = discord.crearCanal("canal1", servidor);
		Canal canal2 = discord.crearCanal("canal2", servidor);
		
		usuario.enviarMensajeCanal(canal1, "mensaje1");
		
		assertEquals(1, canal1.cantidadMensajes());
		assertTrue(canal2.getMensajes().isEmpty());
	}
	
	@Test
	public void testObtenerServidorConMasMiembros() {
		Usuario usuario = discord.crearUsuario("usuario1");
		Servidor servidor1 = discord.crearServidor("link", "bienvenidos", "tareas", usuario);
		Servidor servidor2 = discord.crearServidor("link", "bienvenidos", "tareas", usuario);
		
		Usuario miembro1 = discord.crearUsuario("Miembro1");
		
		miembro1.unirseServidor(servidor1);
		
		assertEquals(2,servidor1.cantidadMiembros(),"Los miembros son: Usuario(el creador) y miembro1");
		assertEquals(1,servidor2.cantidadMiembros(),"El unico miembro es usuario (el creador)");
		
		assertEquals(servidor1, discord.obtenerServidorConMasMiembros(),"servidor1 es el servidor con mas miembros");
	}
	
	@Test
	public void testObtenerUsuarioConMasMensajesEnviados() {
		Usuario usuario1 = discord.crearUsuario("usuario1");
		Usuario usuario2 = discord.crearUsuario("usuario2");
		Servidor servidor = discord.crearServidor("link", "bienvenidos", "tareas", usuario1);
		Canal canal1 = discord.crearCanal("canal1", servidor);
		
		usuario1.enviarMensajeCanal(canal1, "mensaje1");
		
		assertEquals(1, usuario1.cantidadMensajesEnviados());
		assertEquals(0,usuario2.cantidadMensajesEnviados());
		
		assertEquals(usuario1, discord.obtenerUsuarioConMasMensajesEnviados());
		
	}
	

}
