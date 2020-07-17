package Salva_File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class Writer {
	
	// SCRIVE, NUMERANDOLI, TUTTI I MESSAGGI DI UN POST IN UN FILE
	public boolean Scrivi_File(Vector<String> v) {
		try{
			FileWriter file = new FileWriter(/*PercorsoFile*/);
			int j=1;
			for(String s : v) {
					file.write(j + "-");
					file.write(s);
					file.write("\n");
					file.write("\n");
					j++;
			}
			file.close();
			return true;
		}
		catch(IOException e) {
			System.out.println("C'è stato un errore durante la scrittura del file. Riprovare!");	
			return false;
		}
	}
}
