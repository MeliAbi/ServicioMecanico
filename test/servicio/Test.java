package servicio;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void queSeCreeUnClienteYQueSeaAñadidoEnLaLista() {
		Taller servicio1 = new Taller ();
		
		servicio1.nuevoCliente("Nombre", 1122334422);
		
		assertNotNull(servicio1.getClientesEnEspera());
		
	}
	
	@org.junit.Test
	public void queSeAtiendaUnCliente() throws Exception {
		Taller servicio1 = new Taller ();

		servicio1.nuevoCliente("Nombre", 1122334422);
		try {
			Cliente atendido = servicio1.atenderCliente();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
		assertNotNull(servicio1.getClientesAtendidos());
		assertTrue(servicio1.getClientesEnEspera().isEmpty());
		
	}
	
	@org.junit.Test
	public void obtenerElTiempoDeEsperaDeLosNoAtendidos() throws Exception {
		
		Taller servicio = new Taller ();
		
		servicio.nuevoCliente("Cliente1", 123456789);
        servicio.nuevoCliente("Cliente2", 987654321);
        servicio.nuevoCliente("Cliente3", 555555555);
        
        try {
			servicio.atenderCliente();
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
        
        assertNotNull(servicio.tiempoEsperaNoAtendidos());
		
	}
	
	@org.junit.Test
	public void obtenerElTiempoDeEsperaDeLosAtendidos() throws Exception {
		
		Taller servicio = new Taller ();
		
		servicio.nuevoCliente("Cliente1", 123456789);
        servicio.nuevoCliente("Cliente2", 987654321);
        servicio.nuevoCliente("Cliente3", 555555555);
        
        try {
			servicio.atenderCliente();
			servicio.atenderCliente();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
        
        assertNotNull(servicio.tiempoEsperaAtendidos());
        
		
	}
	
	@org.junit.Test
	public void obtenerCantidadClientesEnEspera() throws Exception {
		
		Taller servicio = new Taller ();
		
		servicio.nuevoCliente("Cliente1", 123456789);
        servicio.nuevoCliente("Cliente2", 987654321);
        servicio.nuevoCliente("Cliente3", 555555555);
        
        try {
			servicio.atenderCliente();
			servicio.atenderCliente();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
        
        assertEquals(1,servicio.obtenerCantidadClientesEnEspera());
        
		
	}
	
	@org.junit.Test
	public void obtenerCantidadClientesAtendidos() throws Exception {
		
		Taller servicio = new Taller ();
		
		servicio.nuevoCliente("Cliente1", 123456789);
        servicio.nuevoCliente("Cliente2", 987654321);
        servicio.nuevoCliente("Cliente3", 555555555);
        
        try {
			servicio.atenderCliente();
			servicio.atenderCliente();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
        
        assertEquals(2,servicio.obtenerCantidadClientesAtendidos());
        
		
	}
	
}
