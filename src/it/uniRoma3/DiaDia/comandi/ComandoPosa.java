package it.uniRoma3.DiaDia.comandi;

import it.uniRoma3.DiaDia.IO;
import it.uniRoma3.DiaDia.Partita;
import it.uniRoma3.DiaDia.attrezzi.Attrezzo;

public class ComandoPosa implements IComando {
private String nomeAttrezzo;
private IO io;
private final static String NOME = "posa";

	
	
	public ComandoPosa() {
		// TODO Auto-generated constructor stub
	}

	@Override
	  public void esegui(Partita partita) {
		
		Attrezzo a = partita.getLabirinto().getStanzaCorrente().getAttrezzo(nomeAttrezzo);
		partita.getGiocatore().getBorsa().addAttrezzo(a);
		partita.getLabirinto().getStanzaCorrente().removeAttrezzo(a);
		io.mostraMessaggio("hai raccolto l'oggetto");	
}
	
	  public void setParametro(String parametro) {
		  this.nomeAttrezzo = parametro;
	  }
	  
	  @Override
		public String getParametro() {
			return this.nomeAttrezzo;
		}

		@Override
		public void setIo(IO io) {
			this.io = io;
		}

		@Override
		public String getNome() {
			return NOME;
		}

}
