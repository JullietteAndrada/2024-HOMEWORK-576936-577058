package it.uniRoma3.DiaDia.comandi;

import it.uniRoma3.DiaDia.IO;
import it.uniRoma3.DiaDia.Partita;

public class ComandoFine implements IComando {

	private IO io;
	private final static String NOME = "fine";
	


	@Override
	  public void esegui(Partita partita) {
		partita.setFinita();
		io.mostraMessaggio("Grazie di aver giocato!");  // si desidera smettere
}

	
	
	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getParametro() {
		// TODO Auto-generated method stub
		return null;
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
