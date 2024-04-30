package it.uniRoma3.DiaDia.comandi;

import it.uniRoma3.DiaDia.IO;
import it.uniRoma3.DiaDia.Partita;

public class ComandoAiuto implements IComando {

	static final private String[] elencoComandi = {"vai", "aiuto", "fine","prendi<nomeAttrezzo>","posa<nomeAttrezzo>","guarda"};
	private IO io;
	private final static String NOME = "aiuto";


	@Override
	public void esegui(Partita partita) {
		for(int i=0; i< elencoComandi.length; i++) 
			io.mostraMessaggio(elencoComandi[i]+" ");
		io.mostraMessaggio("");
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
