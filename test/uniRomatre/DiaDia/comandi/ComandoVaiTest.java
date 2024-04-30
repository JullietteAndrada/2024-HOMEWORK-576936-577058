package uniRomatre.DiaDia.comandi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import it.uniRoma3.DiaDia.DiaDia;
import it.uniRoma3.DiaDia.IOConsole;
import it.uniRoma3.DiaDia.Partita;
import it.uniRoma3.DiaDia.ambienti.Stanza;
import it.uniRoma3.DiaDia.comandi.ComandoVai;
import it.uniRoma3.DiaDia.comandi.IComando;

public class ComandoVaiTest {

	private Stanza s1;
	private Stanza s2;
	private IComando vai;
	private Partita p;
	private Object[] MESSAGGIO_BENVENUTO;
	
	@Before
	public void setUp() throws Exception {
		s1 = new Stanza("aula 1");
		s2 = new Stanza("aula 2");
		vai = new ComandoVai();
		p = new Partita();
		vai.setIo(new IOConsole());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVaiNull() {
		p.setStanzaCorrente(s1);
		vai.esegui(p);
		assertEquals(s1, p.getStanzaCorrente());
	}
	
	@Test
	public void testVaiDirezioneEsistente() {
		p.setStanzaCorrente(s1);
		s1.impostaStanzaAdiacente("sud-ovest", s2);
		vai.setParametro("sud-ovest");
		vai.esegui(p);
		assertEquals(s2, p.getStanzaCorrente());
	}
	
	@Test
	public void testVaiDirezioneInesistente() {
		p.setStanzaCorrente(s1);
		s1.impostaStanzaAdiacente("sud-ovest", s2);
		vai.setParametro("in fondo a destra");
		vai.esegui(p);
		assertNotEquals(s2, p.getStanzaCorrente());
	}
	
	
}


