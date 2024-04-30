package it.uniRoma3.DiaDia;

import it.uniRoma3.DiaDia.ambienti.Labirinto;
import it.uniRoma3.DiaDia.ambienti.Stanza;
import it.uniRoma3.DiaDia.giocatore.Giocatore;

public class Partita {



	private Labirinto labirinto;
	private Giocatore giocatore;
	private boolean finita;

	public Partita(){
		labirinto = new Labirinto();
		giocatore = new Giocatore();
		labirinto.creaStanze();
		this.finita = false;
	}

	public Labirinto getLabirinto(){
		return labirinto;
	}

	public void setLabirinto(Labirinto labirinto) {
		this.labirinto = labirinto;
	}


	public Giocatore getGiocatore() {
		return giocatore;
	}

	public void setGiocatore(Giocatore giocatore) {
		this.giocatore = giocatore;
	}

	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return labirinto.getStanzaCorrente()== labirinto.getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || (this.getGiocatore().getCfu() == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}

	public boolean giocatoreIsVivo() {
		return this.giocatore.getCfu()>0;
	}
	
	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.getLabirinto().setStanzaCorrente(stanzaCorrente);
	}

	public Stanza getStanzaCorrente() {
		return this.getLabirinto().getStanzaCorrente();
	}
	

}
