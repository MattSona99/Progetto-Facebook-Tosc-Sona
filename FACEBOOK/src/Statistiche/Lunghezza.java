package Statistiche;

import java.util.Vector;

public class Lunghezza {
	
	private int media;
	private int min;
	private int max;

	// RESTITUISCE UN ARRAY DI INT CONTENENTE TUTTE LE LUNGHEZZE DEI POST (IN CARATTERI)
	public int[] lunghezza(Vector<String> v) {
		int[] i= new int[v.size()];
		int j=0;
			for(String s: v) {
				i[j]=s.length();
				j++;
			}
		return i;
	}
	
	// RESTITUISCE LA MEDIA DI CARATTERI DI TUTTI I POST
	public int media(int[] i) {
		int somma=0;
		for(int j=0;j<i.length;j++) {
			somma+=i[j];
		}
		this.media=somma/i.length;
		return this.media;
	}
	
	// RESTITUISCE IL NUMERO DI CARATTERI DEL POST PIU' CORTO
	public int minimo(int[] i) {
		this.min=i[0];
		for(int j=0;j<i.length;j++) {
			if(min>i[j]) min=i[j];
		}
		return this.min;
	}
	
	// RESTITUISCE IL NUMERO DI CARATTERI DEL POST PIU' LUNGO
	public int massimo(int[] i) {
		this.max=i[0];
		for(int j=0;j<i.length;j++) {
			if(max<i[j]) max=i[j];
		}
		return this.max;
	}
}
