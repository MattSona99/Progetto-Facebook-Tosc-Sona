package Statistiche;

import java.util.Vector;

public class Hashtags {
	private Vector<String> s=new Vector<String>();
	
	// SALVA I POST CON HASHTAGS IN s
	public int hashtag(Vector<String> v) {
		int k=0;
		Vector<String> s = new Vector<String>();
		for(String c : v) {
				if(controllo(c,k)) {
					s.add(c);
					k++;
				}
		}
		this.s=s;
		return k;
	}
	
	// RESTITUISCE TRUE SE IL POST CONTIENE UN #
	public boolean controllo(String c,int k) {
		String r="#";
		for(int i=0;i<c.length();i++) {
			if(!c.contains(r)) return false;
		}
		return true;
		}
	
	public Vector<String> getHT() {
		return this.s;
	}
}
