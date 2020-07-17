package Statistiche;

import java.util.Vector;

public class SoloMaiuscoli {
	private Vector<String> m = new Vector<String>();
	
	// SALVA IN m TUTTI I POST SCRITTI SOLAMENTE IN MAIUSCOLO
	public void Maiuscolo(Vector<String> v) {
		Vector<String> m = new Vector<String>();
		for(String s:v) {
			if(Controllo(s)) m.add(s);
		}
		this.m=m;
	}
	
	// RESTITUISCE TRUE SE OGNI CARATTERE DELLA STRINGA E' MAIUSCOLO (SPAZI ESCLUSI)
	public boolean Controllo(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ' && !Character.isUpperCase(s.charAt(i))) {
				return false;
			}
		}
		return true;		
	}
	
	public Vector<String> getM() {
		return this.m;
	}
}
