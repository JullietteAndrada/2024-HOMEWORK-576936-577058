package it.uniRoma3.DiaDia.comandi;

import it.uniRoma3.DiaDia.IO;
import it.uniRoma3.DiaDia.Partita;

public class ComandoNonValido implements IComando {

	private IO io;
	private final static String NOME = "non valido";


	@Override
	public void esegui(Partita partita) {
		io.mostraMessaggio("Comando sconosciuto");
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
