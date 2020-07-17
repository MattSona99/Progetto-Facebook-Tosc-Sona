package Facebook_Call;

import java.util.Vector;
import java.util.List;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Version;
import com.restfb.types.Post;
import com.restfb.types.User;

//import com.restfb.types.MessageTag;
//import java.util.ArrayList;

public class Call {	
	//private List<MessageTag> m = new ArrayList<MessageTag>();
	
	// PER OGNI POST DELL'UTENTE SALVA IL MESSAGGIO IN v
	public User_Profile Leggi_Post(Vector<String> v, String token) {

		FacebookClient fbClient = new DefaultFacebookClient(token, Version.VERSION_7_0);
		Connection<Post> risultati = fbClient.fetchConnection("me/feed", Post.class);
		
		User_Profile obj_User_Profile=new User_Profile();
		User user = fbClient.fetchObject("me", User.class);
		obj_User_Profile.setUser_name(user.getName());
		
		
		for(List<Post> pagina : risultati ) {
			for(Post P : pagina) {
				if(P.getMessage()!=null) {
					v.add(P.getMessage());
					//this.m=P.getMessageTags();
				}
			}
		}
		return obj_User_Profile;
	}
	
	
	
	
	
	/*public List<MessageTag> getTags() {
		return this.m;
	}*/
}