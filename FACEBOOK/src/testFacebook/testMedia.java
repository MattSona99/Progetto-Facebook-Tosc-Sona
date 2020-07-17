package testFacebook;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import Statistiche.*;
import Facebook_Call.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testMedia {
	
	private int media;
	private Call c1;
	private Lunghezza m;
	@BeforeEach
	void setUp() throws Exception {

		Vector<String> v = new Vector<String>();
		String token = "EAAKdS6UMQ6QBAMb3oNDOmZA1n7e2ZAoAGkJcbmDfuKtKnIDX4C4gZBIsSmhaCbYOUUuG3PPSLovKG36tPeyAyiNyHuedicxd8DDlfKwUVZCny8crH27QYQ94tZAn0kZB4OarWnwim7QcZA9v9AXWX17gFqduUlmZCMIFgAfIsuZCZBcwZDZD";
		c1=new Call();
		c1.Leggi_Post(v, token);
		int[] i = new int[v.size()];
		m = new Lunghezza();
		i=m.lunghezza(v);
		media=m.media(i);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertEquals(43,media);
	}

}
