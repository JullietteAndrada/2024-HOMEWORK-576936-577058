package uniRomatre.DiaDia.comandi;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import it.uniRoma3.DiaDia.IOConsole;
import it.uniRoma3.DiaDia.comandi.ComandoFine;
import it.uniRoma3.DiaDia.comandi.ComandoNonValido;
import it.uniRoma3.DiaDia.comandi.ComandoVai;
import it.uniRoma3.DiaDia.comandi.FabbricaDiComandiFisarmonica;
import it.uniRoma3.DiaDia.comandi.IComando;
import it.uniRoma3.DiaDia.IO;

public class FabbricaDiComandiFisarmonicaTest {


private FabbricaDiComandiFisarmonica fabbrica;
	private IO io;
	private IComando expected;
	
	@Before
	public void setUp() throws Exception {
		io = new IOConsole();
		fabbrica = new FabbricaDiComandiFisarmonica(io);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testComandoNonValido() {
		expected = new ComandoNonValido();
		assertEquals( expected.getNome(), fabbrica.costruisciComando("pippo").getNome());
	}
	
	@Test
	public void testComandoConParametro() {
		expected = new ComandoVai();
		expected.setParametro("nord");
		IComando current = fabbrica.costruisciComando("vai nord");
		assertEquals( expected.getNome(), current.getNome());
		assertEquals( expected.getParametro(), current.getParametro());
	}
	
	@Test
	public void testComandoSenzaParametro() {
		expected = new ComandoFine();
		assertEquals( expected.getNome(), fabbrica.costruisciComando("fine").getNome());
	}

}
