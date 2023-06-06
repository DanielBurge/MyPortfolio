import java.util.HashMap;
public class IDandPasswords {
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	
	IDandPasswords(){
		
		
		logininfo.put("Dj", "gamer");
		logininfo.put("Daniel", "OMGITSYOU");
		logininfo.put("Shane", "abc123");
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
}
