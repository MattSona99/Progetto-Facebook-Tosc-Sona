package testFacebook;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Facebook_Call.*;

class testCall {

	private Call c1;
	private User_Profile obj_User_Profile;
	
	@BeforeEach
	void setUp() throws Exception {
		Vector<String> v = new Vector<String>();
		String token = "EAAKdS6UMQ6QBAMb3oNDOmZA1n7e2ZAoAGkJcbmDfuKtKnIDX4C4gZBIsSmhaCbYOUUuG3PPSLovKG36tPeyAyiNyHuedicxd8DDlfKwUVZCny8crH27QYQ94tZAn0kZB4OarWnwim7QcZA9v9AXWX17gFqduUlmZCMIFgAfIsuZCZBcwZDZD";
		c1= new Call();
		obj_User_Profile=new User_Profile();
		obj_User_Profile=c1.Leggi_Post(v, token);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void test() {
		assertEquals("Lorenzo Toscanelli", obj_User_Profile.getUser_name());
	}

}
