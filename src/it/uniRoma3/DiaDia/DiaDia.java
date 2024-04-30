package it.uniRoma3.DiaDia;

import java.util.Scanner;

import it.uniRoma3.DiaDia.comandi.FabbricaDiComandiFisarmonica;
import it.uniRoma3.DiaDia.comandi.IComando;
import it.uniRoma3.DiaDia.giocatore.Giocatore;



/**
 * Classe principale di diadia, un semplice gioco di ruolo ambientato al dia.
 * Per giocare crea un'istanza di questa classe e invoca il letodo gioca
 *
 * Questa e' la classe principale crea e istanzia tutte le altre
 *
 * @author  docente di POO 
 *         (da un'idea di Michael Kolling and David J. Barnes) 
 *          
 * @version base
 */

public class DiaDia {

	static final private String MESSAGGIO_BENVENUTO = ""+
			"Ti trovi nell'Universita', ma oggi e' diversa dal solito...\n" +
			"Meglio andare al piu' presto in biblioteca a studiare. Ma dov'e'?\n"+
			"I locali sono popolati da strani personaggi, " +
			"alcuni amici, altri... chissa!\n"+
			"Ci sono attrezzi che potrebbero servirti nell'impresa:\n"+
			"puoi raccoglierli, usarli, posarli quando ti sembrano inutili\n" +
			"o regalarli se pensi che possano ingraziarti qualcuno.\n\n"+
			"Per conoscere le istruzioni usa il comando 'aiuto'.";

	

	private Partita partita;
	private IO io;

	public Giocatore giocatore;

	public DiaDia(IO console) {
        this.io = console;
		this.partita = new Partita();
		this.giocatore = new Giocatore();

	}


	public void gioca() {
		String istruzione; 
		Scanner scannerDiLinee;

		io.mostraMessaggio(MESSAGGIO_BENVENUTO);
				
		do		
			istruzione = io.leggiRiga();

		while (!processaIstruzione(istruzione));
		
	}



	/**
	 * Processa una istruzione 
	 *
	 * @return true se l'istruzione e' eseguita e il gioco continua, false altrimenti
	 */
	private boolean processaIstruzione(String istruzione) {

		IComando comandoDaEseguire;
		FabbricaDiComandiFisarmonica factory = new FabbricaDiComandiFisarmonica(this.io);
		comandoDaEseguire = factory.costruisciComando(istruzione);
		comandoDaEseguire.esegui(this.partita);
		if (this.partita.vinta())

			io.mostraMessaggio("Hai vinto!");
		if (!this.partita.giocatoreIsVivo())

		io.mostraMessaggio("Hai esaurito i CFU...");

		return this.partita.isFinita();
		
	}   

	// implementazioni dei comandi dell'utente:

	/**
	 * Stampa informazioni di aiuto.
	 */




	/**
	 * Comando "Fine".
	 */


	public static void main(String[] argc) {
		IO console = new IOConsole();
		DiaDia gioco = new DiaDia(console);
		gioco.gioca();

	}
}