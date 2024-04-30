package uniRomatre.DiaDia.giocatore;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniRoma3.DiaDia.giocatore.Giocatore;



public class GiocatoreTest {
	
	Giocatore g = new Giocatore();
	
	@Test
	public void testGetCfuDefault() {
		assertEquals(20, g.getCfu());
	}
	
	@Test
	public void testSetCfu() {
		g.setCfu(3);
		assertEquals(3, g.getCfu());
	}

	@Test
	public void testGetBorsaDefault() {
		assertNotNull(g.borsa);
	}
}
