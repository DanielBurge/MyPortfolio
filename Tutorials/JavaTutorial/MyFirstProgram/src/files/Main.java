package files;
import java.io.File;
public class Main {
	public static void main(String[] args) {
		
		File file = new File("\"C:\\Users\\dburg\\OneDrive\\Desktop\\secret_message.txt\"");
		
		if(file.exists()) {
			System.out.println("That file  exist");
			System.out.println(file.isFile());
		}
		else {
			System.out.println("That file does NOTTTT EXIST!!!!!!");
		}
	}
}
