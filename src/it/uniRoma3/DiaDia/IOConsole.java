package it.uniRoma3.DiaDia;


	import java.util.Scanner;
	
	
	public class IOConsole implements IO{
		public void mostraMessaggio(String msg) {
			System.out.println(msg);
		}
		public String leggiRiga() {
			Scanner scannerDiLinee = new Scanner(System.in);
			String riga = scannerDiLinee.nextLine();
			//scannerDiLinee.close();
			return riga;
		}
	}