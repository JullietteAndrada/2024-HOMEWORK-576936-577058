package it.uniRoma3.DiaDia.comandi;

import it.uniRoma3.DiaDia.IO;
import it.uniRoma3.DiaDia.Partita;

public interface IComando {
  
	
	
	public void esegui(Partita partita);

	void setParametro(String parametro);

	String getParametro();

	public void setIo(IO io);
	
	public String getNome();

}
